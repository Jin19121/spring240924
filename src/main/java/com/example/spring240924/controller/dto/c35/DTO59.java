package com.example.spring240924.controller.dto.c35;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class DTO59 {
    private Integer studentId;
    private Integer modelNumber;
    private String productName;
    private LocalDate birthDate;
    private LocalDateTime inserted;
    private Double score;
}
