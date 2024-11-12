package com.example.spring240924.dto.c29;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Bookshelf {
  private String isbn;
  private String title;
  private String author;
  private Double price;
  private LocalDate published;
}
