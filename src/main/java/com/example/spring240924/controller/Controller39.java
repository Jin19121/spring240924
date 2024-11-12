package com.example.spring240924.controller;

import com.example.spring240924.service.Service01;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("main39")
public class Controller39 {
  //    private final Mapper09 mapper09;
  private final Service01 service01;

  @GetMapping("sub1")
  public void method1(Integer money) {
//        mapper09.updateMoney1(money);
//        int a = 0;
//        int b = 5 / a;
//        mapper09.updateMoney2(money);
    service01.transferMoney(money);
  }

  @GetMapping("sub2")
  public void method2(Integer money) {
    service01.transferMoney2(money); //exception
  } //rollback 성공

  //checked exception : rollback 실패
  @GetMapping("sub3")
  public void method3(Integer money) throws ClassNotFoundException {
    service01.transferMoney3(money);
  }

  //
  @GetMapping("sub4")
  public void method4(Integer money) {
    service01.transferMoney4(money);
  }
}

