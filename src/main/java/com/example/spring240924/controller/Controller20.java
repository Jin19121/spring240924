package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.util.Arrays;

@Controller
@RequestMapping("main20")
public class Controller20 {
    @RequestMapping("sub1")
    public void sub1() {
    }

    @RequestMapping("sub2")
    public void sub2(String name,
                     String pw,
                     String note) {
        System.out.println("name = " + name);
        System.out.println("pw = " + pw);
        System.out.println("note = " + note);
    }

    @RequestMapping("sub3")
    public void sub4(String[] sel,
                     LocalDate birth,
                     Integer age) {
        System.out.println("select = " + Arrays.toString(sel));
        System.out.println("birth = " + birth);
        System.out.println("age = " + age);
    }

    //    @RequestMapping("sub4", method= RequestMethod.GET)
    @GetMapping("sub4")
    public void get4() {
        System.out.println("get 전송 방식");
    }

    //    @RequestMapping("sub4", method= RequestMethod.POST)
    @PostMapping("sub4")
    public void get4() {
        System.out.println("post 전송 방식");
    }

    //연습
    @GetMapping("sub5")
    public void get5() {
    }

    @PostMapping("sub5")
    public void get5() {
    }

}
