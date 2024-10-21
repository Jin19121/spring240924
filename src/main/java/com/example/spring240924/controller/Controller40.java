package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c40.Mapper10;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main40")
public class Controller40 {
    private final Mapper10 mapper10;

    @GetMapping("sub1")
    public void method1() {
        System.out.println("두 개 값 모두");
        mapper10.select1("abc", "def");

        System.out.println("name만");
        mapper10.select1("abc", null);

        System.out.println("contact 만");
        mapper10.select1(null, "def");
    }
}
