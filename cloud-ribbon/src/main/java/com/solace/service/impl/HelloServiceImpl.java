package com.solace.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.solace.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Solace on 2018/5/4.
 */
@Service
public class HelloServiceImpl implements HelloService{
    @Autowired(required = false)
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "helloFailed")
    public String hello(String name) {
        return restTemplate.getForObject("http://SPRING-CLOUD-PRODUCER/hello?name="+name,String.class);
    }

    /**
     * 服务降级
     * @param name
     * @return
     */
    public String helloFailed(String name){
        return "server say error";
    }
}
