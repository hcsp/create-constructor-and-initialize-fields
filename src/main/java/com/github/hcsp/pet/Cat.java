package com.github.hcsp.pet;

public class Cat {
    private String name;

    public Cat(String name) {
        this.name=name;

    }

    // Create a constructor here
    // 在这里创建一个构造器

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
