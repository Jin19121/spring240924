package com.example.spring240924.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/api/main5")
public class ApiController5 {
  @GetMapping("sub1")
  @ResponseBody
  public String sub1() {
    System.out.println("ApiController5.sub1");
    return "sub1";
  }

  @GetMapping("sub3")
  @ResponseBody
  public String sub3() {
    return "seoul";
  }

  @GetMapping("sub4")
  @ResponseBody
  public Map<String, Object> sub4() {
    return Map.of("name", "kim", "age", 28);
  }

  @GetMapping("sub5")
  @ResponseBody
  public Map<String, Object> sub5() {
    return Map.of("title", "도겸 시점", "content", "street photos", "price", 45000, "available", false);
  }

}
