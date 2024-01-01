package com.davv.demosv.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class HelloWorldControllerTest {

    @Test
    void helloTest() {
        HelloWorldController controller = new HelloWorldController();
        assertEquals("Hello there!", controller.hello().getBody());
    }
}
