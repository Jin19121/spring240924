package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main9")
public class Controller09 {
    @RequestMapping("sub1")
    public String sub1() {
        return null;
    }

    @RequestMapping("sub2")
    public String sub2(Model model) {
        var map = Map.of(
                "name", "dk",
                "age", 33,
                "team", "SVT");
        model.addAttribute("attr1", map);
        model.addAttribute("attr2", List.of("java", "emmet"));
        return null;
    }

    @RequestMapping("sub3")
    public String sub3(Model model) {
        model.addAttribute("person", Map.of(
                "name", "dk",
                "address", "용인",
                "email", "weverse"
        ));
        return null;
    }

    @RequestMapping("sub4")
    public void sub4(Model model) {
        var student = Map.of(
                "name", "dk",
                "집 주소", "용인",
                "score", "526",
                "student number", "970218"
        );
        model.addAttribute("student", student);
        model.addAttribute("player", Map.of(
                "email", "weverse",
                "address", "caratland",
                "team", "SVT"
        ));
        model.addAttribute("home", Map.of(
                "location", "Goyang",
                "address", "korea",
                "price", "170000"
        ));
    }

}
