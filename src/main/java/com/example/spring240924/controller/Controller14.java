package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c14.Actor;
import com.example.spring240924.controller.dto.c14.Book;
import com.example.spring240924.controller.dto.c14.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main14")
public class Controller14 {
    @RequestMapping("sub1")
    public void sub1(Model model) {
        model.addAttribute("list", List.of(
                new Book("java", "shin", "한빛", 1000, 50000),
                new Book("git", "linus", "scm", 200, 30000),
                new Book("react", "adam", "meta", 450, 40000),
                new Book("vue", "captain", "apple", 300, 35000)
        ));//JavaBeans 확인
        model.addAttribute("members", List.of(
                new Member("홍민", 183, 78, "07/28", "토트넘", "MF"),
                new Member("강인", 174, 72, "02/19", "파리", "MF"),
                new Member("현우", 189, 75, "05/18", "울산", "GK"),
                new Member("도겸", 179, 65, "02/18", "용인", "MV")
        ));
    }

    @RequestMapping("sub2")
    public void sub2(Model model) {
        model.addAttribute("actor",
                new Actor("이정재", "컴퍼니", "12/15", "ENFJ",
                        List.of("오징어 게임", "신세계", "관상", "스타워즈")));

        model.addAttribute("actorList", List.of(
                new Actor("lee", "com1", "01/02", "ISFJ",
                        List.of("a", "b", "c")),
                new Actor("kim", "com2", "06/05", "ESFJ",
                        List.of("abc", "bcd", "run")),
                new Actor("choi", "JYP", "03/19", "ESFP",
                        List.of("abc", "bcd", "run")),
                new Actor("Park", "Egg", "08/21", "ENTJ",
                        List.of("탈출", "조선", "Exit")),
                new Actor("DK", "Pledis", "02/18", "INFP",
                        List.of("고잉레인저", "엑스칼리버", "Follow Again"))
        ));
    }
}
