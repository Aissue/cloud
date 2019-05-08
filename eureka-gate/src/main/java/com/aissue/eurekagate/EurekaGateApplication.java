package com.aissue.eurekagate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class EurekaGateApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGateApplication.class, args);
    }

}
