package com.rcp.restful_client.controller;

import com.rcp.restful_client.pojo.Greeting;
import com.rcp.restful_client.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @auther Stiles-JKY
 * @date 2020/9/10-23:43
 */
@RestController
public class PollingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/users/{nums}")
    public List<Greeting> getUsers(@PathVariable int nums) {
        List<Greeting> greetings = new ArrayList<>();
        for (int i = 0; i < nums; i++) {
            Greeting g = restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
            greetings.add(g);
        }
        return greetings;
    }
}
