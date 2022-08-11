package com.demoapp.DeploymentTest.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Hello {

    @GetMapping
    private String springBootHello() {
        return "hello world.....";
    }


    @GetMapping("/world")
    private String springBootHelloWorld(){
        return "hello";
    }

    @GetMapping("/h")
    private String spring(){
        return "gh";
    }
}

