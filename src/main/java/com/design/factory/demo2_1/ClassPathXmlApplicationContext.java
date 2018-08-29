package com.design.factory.demo2_1;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/29
 * @Version:v1.0
 */
public class ClassPathXmlApplicationContext implements BeanFactory {
    private Map<String , Object> map = new HashMap<String, Object>();

    @Override
    public Object getBean(String id) throws ExecutionException {
        return map.get(id);
    }

    public ClassPathXmlApplicationContext(String fileName) throws Exception {
        //加载配置文件
        SAXReader reader = new SAXReader();
        Document document = reader.read(ClassPathXmlApplicationContext.class.getClassLoader().getResourceAsStream(fileName));

        //获取根节点
        Element rootElement = document.getRootElement();
        //获取子节点
        List<Element> elements = rootElement.elements();

        for (Element element : elements) {
            map.put(element.attributeValue("id"), Class.forName(element.attributeValue("class")).newInstance());
        }
    }
}

