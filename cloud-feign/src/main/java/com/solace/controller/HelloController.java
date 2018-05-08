package com.solace.controller;

import com.solace.service.HelloFeignService;
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
    private HelloFeignService helloFeignService;

    @GetMapping("hello")
    public String sayHi(@RequestParam String name){
        return helloFeignService.sayHiByFeignService(name);
    }
}
