package com.example.spring240924.controller;

import com.example.spring240924.dto.c24.Customer;
import com.example.spring240924.dto.c24.Employee;
import com.example.spring240924.dto.c24.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("main24")
public class Controller24 {
  @Autowired
  DataSource dataSource;

  @GetMapping("sub1")
  public void sub1() throws SQLException {
    String sql = """
            SELECT DISTINCT City
            FROM Customers
            """;
    Connection con = dataSource.getConnection();
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);

    try (con; stmt; rs) {
      while (rs.next()) {
        System.out.println(rs.getString("City"));
      }
    }
  }

  //    쿼리가 복수일 떄
  @GetMapping("sub2")
  public void sub2(Model model) throws SQLException {
    String sql = """
            SELECT CustomerName, ContactName, Address
            FROM Customers
            """;
    Connection con = dataSource.getConnection();
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    try (con; stmt; rs) {
      List<Customer> list = new ArrayList<>();
      while (rs.next()) {
        String name = rs.getString("CustomerName");
        String contact = rs.getString("ContactName");
        String address = rs.getString("Address");
        //javaBeans
        Customer customer = new Customer();
        customer.setName(name);
        customer.setContactName(contact);
        customer.setAddress(address);

        list.add(customer);

//                System.out.println(STR."이름: \{name}, 계약자명: \{contact}, 주소: \{address}");
      }
      model.addAttribute("customerList", list);
    }
    //jsp로 forward
  }

  //    연습
  @GetMapping("sub3")
  public void sub3(Model model) throws SQLException {
    String sql = """
            SELECT EmployeeID, FirstName, LastName, BirthDate
            FROM Employees
            """;
    Connection con = dataSource.getConnection();
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    try (con; stmt; rs) {
      List<Employee> list = new ArrayList<>();
      while (rs.next()) {
        Employee employee = new Employee();
//                employee.setId(rs.getString("EmployeeID"));
//                employee.setName1(rs.getString("FirstName"));
//                employee.setName2(rs.getString("LastName"));
//                employee.setBirthDate(rs.getString("BirthDate"));
        employee.setId(rs.getString(1));
        employee.setName1(rs.getString(2));
        employee.setName2(rs.getString(3));
        employee.setBirthDate(rs.getString(4));

        list.add(employee);
      }
      model.addAttribute("employeeList", list);
    }
  }

  //상품번호, 상품명, 단위, 가격
  @GetMapping("sub4")
  public void sub4(Model model) throws SQLException {
    String sql = """
            SELECT ProductID, ProductName, Unit, Price
            FROM Products
            """;
    Connection con = dataSource.getConnection();
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery(sql);
    try (con; stmt; rs) {
      List<Product> list = new ArrayList<>();
      while (rs.next()) {
        Product product = new Product();
        product.setId(rs.getString(1));
        product.setName(rs.getString(2));
        product.setUnit(rs.getString(3));
        product.setPrice(rs.getString(4));
        list.add(product);
      }
      model.addAttribute("productList", list);
    }
  }

}

