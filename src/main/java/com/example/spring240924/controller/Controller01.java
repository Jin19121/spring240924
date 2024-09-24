package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controller01 {

    @RequestMapping(path = "/main1/sub1")
    public void method1(){
        System.out.println("Controller01.method1");
    }

    @RequestMapping(value="/main1/sub2")
    public void method2(){
        System.out.println("Controller01.method2");
    }

    //localhost:8080/main1/some1
    @RequestMapping("/main1/some1")
    public void method3(){
        System.out.println("Controller01.method3");
    }
}
