package com.example.spring240924.dto.c21;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class MyBean8 {
//    public MyBean8() {}

  public MyBean8(String userName) {
    this.userName = userName;
  }

  public MyBean8(String userName, Integer age, Double score) {
    this.userName = userName;
    this.age = age;
    this.score = score;
  }

  private String userName;
  private Integer age;
  private List<String> foodList;
  private LocalDate startDate;
  private LocalDateTime endDate;
  private Boolean expired;
  private Double score;
}
