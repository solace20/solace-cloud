package com.solace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created by Solace on 2018/5/3.
 */
@SpringBootApplication
@EnableEurekaClient
public class CloudProducerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudProducerApplication.class,args);
    }
}
