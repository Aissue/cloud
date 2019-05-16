package com.aissue.eurekaprovider1.controller;

import com.aissue.eurekaprovider1.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 */
@RestController
public class IndexController {

    @Autowired
    private ITestService testService;

    @Value("${server.port}")
    private String port;

    @RequestMapping("index")
    public String index(){
        return "provider2-->sucessful-->"+port;
    }

    @RequestMapping("test")
    public String test(){
        return  testService.test();
    }

}
