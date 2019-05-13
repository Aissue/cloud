package com.aissue.eurekaprovider1.service.impl;

import com.aissue.eurekaprovider1.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class ITestServiceHystric implements ITestService {
    @Override
    public String test() {
        return "sorry...error...";
    }
}
