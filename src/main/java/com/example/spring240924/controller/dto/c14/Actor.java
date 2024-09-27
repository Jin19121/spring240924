package com.example.spring240924.controller.dto.c14;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Actor {
    private String name;
    private String agency;
    private String birth;
    private String MBTI;
    private List<String> works;
}
