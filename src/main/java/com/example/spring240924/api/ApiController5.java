package com.example.spring240924.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api/main5")
public class ApiController5 {
  @GetMapping("sub1")
  @ResponseBody
  public String sub1() {
    System.out.println("ApiController5.sub1");
    return "sub1";
  }
}
