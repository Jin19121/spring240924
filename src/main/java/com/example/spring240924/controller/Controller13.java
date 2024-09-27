package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main13")
public class Controller13 {

    @RequestMapping("sub1")
    public String method1(Model model) {
        model.addAttribute("attr1", "hello model attribute");
        return null;
    }

    @RequestMapping("sub2")
    public void method2(Model model) {
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
    }

    @RequestMapping("sub5")
    public void method5(Model model) {
    }

    @RequestMapping("sub6")
    public void method6(Model model) {
        model.addAttribute("products", List.of("2컷포토", "티셔츠", "후드집업"));
        model.addAttribute("members", List.of("도겸", "민규", "명호", "호시", "우지"));
        model.addAttribute("cityList", List.of("서울", "제주", "부산", "London", "LA"));
    }

    @RequestMapping("sub7")
    public void method7(Model model) {
        model.addAttribute("people",
                Map.of("Kim", "seoul",
                        "lee", "busan",
                        "choi", "jeju",
                        "Park", "ulsan"));
        model.addAttribute("players",
                Map.of("Kim", "민규",
                        "lee", "DK",
                        "choi", "Cheol",
                        "Boo", "Kwan"));
        model.addAttribute("food",
                Map.of("초콜렛", "가나",
                        "탄산", "코카콜라",
                        "버거", "빅맨",
                        "피자", "하와이안"));
    }

    @RequestMapping("sub8")
    public void method8(Model model) {
        model.addAttribute(
                "datas",
                List.of(Map.of(
                        "marvel", "avengers",
                        "dc", "batman",
                        "sony", "spiderman"
                ), Map.of(
                        "musical", "레드북",
                        "darama", "스물다섯, 스물하나",
                        "film", "소울"
                )));

        model.addAttribute("players",
                List.of(Map.of(
                                "손흥민", "공격수",
                                "이강인", "미드필더",
                                "김민재", "수비수"
                        ), Map.of(
                                "해리 케인", "공격",
                                "포든", "미드필더",
                                "조던", "골키퍼 ")
                ));
    }

    @RequestMapping("sub9")
    public void method9(Model model) {
        model.addAttribute("data",
                Map.of("foods", List.of("피자", "버거", "국반", "파전"),
                        "drinks", List.of("아메", "모카", "라떼")));
        model.addAttribute("movies",
                Map.of("marvel", List.of("ironmen", "captain", "wakanda"),
                        "dc", List.of("batman", "superman", "wing")));

    }
}
