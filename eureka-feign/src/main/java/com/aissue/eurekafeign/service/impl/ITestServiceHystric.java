package com.aissue.eurekafeign.service.impl;

import com.aissue.eurekafeign.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class ITestServiceHystric implements ITestService {
    @Override
    public String test() {
        return "sorry...error...";
    }
}
