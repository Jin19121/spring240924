package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c26.Category;
import com.example.spring240924.controller.dto.c26.Country;
import com.example.spring240924.controller.dto.c26.Customer;
import com.example.spring240924.controller.dto.c26.Product;
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
@RequestMapping("main26")
public class Controller26 {
    @Autowired
    DataSource dataSource;

    @GetMapping("sub1")
    public void sub1(Model model, String categoryId, String order) throws SQLException {
        String categorySQL = """
                SELECT *
                FROM Categories
                ORDER BY CategoryID
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(categorySQL);
        try (con; stmt; rs) {
            List<Category> categories = new ArrayList<>();
            while (rs.next()) {
                Category category = new Category();
                category.setId(rs.getString("CategoryID"));
                category.setName(rs.getString("CategoryName"));
                category.setDescription(rs.getString("Description"));

                categories.add(category);
            }
            model.addAttribute("categoryList", categories);
        }
        //상품 조회 쿼리
        String productSQL = """
                SELECT *
                FROM Products
                """;
        if (categoryId != null && !categoryId.equals("0")) {
            productSQL += STR."""
                    WHERE CategoryId=\{categoryId}
                    """;
        }
        if (order != null) {
            productSQL += switch (order) {
                case "name" -> """
                        ORDER BY ProductName
                        """;
                case "price" -> """
                        ORDER BY Price
                        """;
                default -> "";
            };
        }
        Connection con2 = dataSource.getConnection();
        Statement stmt2 = con2.createStatement();
        ResultSet rs2 = stmt2.executeQuery(productSQL);
        try (con2; stmt2; rs2) {
            List<Product> products = new ArrayList<>();
            while (rs2.next()) {
                Product product = new Product();
                product.setId(rs2.getString("ProductID"));
                product.setName(rs2.getString("ProductName"));
                product.setCategoryId(rs2.getString("CategoryID"));
                product.setSupplierId(rs2.getString("SupplierID"));
                product.setUnit(rs2.getString("Unit"));
                product.setPrice(rs2.getString("Price"));
                products.add(product);
            }
            model.addAttribute("productList", products);
        }
    }

    @GetMapping("sub2")
    public void sub2(Model model, String country, String order) throws SQLException {
        String countrySQL = """
                SELECT DISTINCT Country
                FROM Customers
                ORDER BY Country
                """;
        Connection con1 = dataSource.getConnection();
        Statement stmt1 = con1.createStatement();
        ResultSet rs1 = stmt1.executeQuery(countrySQL);
        try (con1; stmt1; rs1) {
            List<Country> countries = new ArrayList<>();
            while (rs1.next()) {
                Country c = new Country();
                c.setCountryName(rs1.getString("Country"));
                countries.add(c);
            }
            model.addAttribute("countryList", countries);
        }

        //고객 리스트 조회
        String customerSQL = """
                SELECT *
                FROM Customers
                """;
        if (country != null && !country.equals("0")) {
            customerSQL += STR."""
                    WHERE Country='\{country}'
                    """;
        }

        if (order != null) {
            customerSQL += switch (order) {
                case "customerName" -> """
                        ORDER BY CustomerName
                        """;
                case "contactName" -> """
                        ORDER BY ContactName
                        """;
                case "customerID" -> """
                        ORDER BY CustomerID
                        """;
                default -> "";
            };
        }
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(customerSQL);
        try (con; stmt; rs) {
            List<Customer> customers = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerID"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactName(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                customers.add(customer);
            }
            model.addAttribute("customerList", customers);
        }
    }

    @GetMapping("sub3")
    public void sub3(Model model, @RequestParam(defaultValue = "") String keyword) throws SQLException {
        String sql = STR."""
                SELECT *
                FROM Customers
                WHERE CustomerName LIKE '%\{keyword}%'
                """;

        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Customer> customers = new ArrayList<>();
        try (con; stmt; rs) {
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("CustomerID"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setContactName(rs.getString("ContactName"));
                customer.setAddress(rs.getString("Address"));
                customer.setCity(rs.getString("City"));
                customer.setPostalCode(rs.getString("PostalCode"));
                customer.setCountry(rs.getString("Country"));
                customers.add(customer);
            }
            model.addAttribute("customerList", customers);
        }
    }

    //상품명 검색
    @GetMapping("sub4")
    public void sub4(Model model, @RequestParam(defaultValue = "") String search) throws SQLException {
        String sql = STR."""
                SELECT *
                FROM Products
                WHERE ProductName LIKE '%\{search}%'
                """;
        Connection con = dataSource.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        List<Product> products = new ArrayList<>();
        try (con; stmt; rs) {
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
    }
}
