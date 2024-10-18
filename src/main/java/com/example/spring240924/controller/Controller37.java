package com.example.spring240924.controller;

import com.example.spring240924.mapper.Mapper07;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("main37")
public class Controller37 {
    final Mapper07 mapper07;

    @GetMapping("sub1")
    public void sub1(Integer id) {
        int cnt = mapper07.delete1(id);
        System.out.println(cnt + "개 행 삭제됨");
    }

    @GetMapping("sub2")
    public void sub2(Integer id) {
        int process = mapper07.delete2(id);
        System.out.println(process);
    }

    @GetMapping("sub3")
    public void sub3(String name,
                     String city,
                     String country) {
        name = "son";
        city = "seoul";
        country = "korea";

        int cnt = mapper07.insert1(name, city, country);
        System.out.println("cnt = " + cnt + "명의 정보 수정");
    }

    @GetMapping("sub4")
    public void sub4(String name, Double price) {
        name = "photocard";
        price = 20.00;

        int result = mapper07.insert2(name, price);
        System.out.println("result = " + result);
    }

    @GetMapping("sub5")
    public void sub5(Model model) {
        List<Map<String, Object>> customers = mapper07.select2();
        model.addAttribute("customerList", customers);
    }

    @PostMapping("sub5")
    public String sub5(String name,
                       String city,
                       String country,
                       RedirectAttributes rttr) {
        int c = mapper07.insert1(name, city, country);
        System.out.println(c + "명의 고객 정보 등록");
        if (c != 0) {
            rttr.addFlashAttribute("message", c + "명의 고객 정보가 등록됨");
        }
        return "redirect:/main37/sub5";
    }

//    @PostMapping("sub5")
//    public String sub5(Integer id) {
//        int dc = mapper07.delete1(id);
//        System.out.println(dc + "명의 고객 정보 삭제");
//
//        return "redirect:/main37/sub5";
//    }

    //연습 새상품 등록
    @GetMapping("sub6")
    public void sub6(Model model) {
        List<Map<String, Object>> products = mapper07.select3();
        model.addAttribute("productList", products);
    }

    @PostMapping("sub6")
    public String sub6(String name,
                       Double price,
                       RedirectAttributes rttr) {
        int count = mapper07.insert2(name, price);
        System.out.println(count + "개 상품 등록");

        rttr.addFlashAttribute("done", "상품 등록 완료");
        return "redirect:/main37/sub6";
    }
}
