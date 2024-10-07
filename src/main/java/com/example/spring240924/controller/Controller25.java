package com.example.spring240924.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main25")
public class Controller25 {
    @Autowired
    DataSource dataSource;

    // /main25/sub1?country=uk => 뭔가 이상한데
    @GetMapping("sub1")
    public void sub1(Model model, String country) {
        String sql = STR."""
                SELECT CustomerName
                FROM Customers
                WHERE Country = '\{country}'
                """;
//        System.out.println();
//        System.out.println(country + "에 있는 고객들");
        List<String> list = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            try (conn; stmt; rs) {
                while (rs.next()) {
                    String name = rs.getString("CustomerName");
//                    System.out.println("name = " + name);
                    list.add(name);
                }
                model.addAttribute("nameList", list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //연습: 특정 가격인 상품명 조회
    @GetMapping("sub2")
    public void sub2(Model model, String price) {
        String sql = STR."""
                SELECT ProductName
                FROM Products
                WHERE Price = '\{price}'
                """;

        List<String> list = new ArrayList<>();
        try {
            Connection conn = dataSource.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            try (conn; stmt; rs) {
                while (rs.next()) {
                    String name = rs.getString("ProductName");
                    list.add(name);
                }
                model.addAttribute("nameList", list);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}