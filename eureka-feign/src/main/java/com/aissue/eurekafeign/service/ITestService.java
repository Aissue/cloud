package com.aissue.eurekafeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider1")
public interface ITestService {
    @RequestMapping(value = "index")
    String test();
}
