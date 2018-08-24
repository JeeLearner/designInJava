package com.design.builder.demo2_1;

/**
 * @Description:
 * @Auther: lyd
 * @Date: 2018/8/24
 * @Version:v1.0
 */
public class Square {

    private int color;
    private int borderSize;
    //private 让外部无法直接创建
    private Square(Builder builder){
        this.color = builder.color;
        this.borderSize = builder.borderSize;
    }

    public void getColor(){
        System.out.println("输出color：" + this.color);
    }

    public static class Builder {
        private int color;
        private int borderSize;

        public Builder setColor(int color) {
            this.color = color;
            return this;
        }
        public Builder setBorderSize(int borderSize) {
            this.borderSize = borderSize;
            return this;
        }
        public Builder setBorderColor(int color){
            //......
            return this;
        }
        public Builder setPadding(int left, int top, int right, int bottom) {
            //......
            return this;
        }

        public Square build(){
            //...检查参数之间的关系是否设置正确...
            return new Square(this);
        }
    }

}

