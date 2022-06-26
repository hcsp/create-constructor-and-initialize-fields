package com.github.hcsp.pet;

public class Cat {
    private String name;

    // Create a constructor here
    public Cat(String name) {
       this.name = name;
    }

    @Override
    public String toString() {
        return "Cat(" + name + ")";
    }
}
