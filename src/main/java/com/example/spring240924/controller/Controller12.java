package com.example.spring240924.controller;

import com.example.spring240924.dto.c12.Book;
import com.example.spring240924.dto.c12.Car;
import com.example.spring240924.dto.c12.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("main12")
public class Controller12 {
  @RequestMapping("sub1")
  public String sub1(Model model) {
    Book book = new Book();
    book.setAuthor("linus");
    book.setPrice(500);
    book.setTitle("git");

    Book book2 = new Book("java", "shin", 600);
    model.addAttribute("books", List.of(book, book2));
    return null;
  }

  @RequestMapping("sub2")
  public String sub2(Model model) {
    Car car = new Car();
    car.setModel("truck");
    car.setYear(2024);
    car.setMake("tesla");

    car.getMake();
    car.getModel();
    car.getYear();

    System.out.println(car);
    return null;
  }

  @RequestMapping("sub3")
  public String sub3(Model model) {
    model.addAttribute("num1", 99);
    model.addAttribute("num2", 88);
    model.addAttribute("num3", 77);

    model.addAttribute("attr1", "");
    model.addAttribute("attr2", List.of());
    model.addAttribute("attr3", Set.of());
    model.addAttribute("attr4", Map.of());
    return null;
  }

  @RequestMapping("sub4")
  public String sub4(Model model) {
    model.addAttribute("productList", List.of(
            new Product(3, "Albumn", 20500, 3, "Feel the Spill"),
            new Product(6, "Card", 1000, 13, "Ocean View"),
            new Product(7, "자동차", 170000, 0, "테슬라"),
            new Product(12, "모니터", 13200, 6, "LG FHD")
    ));

    return null;
  }
}
