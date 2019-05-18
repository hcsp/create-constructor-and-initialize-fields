package com.github.hcsp.pet;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catConstructorTest() {
        assertEquals("Cat(Tom)", new Cat("Tom").toString());
    }
}
