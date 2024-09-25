package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("main8")
public class Controller08 {

    @RequestMapping("sub1")
    public String sub1(Model model) {
        //1. 요청 분석/가공
        //2. 비즈니스 로직 실행
        //3. Model에 일한 결과 넣고 (넣은 값: attribute) -> today!
        model.addAttribute("result", "Hello World");

        //4. view로 포워딩
        return null;
    }

    // model에 address라는 이름의 "서울" 값(attribute) 넣고 디폴트 jsp포워드
    @RequestMapping("sub2")
    public String sub2(Model model) {
        model.addAttribute("address", "서울");
        model.addAttribute("email", "naver");

        // attribute는 아무것이나 넣을 수 있다 (Object type)
        model.addAttribute("age", 44);
        model.addAttribute("point", 4.1234);
        model.addAttribute("married", true);
        model.addAttribute("some1", List.of("java", "css"));
        model.addAttribute("some2", Set.of("java", "jsp"));
        model.addAttribute("some3", Map.of("java", "me"));

        //주로 사용하는 데이터형:
        // String, 기본타입(Wrapper), 배열, List, Map, JavaBeans

        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {
        //배열
        model.addAttribute("langs", new String[] {"java", "css"});
        return null;
    }

    @RequestMapping("sub4")
    public String sub4(Model model) {
        model.addAttribute("countries", new String[] {"korea", "japan", "germany"});
        model.addAttribute("islands", new String[] {"제주도", "울릉도", "독도"});
        model.addAttribute("points", new double[] {3.14, 9.4312, 8.7972});

        return null;
    }

    @RequestMapping("sub5")
    public void sub5(Model model) {
        model.addAttribute("names", new String[] {"DK", "민규"});
        model.addAttribute("classes", new String[] {"자바", "react"});
        model.addAttribute("address", "신촌");
    }

    @RequestMapping("sub6")
    public String sub6(Model model) {
        // attribute에 List 넣기
        model.addAttribute("names", List.of("도겸", "민규", "명호"));
        return null;
    }

    @RequestMapping("sub7")
    public String sub7(Model model) {
        model.addAttribute("jobs", List.of("의사", "개발자", "강사"));
        model.addAttribute("pointList", List.of(4, 2, 1));
        return null;
    }//이거 다른 (원래) 표현 한번 찾아보기

    @RequestMapping("sub8")
    public String sub8(Model model) {
        model.addAttribute("students", List.of("승관", "중찬", "한솔"));
        model.addAttribute("num", 0);
        model.addAttribute("index", "1");
        model.addAttribute("point", "2");

        return null;
    }

    @RequestMapping("sub9")
    public String sub9(Model model) {
        model.addAttribute("people", List.of("donald", "Yamaha", "harris", "biden"));
        model.addAttribute("addresses", List.of("ny", "la"));
        model.addAttribute("zero", 0);
        model.addAttribute("one", 1);
        model.addAttribute("second", 2);
        model.addAttribute("next", 3);
        return null;
    }
}
