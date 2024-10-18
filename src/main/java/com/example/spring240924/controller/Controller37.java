package com.example.spring240924.controller;

import com.example.spring240924.mapper.Mapper07;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main37")
public class Controller37 {
    final Mapper07 mapper07;

    @GetMapping("sub1")
    public void sub1(Integer id) {
        int cnt = mapper07.delete1(id);
        System.out.println(cnt + "개 행 삭제됨");
    }

    @GetMapping("sub2")
    public void sub2(Integer id) {
        int process = mapper07.delete2(id);
        System.out.println(process);
    }

    @GetMapping("sub3")
    public void sub3(String name,
                     String city,
                     String country) {
        name = "son";
        city = "seoul";
        country = "korea";

        int cnt = mapper07.insert1(name, city, country);
        System.out.println("cnt = " + cnt + "명의 정보 수정");
    }

    @GetMapping("sub4")
    public void sub4(String name, Double price) {
        name = "photocard";
        price = 20.00;

        int result = mapper07.insert2(name, price);
        System.out.println("result = " + result);
    }


}
