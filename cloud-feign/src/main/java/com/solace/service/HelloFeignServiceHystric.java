package com.solace.service;

import com.solace.service.HelloFeignService;
import org.springframework.stereotype.Component;

/**
 * Created by Solace on 2018/5/4.
 */
@Component
public class HelloFeignServiceHystric implements HelloFeignService{

    public String sayHiByFeignService(String name) {
        return "sorry server down";
    }
}
