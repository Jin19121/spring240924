package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controller03 {

    // /main3/syb1?name=son
    @RequestMapping("/main3/sub1")
    public void method1(@RequestParam(name = "name") String param){ //이 param에 name의 값을 준다
        System.out.println("name = " + param);
        System.out.println("Controller03.sub1");
    }

    // ?address=seoul
    @RequestMapping("/main3/sub2")
    public void method2(@RequestParam(value = "address") String param){ //value 생략 가능
        System.out.println("param = " + param);
    }
//?? 순서 어짜다 밀렸니
    // ?address-seoul
    @RequestMapping("/main3/sub4")
    public void method4(@RequestParam("address") String param){ //value 생략 가능
        System.out.println("param = " + param);
    }

    // main3/sub5?email=gmail&location=us
    @RequestMapping("/main3/sub5") //request handler method
    public void method5(@RequestParam("email") String param1, //String param => arguement라 표현
                        @RequestParam("location") String param2){
        System.out.println("param1 = " + param1);
        System.out.println("param2 = " + param2);
    }

    // ?email=yahoo => param1에 yahoo가 들어감
    @RequestMapping("/main3/sub6")
    public void method6(String email){
        //method arguement의 이름이 request parameter와 같을 때 request parameter의 이름 생략 가능
        System.out.println("param1 = " + email);
    }
    
    //sub7?address=seoul
    // : seoul 출력 + @RequestParam 어노테이션과 value 속성 값 명시
    @RequestMapping("/main3/sub7")
    public void method7(@RequestParam("address") String param){
        System.out.println("param = " + param);
    }
    
    // sub8?address=seoul
    // @RequestParam 명시 + value 속성값 생략
    @RequestMapping("/main3/sub8")
    public void method8(@RequestParam String address){
        System.out.println("address = " + address);
    }
    
    // sub9?address=seoul
    // @RequestParam 어노테이션 생략
    @RequestMapping("/main3/sub9")
    public void method9(String address){
        System.out.println("address = " + address);
    }
}
