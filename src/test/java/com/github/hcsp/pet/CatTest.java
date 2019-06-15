package com.github.hcsp.pet;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catConstructorTest() {
        Assertions.assertEquals("Cat(Tom)", new Cat("Tom").toString());
    }
}
