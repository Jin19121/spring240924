package com.example.spring240924.controller.dto.c34;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Employee {
    private String lName;
    private String fName;
    private LocalDate birth;
}
