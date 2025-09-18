package com.example.mySpringProject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/helloworld")
    public String helloWorld() {
        return "Hello World!";
    }
    @GetMapping("/{hero}")
    public String heroPage(RequestParam String hero) {
        return "This is page " + hero;
    }
}
