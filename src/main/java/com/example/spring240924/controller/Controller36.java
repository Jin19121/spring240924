package com.example.spring240924.controller;

import com.example.spring240924.mapper.Mapper06;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main36")
@RequiredArgsConstructor
public class Controller36 {
    final Mapper06 mapper06;

    @GetMapping("sub1")
    public void sub1() {
        String name = mapper06.select01(1);
        System.out.println("name = " + name);

        System.out.println(mapper06.select01(2));
        System.out.println(mapper06.select01(3));
        System.out.println(mapper06.select01(4));

        System.out.println();

        String product1 = mapper06.select02(1);
        System.out.println("product 1 = " + product1);
        System.out.println(mapper06.select02(5));
    }

    @GetMapping("sub2")
    public void sub2() {
        List<String> list = mapper06.select03("Germany", "USA");
        list.forEach(System.out::println);

        System.out.println();
        List<String> l = mapper06.select04(50, 200);
        l.forEach(System.out::println);

        System.out.println();
        List<String> d = mapper06.select05("1955-01-01", "2000-01-01");
        d.forEach(System.out::println);

        System.out.println();
        List<String> c = mapper06.select06("london", "Berlin");
        c.forEach(System.out::println);
    }

    @GetMapping("sub3")
    public void sub3(Integer id) {
        String name = mapper06.select01(id);
        System.out.println("name = " + name);
    }

    @GetMapping("sub4")
    public void sub4(String coun1, String coun2) {
        List<String> name = mapper06.select03(coun1, coun2);
        System.out.println("name = " + name);
    }
}
