package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static java.lang.StringTemplate.STR;

@Controller
@RequestMapping("main6")
public class Controller06 {

    @RequestMapping("sub1")
    @ResponseBody
    public String sub1(String search){
        String result = search + "(을/를) 검색한 결과";

        String html = STR."""
                <html>
                    <body>
                        <p>
                            \{result}
                        </p>
                    </body>
                </html>
                """;
        return html;
    }

    @RequestMapping("sub2")
    public String method2(){ //어 뭐라고? 왜 스트링이라고?
        //1. 요청 정보 분석/가공 (yesterday~)
        //2. 비즈니스 로직 실행 (someday)
        //3. 응답 (html) <- today!
        return "abc"; //return한 값이 view의 이름으로 인식

        //최종 jsp위치: /WEB-INF/view/world.jsp
    }
}
