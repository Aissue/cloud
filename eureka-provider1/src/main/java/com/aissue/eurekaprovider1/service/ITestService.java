package com.aissue.eurekaprovider1.service;

import com.aissue.eurekaprovider1.service.impl.ITestServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "provider1",fallback = ITestServiceHystric.class)
public interface ITestService {
    @RequestMapping(value = "index")
    String test();
}
