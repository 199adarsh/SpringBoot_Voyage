package com.hello.helloworld;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Greet {


    @RequestMapping("/ ")
    public String greet(){
        return "Hello World, Welcome to Spring Boot";
    }
}
