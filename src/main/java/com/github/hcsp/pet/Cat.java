package com.github.hcsp.pet;

import javax.xml.namespace.QName;

public class Cat {
    private String name;       // 成员变量

    // Create a constructor here
    // 在这里创建一个构造器
    public Cat(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
