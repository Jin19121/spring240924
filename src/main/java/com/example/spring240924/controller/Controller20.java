package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
