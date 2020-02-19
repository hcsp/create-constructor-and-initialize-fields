package com.github.hcsp.pet;

public class Cat {
    private String name;

    public  Cat (String name){ //构造器获取到name的值

        this.name=name;//把获取到的name的值赋给Cat类的name
    };


    // Create a constructor here
    // 在这里创建一个构造器

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
