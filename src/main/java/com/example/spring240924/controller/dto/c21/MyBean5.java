package com.example.spring240924.controller.dto.c21;

import java.time.LocalDateTime;
import java.util.List;

public class MyBean5 {
    private List<String> select; //method argument에 쓰면 안됨
    private LocalDateTime date;
    private String note;
    private String id;
}
