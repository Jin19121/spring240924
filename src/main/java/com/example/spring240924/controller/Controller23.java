package com.example.spring240924.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main23")
public class Controller23 {
    @GetMapping("sub1")
    public void sub1(Model model) throws SQLException {
        String sql = "SELECT FirstName FROM Employees";

        String databaseUrl = "jdbc:mariadb://localhost:3306/w3schools";
        String databaseUserName = "root";
        String databasePassWord = "1234";

        //1. db 연결
        Connection con = DriverManager.getConnection(databaseUrl, databaseUserName, databasePassWord);
//        2. 실행 준비
        Statement stmt = con.createStatement();
//        3. 쿼리 실행
        ResultSet rs = stmt.executeQuery(sql);
//        5. 자원 닫기
        try (con; stmt; rs) {
//            4. 실행 결과 가공
//            rs.next(); //첫번째 행으로 커서를 이동
//            String name1 = rs.getString("FirstName");//커서가 가리키는 행의 FirstName 컬럼 데이터 얻기
//
//            //Nancy
//            System.out.println("name1 = " + name1);
//
//            rs.next();
//            String name2 = rs.getString("FirstName");
//            System.out.println("name2 = " + name2);//andrew

            List<String> names = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("FirstName");
                names.add(name);
            }
            model.addAttribute("nameList", names);
        }
    }

    @GetMapping("sub2")
    public void sub2(Model model) throws SQLException {
        String sql = "SELECT CustomerName FROM Customers";

        //연결
        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String userName = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, userName, password);

        //쿼리 실행 준비
        Statement stmt = con.createStatement();

        //쿼리 실행
        ResultSet rs = stmt.executeQuery(sql);

        try (con; stmt; rs) {
            List<String> list = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("CustomerName");
                list.add(name);
            }
            model.addAttribute("nameList", list);
        }
    }

    @GetMapping("sub3")
    public void sub3(Model model) throws SQLException {
        String sql = "SELECT ProductName FROM Products";

        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String userName = "root";
        String password = "1234";

        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try (con; stmt; rs) {
            List<String> products = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("ProductName");
                products.add(name);
            }
            model.addAttribute("productList", products);
        }
    }

    //고객이 있는 국가명들 조회
    @GetMapping("sub4")
    public void sub4(Model model) throws SQLException {
        String sql = """
                SELECT DISTINCT Country 
                FROM Customers
                """; //+로도 가능하지만 가독성 떨어짐

        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String userName = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try (con; stmt; rs) {
            List<String> list = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("Country");
                list.add(name);
            }
            model.addAttribute("countryList", list);
        }
    }

    //공급자 테이블 조회해서 국가명 목록 출력하기
    //sub4.jsp 재사용하기
    @RequestMapping("sub5")
    public String sub5(Model model) throws SQLException {
        String sql = "SELECT DISTINCT Country FROM Suppliers";
        String url = "jdbc:mariadb://localhost:3306/w3schools";
        String userName = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        try (con; stmt; rs) {
            List<String> list = new ArrayList<>();
            while (rs.next()) {
                String name = rs.getString("Country");
                list.add(name);
            }
            model.addAttribute("countryList", list);
        }
        return "main23/sub4";
    }
}
