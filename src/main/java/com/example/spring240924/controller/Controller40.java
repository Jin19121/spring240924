package com.example.spring240924.controller;

import com.example.spring240924.mapper.Mapper10;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@RequestMapping("main40")
public class Controller40 {
    private final Mapper10 mapper10;

    @GetMapping("sub1")
    public void method1() {
        System.out.println("두 개 값 모두");
        mapper10.select1("abc", "def");

        System.out.println("name 만");
        mapper10.select1("abc", null);

        System.out.println("contact 만");
        mapper10.select1(null, "def");
    }

    @GetMapping("sub2")
    public void method2() {
        System.out.println("모두");
        mapper10.select2("abc", "def");
        System.out.println("first");
        mapper10.select2("abc", null);
        System.out.println("second");
        mapper10.select2(null, "def");
    }

    @GetMapping("sub3")
    public void method3() {
        mapper10.select3("abc", "def");
        mapper10.select3("abc", null);
        mapper10.select3(null, "def");
        mapper10.select3(null, null);
    }

    @GetMapping("sub4")
    public void method4() {
        mapper10.select4("abc", "def");
        mapper10.select4("abc", null);
        mapper10.select4(null, "def");
        mapper10.select4(null, null);
    }

    @GetMapping("sub5")
    public void method5() {
        mapper10.select5(List.of("germany", "usa", "uk"));
        mapper10.select5(List.of("germany", "usa"));
        mapper10.select5(List.of("germany"));
    }

    @GetMapping("sub6")
    public void method6() {
        mapper10.select6(List.of("seoul", "busan", "jeju"));
        mapper10.select6(List.of("seoul", "busan"));
        mapper10.select6(List.of("seoul"));
    }

}
