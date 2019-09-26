package com.github.hcsp.pet;

public class Cat {
    private String name;

    // Create a constructor here
    // 在这里创建一个构造器\
    public Cat(String name){
        //this指的是该类里面的name，name是这个传入的参数
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
