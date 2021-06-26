package com.easy.archiecture.controller;

import com.easy.archiecture.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.Method;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @DubboReference(version = "1.0.0")
    private DemoService demoService;


    @RequestMapping("")
    public String demo() {
        return demoService.firstTestDubbo();
//        return "aaa";
    }
}
