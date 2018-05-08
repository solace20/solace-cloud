package com.solace.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Solace on 2018/5/4.
 */
@FeignClient(value = "SPRING-CLOUD-PRODUCER",fallback = HelloFeignServiceHystric.class)
public interface HelloFeignService {
    @GetMapping("/hello")
    String sayHiByFeignService(@RequestParam("name") String name);
}
