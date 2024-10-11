package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c26.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Controller
@RequestMapping("main28")
public class Controller28 {
    @Autowired
    DataSource dataSource;

    @PostMapping("sub1")
    public void sub1(String name, String contact) {
        String sql = """
                INSERT INTO Customers
                (CustomerName, ContactName)
                VALUE (?, ?)
                """;

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            try (conn; pstmt) {
                pstmt.setString(1, name);
                pstmt.setString(2, contact);
//        pstmt.executeQuery(); -> SELECT 할 때만
                pstmt.executeUpdate(); // INSERT, UPDATE, DELETE
                // -> 조작된 행의 수 return. resultSet을 리턴하지 않기 때문에 굳이 뭔가 추가로 작업할 필요 없음
                // 다만 조작된 행의 수를 확인하여 조작이 성공적으로 수행되었는가 확인하기도 함.
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("sub2")
    public void sub2() {
    }

    //연습 /main28/sub3 은 상품 입력 form이 있는 jsp로 forward
    // + /main28/sub4 는 새 상품을 insert 하는 로직 실행
    //productName, Unit, Price(int)
    @GetMapping("sub3")
    public void sub3() {

    }

    //    @GetMapping("sub4")
    @PostMapping("sub4")
    public String sub4(String name, String unit, String price, RedirectAttributes rttr) {
        String sql = """
                INSERT INTO Products
                (ProductName, Unit, Price)
                VALUES (?, ?, ?)
                """;

        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            try (conn; pstmt) {
                pstmt.setString(1, name);
                pstmt.setString(2, unit);
                pstmt.setString(3, price);
                int count = pstmt.executeUpdate(); //조작(추가)한 행이 있는지 없는지 확인
                if (count == 1) {
                    rttr.addFlashAttribute("message", "새 상품이 등록되었습니다.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return "redirect:/main28/sub4";? 여기 맞아?
// 새고 할때 중복 입력 안 되도록 우회 + null 처리

        return "redirect:/main28/sub3";
    }

    @GetMapping("sub5")
    public void sub5(String id, Model model) {
        //고객 조회 목적
        String sql = """
                SELECT * FROM Customers
                WHERE CustomerId = ?
                """;
        try {
            Connection conn = dataSource.getConnection();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, id);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactName(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                model.addAttribute("customer", customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
