package com.example.spring240924.dto.c12;

import lombok.Data;

@Data
//Data: Getter, Setter, ToString, EqualsAndHashCode, RequiredArgsConstructor
public class Car {
  private String make;
  private String model;
  private int year;
}
