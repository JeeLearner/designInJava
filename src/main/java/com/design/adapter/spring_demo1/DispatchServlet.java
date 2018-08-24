package com.design.adapter.spring_demo1;

import com.design.adapter.spring_demo1.adaptee.Controller;
import com.design.adapter.spring_demo1.adaptee.HttpController;
import com.design.adapter.spring_demo1.adaptee.SimpleController;
import com.design.adapter.spring_demo1.adapter.AnnotationHandlerAdapter;
import com.design.adapter.spring_demo1.adapter.HttpHandlerAdapter;
import com.design.adapter.spring_demo1.adapter.SimpleHandlerAdapter;
import com.design.adapter.spring_demo1.target.HandlerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟一个DispatchServlet
 * @auther: lyd
 * @date: 2018/8/24 9:45
 */
public class DispatchServlet {

    public static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet(){
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
        handlerAdapters.add(new AnnotationHandlerAdapter());
    }

    public void doDispatch(){

        //此处模拟SpringMVC从request取handler的对象，仅仅new出，可以出，
        //不论实现何种Controller，适配器总能经过适配以后得到想要的结果
//      HttpController controller = new HttpController();
//      AnnotationController controller = new AnnotationController();
        SimpleController controller = new SimpleController();
        //得到对应适配器
        HandlerAdapter handler = getHandler(controller);
        //通过适配器执行对应的controller对应方法
        handler.handle(controller);
    }


    public HandlerAdapter getHandler(Controller controller){
        for (HandlerAdapter handlerAdapter : handlerAdapters) {
            if (handlerAdapter.supports(controller)){
                return handlerAdapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}

