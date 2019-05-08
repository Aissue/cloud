package com.aissue.eurekafeign.web;


import com.aissue.eurekafeign.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private ITestService testService;

    @Value("${spring.application.name}")
    private  String SERVICE_NAME;

    @RequestMapping("test")
    public String test(){
        return  testService.test();
    }

    @RequestMapping("name")
    public String a_test(){
        return "This is "+SERVICE_NAME+" resp...";
    }
}
