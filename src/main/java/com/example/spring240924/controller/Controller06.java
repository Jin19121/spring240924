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

    // 요청: /main6/sub2
    @RequestMapping("sub2")
    public String method2(){ //어 뭐라고? 왜 스트링이라고?
        //1. 요청 정보 분석/가공 (yesterday~)
        //2. 비즈니스 로직 실행 (someday)
        //3. 응답 (html) <- today!

        // 앞에 prefix /WEB-INF/view
        // 뒤에 suffix .jsp
        return "world"; //return한 값을 view의 이름으로 인식

        //최종 jsp위치: /WEB-INF/view/world.jsp
    }

    @RequestMapping("sub3")
    public String method3(){

        // /WEB-INF/view/hello.jsp를 불러온다.
        return "hello";
    }

    // sub4으로 요청왔을 때 /WEB-INF/view/hi.jsp의 내용이 응답
    @RequestMapping("sub4")
    public String method4(){
        return "hi";
    }

    // main6/sub5
    @RequestMapping("sub5")
    public String method5(){

        //jsp의 위치는 요청 경로와 같은 경우가 많음
        // view/main6/sub5.jsp
        return "/main6/sub5";
    }

    // main6/sub6
    @RequestMapping("sub6")
    public String method6(){

        // null을 리턴하면 요청경로와 같은 view로 결정
        // view/main6/sub6.jsp
        return null;
    }

    // main6/sub7
    @RequestMapping("sub7")
    public void method7(){
        // return이 void면 요청경로와 같은 view로 결정
        // view/main6/sub7.jsp
    }

    @RequestMapping("sub8")
    public void method8(){}

}
