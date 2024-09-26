package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c11.Car;
import com.example.spring240924.controller.dto.c11.Person;
import com.example.spring240924.controller.dto.c11.Player;
import com.example.spring240924.controller.dto.c11.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main11")
public class Controller11 {
    @RequestMapping("sub1")
    public String sub1(Model model) {
        //String, 기본타입, 배열, List, Map, JavaBeans
        var data = List.of(
                Map.of("name", "DK",
                        "team", "SVT"),
                Map.of("country", "Korea",
                        "location", "용산"),
                Map.of("price", 600,
                        "model", "carnival")
        );
        model.addAttribute("data", data);
        return null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {
        var list = List.of(
                Map.of(
                        "team", "자이언츠",
                        "price", 10000,
                        "number", 4567
                ),
                Map.of(
                        "location", "제주",
                        "name", "바이든"
                ),
                Map.of("company", "삼성")
        );
        model.addAttribute("list1", list);
        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {
        model.addAttribute("data", Map.of(
                "list1", List.of("tesla", "volvo", "kia"),
                "languages", List.of("java", "js", "c++", "python")
        ));
        return null;
    }

    @RequestMapping("sub4")
    public String sub4(Model model) {
        model.addAttribute("car", Map.of(
                "hyundai", List.of("소나타", "아반떼", "제네시스")
        ));
        model.addAttribute("student", Map.of(
                "son", List.of(80, 90, 99)
        ));
        return null;
    }

    @RequestMapping("sub5")
    public String sub5(Model model) {
        //List 내의 JavaBeans
        List<Student> students = List.of(
                new Student(1, "son", 33, 98.1234, "gmail"),
                new Student(5, "hong", 55, 77.33, "yahoo"),
                new Student(7, "messi", 66, 88.44, "daum"),
                new Student(10, "otani", 22, 66.11, "naver")
        );
        model.addAttribute("students", students);
        return null;
    }

    @RequestMapping("sub6")
    public String sub6(Model model) {
        List<Car> carList = List.of(
                new Car("일반반", 20500, false),
                new Car("위버스반", 13500, true),
                new Car("kit", 23000, false)
        );
        model.addAttribute("carList", carList);
        return null;
    }

    @RequestMapping("sub7")
    public String sub7(Model model) {
        //javaBeans 내의 리스트
        model.addAttribute("person",
                new Person("DK", "Lee", 28, List.of("game", "photo", "sing")));
        return null;
    }

    @RequestMapping("sub8")
    public String sub8(Model model) {
        model.addAttribute("player",
                new Player("Seok", "DK", "weverse", false,
                        List.of("SVT", "BSS", "Vocal"),
                        List.of(100, 150, 98, 330)
                ));
        return null;
    }
}
