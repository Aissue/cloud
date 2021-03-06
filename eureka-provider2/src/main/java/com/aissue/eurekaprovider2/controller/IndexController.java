package com.aissue.eurekaprovider2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("index")
    public String index(){
        return "provider2-->sucessful-->"+port;
    }

}
