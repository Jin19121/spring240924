package com.example.spring240924.service;

import com.example.spring240924.dto.c39.Mapper09;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class Service01 {
  private final Mapper09 mapper09;

  public void transferMoney(Integer money) {
    mapper09.updateMoney1(money);
    mapper09.updateMoney2(money);
  }

  public void transferMoney2(Integer money) {
    mapper09.updateMoney1(money);
    int a = 0; //runtime exception
    int b = 5 / a;
    mapper09.updateMoney2(money);
  }

  public void transferMoney3(Integer money) throws ClassNotFoundException {
    mapper09.updateMoney1(money);
    Class.forName("j.l.String");
    mapper09.updateMoney2(money);
  }


  public void transferMoney4(Integer money) {
    mapper09.updateMoney1(money);
    try {
      Class.forName("j.l.String");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
      //e.getException 하지 않아도
      // spring이 받아서 예외 경로를 알아서 보여준다.
    }
    mapper09.updateMoney2(money);
  }
}
