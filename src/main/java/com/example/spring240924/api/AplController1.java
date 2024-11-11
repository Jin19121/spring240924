package com.example.spring240924.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping("/api/main1")
@Controller
public class AplController1 {
  @PostMapping("sub1")
  public void sub1() {
    System.out.println("/api/main1/sub1으로 요청 옴");
  }

  //  @RequestBody : JSON -> Map(javaBeans)로 파싱해줌
  @PostMapping("sub2")
  public void sub2(@RequestBody Map<String, Object> map) {
    System.out.println(map);
    System.out.println("AplController1.sub2");
  }

  @PostMapping("sub3")
  public void sub3(@RequestBody Map<String, Object> map) {
    System.out.println(map);
  }
}
