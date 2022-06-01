package com.template.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class DadJokesController {
    @GetMapping("/api/dadjokes")
    public String dadJokes() {
        return "Justice is a dish best served cold, if it were served warm it would be just water.";
    }
}