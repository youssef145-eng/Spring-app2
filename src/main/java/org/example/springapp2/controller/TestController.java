package org.example.springapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/print")
    public String print() {

        return "Hello World";
    }
    @GetMapping("/search")
    public String Search(@RequestParam String name, @RequestParam int age) {

        return "Hello "+name+" "+age;
    }
}
