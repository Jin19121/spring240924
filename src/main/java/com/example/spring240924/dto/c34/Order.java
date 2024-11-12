package com.example.spring240924.dto.c34;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Order {
  private LocalDate date;
  private String client;
}
