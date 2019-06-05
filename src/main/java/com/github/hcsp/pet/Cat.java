package com.github.hcsp.pet;

public class Cat {
    // 静态成员变量，不和任何的对象绑定
    private String name;

    // Create a constructor here
    // 在这里创建一个构造器 constructor
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
