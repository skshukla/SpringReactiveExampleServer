package com.sachin.work.pkg;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class MyController2 {

    @GetMapping("random")
    public String sample() {
        return UUID.randomUUID().toString();
    }
}