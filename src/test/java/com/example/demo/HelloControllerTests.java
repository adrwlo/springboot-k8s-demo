package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HelloControllerTests {
    @Test
    void testDummy() {
        assertEquals(2, 1 + 1);
    }
}
