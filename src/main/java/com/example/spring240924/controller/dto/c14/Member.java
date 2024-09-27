package com.example.spring240924.controller.dto.c14;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Member {
    private String name;
    private Integer height;
    private Integer weight;
    private String birth;
    private String team;
    private String position;
}
