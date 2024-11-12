package com.example.spring240924.dto.c34;

import lombok.Data;

@Data
public class Product {
  private Integer id; //String으로 해도 되지만 type 맞추는 걸 선호
  private String name;
  private Double price;
}
