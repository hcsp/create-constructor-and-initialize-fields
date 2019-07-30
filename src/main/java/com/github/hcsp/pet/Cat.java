package com.github.hcsp.pet;

public class Cat {
    private String name;

    // Create a constructor here
    // 在这里创建一个构造器
    public Cat(String name){
        // 构造器里，给实例设置name,为传入的name
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
