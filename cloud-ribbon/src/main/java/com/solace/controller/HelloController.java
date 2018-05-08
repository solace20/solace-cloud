package com.solace.controller;

import com.solace.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Solace on 2018/5/4.
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping("hi")
    public String hi(@RequestParam String name){
        return helloService.hello(name);
    }

}
