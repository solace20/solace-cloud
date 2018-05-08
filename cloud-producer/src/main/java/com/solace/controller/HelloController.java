package com.solace.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Solace on 2018/5/4.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String index(@RequestParam String name){
        return "hello"+name;
    }
}
