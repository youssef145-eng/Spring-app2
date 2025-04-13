package org.example.springapp2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @GetMapping("/print")
    public String print() {

        return "Hello World";
    }
    @GetMapping("/search")
    public String Search(@RequestParam String name, @RequestParam int age
    ,@RequestParam(required =false,name = "gen") String gender) {

        return "Hello "+name+" "+age+" "+gender;
    }
    @GetMapping("/testpath/{name}/{age}/{gender}")
    public String testpath(@PathVariable String name, @PathVariable int age,
                           @PathVariable String gender) {

        return "name: "+name+"   age:"+age+"  gender: "+gender;
    }
}
