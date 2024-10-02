package com.example.spring240924.controller.dto.c21;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class MyBean8 {
    private String userName;
    private Integer age;
    private List<String> foodList;
    private LocalDate startDate;
    private Boolean expired;
    private Double score;
}
