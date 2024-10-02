package com.example.spring240924.controller.dto.c21;

import lombok.Data;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;

@Data
public class MyBean4 {
    private String address;
    private Integer age;
    private LocalDate birth;
}
