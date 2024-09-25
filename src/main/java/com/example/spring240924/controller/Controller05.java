package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("main5")
public class Controller05 {
    //?name=son&address=seoul
    @RequestMapping("sub1")
    public void sub1(@RequestParam("name") String p1,
                     @RequestParam("address") String p2) {
        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);
    }

    @RequestMapping("sub2")
    public void sub2(@RequestParam String name,
                     @RequestParam String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    @RequestMapping("sub3")
    public void sub3(String name,
                     String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    @RequestMapping("sub4")
    public void sub4(@RequestParam(required = false) String name,
                     @RequestParam(required = false) String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    // ?name=hong&address=London
    // ?address=jeju
    // ?name=kang
    // sub5
    @RequestMapping("sub5")
    public void sub5(@RequestParam(defaultValue = "게스트") String name,
                     @RequestParam(defaultValue = "서울역") String address) {
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    //sub6?name=손&age=33&score=3.1&num=55&point=29.134
    //sub6?age=33&score=3.1&num=55&point=99.1583
    //sub6?score=3.1&num=55&point=99.1583 -> primitive type이 없음 -> exception
    @RequestMapping("sub6")
    public void sub6(String name,
                     int age,
                     double score,
                     Integer num,
                     Double point) {
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("score = " + score);
        System.out.println("num = " + num);
        System.out.println("point = " + point);
    }

    //같은 parameter에 여러개의 값
    // /sub7?email=gmail
    // /sub7?email=gmail&email=yahoo
    @RequestMapping("sub7")
    public void sub7(String[] email) {
        System.out.println("email = " + Arrays.toString(email));
    }

    // sub8?hobby=축구&hobby=야구&hobby=농구&name=kang&address=seoul&point=7.123&age=55
    @RequestMapping("sub8")
    public void sub8(String[] hobby,
                     String name,
                     String address,
                     double point,
                     Integer age) {
        System.out.println("hobby = " + Arrays.toString(hobby));
        System.out.println("name = " + name);
        System.out.println("address = " + address);
        System.out.println("point = " + point);
        System.out.println("age = " + age);
    }
}

