package com.example.spring240924.dto.c21;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class MyBean5 {
  //    private String[] select;
  private List<String> select; //method argument에 쓰면 안됨
  private LocalDateTime now;
  private String note;
  private String id;
}
