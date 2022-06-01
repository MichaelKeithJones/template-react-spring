package com.template;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String getHelloWorld() {
        return "Hello World!";
    }

}