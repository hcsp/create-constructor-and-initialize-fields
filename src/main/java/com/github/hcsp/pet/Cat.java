package com.github.hcsp.pet;

public class Cat {
    private String b;
    public Cat(String a) {
        b = a;
    }

    // Create a constructor here
    // 在这里创建一个构造器

    @Override
    public String toString() {
        return "Cat(" + b + ")";
    }
}
