package com.example.spring240924.controller;

import com.example.spring240924.dto.c15.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("main15")
public class Controller15 {
  @RequestMapping("sub1")
  public void sub1(Model model) {
  }

  @RequestMapping("sub2")
  public void sub2(Model model) {
  }

  @RequestMapping("sub3")
  public void sub3(Model model) {
  }

  @RequestMapping("sub4")
  public void sub4(Model model) {
  }

  @RequestMapping("sub5")
  public void sub5(Model model) {
  }

  @RequestMapping("sub7")
  public void sub7() {
  }

  @RequestMapping("sub9")
  public void sub9(Model model) {
    model.addAttribute("some1", "hello import tag");
  }

  @RequestMapping("sub11")
  public void sub11(Model model) {
    model.addAttribute("attr1", "hello request");
  }

  @RequestMapping("sub13")
  public void sub13(Model model) {
    model.addAttribute("productList",
            List.of(new Product(5, "Soon", 1009),
                    new Product(9, "Minkyu", 6000),
                    new Product(13, "Boo", 3012)));
  }

  @RequestMapping("sub16")
  public void sub16(Model model) {
  }

  @RequestMapping("sub18")
  public void sub18(Model model) {
  }

  @RequestMapping("sub19")
  public void sub19(Model model) {
  }
}
