package com.springdeploy.spring_deploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${app.message}")
    String message;


    @GetMapping("/api/hello")
    public String hello() {
        System.out.println(message);
        return "Hello world";
    }
}
