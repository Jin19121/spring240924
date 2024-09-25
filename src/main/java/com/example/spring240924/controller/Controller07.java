package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.WebRequest;

@Controller
@RequestMapping("main7")
public class Controller07 {

    @RequestMapping("sub1")
    public void sub1(WebRequest request){

        request.setAttribute("data","DK", RequestAttributes.SCOPE_REQUEST);
        // /WEB-INF/view/main7/sub1.jsp로 request forwarding
    }

    @RequestMapping("sub2")
    public void sub2(Model model){
        model.addAttribute("person", "DK");
    }
}
