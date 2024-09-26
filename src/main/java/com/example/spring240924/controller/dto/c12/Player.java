package com.example.spring240924.controller.dto.c12;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@AllArgsConstructor //모든 필드를 받는 생성자
//@NoArgsConstructor // argument(파라미터) 없는 생성자
@RequiredArgsConstructor //파이널 필드 받는 생성자
public class Player {
    final int age;
    private final String name;
    private Boolean married; //RequiredArgsConstructor에 포함 안됨

}
