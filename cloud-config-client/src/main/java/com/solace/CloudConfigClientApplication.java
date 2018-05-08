package com.solace;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Solace on 2018/5/4.
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
@RefreshScope
public class CloudConfigClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudConfigClientApplication.class,args);
    }

    @Value("${solace.foo}")
    String host;


    @GetMapping("/hello")
    public String hello(){
        return host;
    }

}
