package com.rcp.restful_server.controller;

import com.rcp.restful_server.pojo.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @auther Stiles-JKY
 * @date 2020/9/10-21:45
 */
@RestController
public class SimpleRestController {
    private static final String template = "Hello,%s";
    private final AtomicInteger COUNTER = new AtomicInteger();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(COUNTER.incrementAndGet(), String.format(template, name));
    }
}
