package com.easy.archiecture.service;

import org.apache.dubbo.config.annotation.DubboService;

@DubboService(version = "1.0.0")
public class DemoServiceImpl implements DemoService {
    @Override
    public String firstTestDubbo() {
        return "first hello";
    }
}
