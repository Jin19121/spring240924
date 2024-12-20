package com.example.spring240924.controller;

import com.example.spring240924.dto.c10.Car;
import com.example.spring240924.dto.c10.Computer;
import com.example.spring240924.dto.c10.Person;
import com.example.spring240924.dto.c10.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main10")
public class Controller10 {
  @RequestMapping("sub1")
  public String sub1(Model model) {
    //javaBeans: get, set 메소드가 있는 객체(클래스)

    var obj = new Student(); //외부의 Student class
    obj.setId(11);
    obj.setName("donald");
    obj.setEmail("weverse");

    model.addAttribute("student", obj);
    return null;
  }

  @RequestMapping("sub2")
  public String sub2(Model model) {
    Car car1 = new Car();
    car1.setModel("karnival");
    car1.setCompany("Pledis");
    car1.setPrice(500);

    Car car2 = new Car();
    car2.setModel("X");
    car2.setCompany("tesla");
    car2.setPrice(700);

    model.addAttribute("PCar", car1);
    model.addAttribute("tCar", car2);
    return null;
  }

  @RequestMapping("sub3")
  public String sub3(Model model) {
    Computer com = new Computer();
    com.setId(99);
    com.setName("intel");
    com.setModel("model 10-3");
    com.setExpired(true);
    model.addAttribute("computer", com);
    return null;
  }

  @RequestMapping("sub4")
  public String sub4(Model model) {
    Person person = new Person();
    person.setEmail("gmail");
    person.setMarried(true);
    person.setAddress("신촌");
    person.setAge(44);
    model.addAttribute("person", person);
    return null;
  }
}
