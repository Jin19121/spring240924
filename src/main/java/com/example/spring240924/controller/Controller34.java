package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c34.*;
import com.example.spring240924.mapper.Mapper04;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main34")
@RequiredArgsConstructor
public class Controller34 {
    final Mapper04 mapper04;
    private final DataSourceTransactionManagerAutoConfiguration dataSourceTransactionManagerAutoConfiguration;

    @GetMapping("sub1")
    public void sub1() {
        //CRUD는 mapper로
        String name = mapper04.getProductName();
        System.out.println(name);
    }

    @GetMapping("sub2")
    public void sub2(Map map) {
        //1행1열
        String s = mapper04.select2();
        String s1 = mapper04.select3();
        Double v = mapper04.select4();
        System.out.println("s = " + s);
        System.out.println("s1 = " + s1);
        System.out.println("v = " + v);

        //연습 1번의 lastname
        String name = mapper04.select5();
        System.out.println("name = " + name);

        //2번 상품의 category id
        Integer id = mapper04.select6();
        System.out.println("id = " + id);

        //2번 직원의 생일 조회
        LocalDate birthday = mapper04.select7();
        System.out.println("birthday = " + birthday);
    }

    @GetMapping("sub3")
    public void sub3(Map map) {
        //여러행 한 열
        List<String> list = mapper04.select8();
        list.forEach(System.out::println);

        List<String> lastName = mapper04.select9();
        lastName.forEach(System.out::println);

        List<Double> price = mapper04.select10();
        price.forEach(System.out::println);
    }

    @GetMapping("sub4")
    public void sub4(Map map) {
        //여러행 여러열
        Map<String, String> result1 = mapper04.select12();
        System.out.println("result1 = " + result1);

        Map<String, String> result2 = mapper04.select13();
        System.out.println("result2 = " + result2);

        Map<String, Object> result3 = mapper04.select14();
        System.out.println("result3 = " + result3);

        Map<String, Object> result4 = mapper04.select15();
        System.out.println("result4 = " + result4);

        Map<String, String> result5 = mapper04.select16();
        System.out.println("result5 = " + result5);
    }

    @GetMapping("sub5")
    public void sub5(Map map) {
        Customer c = mapper04.select17();
        System.out.println("c = " + c);

        Product p = mapper04.select18();
        System.out.println("p = " + p);

        //3번 직원 이름, 생일
        Employee e = mapper04.select19();
        System.out.println("e = " + e);

        //2번 공급자 id, 이름, 전화번호
        Supplier s = mapper04.select20();
        System.out.println("s = " + s);

        //10248 주문
        Order o = mapper04.select21();
        System.out.println("o = " + o);
    }

    @GetMapping("sub6")
    public void sub6() {
        //여러행 여러열 -> List<map>
        List<Map<String, String>> r1 = mapper04.select22();
        r1.forEach(System.out::println);

        List<Map<String, Object>> r2 = mapper04.select23();
        r2.forEach(System.out::println);

        List<Map<String, Object>> r3 = mapper04.select24();
        r3.forEach(System.out::println);
    }

    @GetMapping("sub7")
    public void sub7() {
        List<Employee> e = mapper04.select25();
        e.forEach(System.out::println);
        System.out.println();

        List<Supplier> s = mapper04.select26();
        s.forEach(System.out::println);
        System.out.println();

        List<Order> o = mapper04.select27();
        o.forEach(System.out::println);

    }
}
