package com.example.spring240924.dto.a2;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class Player {
  private String name;
  private Integer age;
  private boolean married;
  private List<String> item;
  private Map<String, Object> team;
}
