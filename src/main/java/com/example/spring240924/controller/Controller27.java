package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c26.Customer;
import com.example.spring240924.controller.dto.c26.Product;
import com.example.spring240924.controller.dto.c27.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main27")
public class Controller27 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(Model model, String id) throws SQLException {
        // SQL injection
        String sql = STR."""
                SELECT *
                FROM Customers
                WHERE CustomerID = \{id}
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);

        try (con; stmt; rs) {
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactName(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                list.add(customer);
            }
            model.addAttribute("customerList", list);
        }
    }

    //statement 객체는 SQL injection 위험이 있다.
    // -> preparedStatement 객체 사용
    @GetMapping("sub2")
    public String sub2(Model model, String id) throws SQLException {
        String sql = """
                SELECT *
                FROM Customers
                WHERE CustomerID = ?
                """;

        Connection con = dataSource.getConnection();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();

        try (con; pstmt; rs) {
            List<Customer> list = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerId"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactName(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                list.add(customer);
            }
            model.addAttribute("customerList", list);
        }
        return "/main27/sub1";
    }

    @GetMapping("sub3")
    public String sub3(Model model, String start, String end) throws SQLException {
        String sql = STR."""
                SELECT *
                FROM Products
                WHERE Price BETWEEN ? AND ?
                ORDER BY Price
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, start); //물음표 작성 순서대로
        pstmt.setString(2, end);
        ResultSet rs = pstmt.executeQuery();

        try (conn; pstmt; rs) {
            List<Product> products = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setId(rs.getString("ProductID"));
                product.setName(rs.getString("ProductName"));
                product.setSupplierId(rs.getString("SupplierID"));
                product.setCategoryId(rs.getString("CategoryID"));
                product.setUnit(rs.getString("Unit"));
                product.setPrice(rs.getString("Price"));
                products.add(product);
            }
            model.addAttribute("productList", products);
        }
        return "main26/sub5";
    }

    @GetMapping("sub4")
    public void sub4(Model model, String begin, String end) throws SQLException {
        String sql = """
                SELECT *
                FROM Orders
                WHERE OrderDate BETWEEN ? AND ?
                """;
        Connection conn = dataSource.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setString(1, begin);
        pstmt.setString(2, end);
        ResultSet rs = pstmt.executeQuery();


        try (conn; pstmt; rs) {
            List<Order> o = new ArrayList<>();
            while (rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getString("OrderID"));
                order.setCustomerId(rs.getString("CustomerID"));
                order.setCustomerId(rs.getString("CustomerID"));
                order.setEmployeeId(rs.getString("EmployeeID"));
                order.setOrderDate(rs.getString("OrderDate"));
                order.setShipperId(rs.getString("ShipperID"));
                o.add(order);
            }
            model.addAttribute("orderList", o);
        }
    }
}
