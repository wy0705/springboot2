package com.easy.archiecture.controller;

import com.easy.archiecture.entity.Demo;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    //    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    @GetMapping(value = "/hello")
    public String index() {
        return "Hello World";
    }


    @PostMapping(value = "/hello2")
    public Demo index(Demo user) {
        System.out.println(user.getAge());
        return user;
    }

}