package com.example.spring240924.controller;

import com.example.spring240924.dto.c26.Customer;
import com.example.spring240924.dto.c26.Product;
import com.example.spring240924.dto.c27.Order;
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

  @GetMapping("sub5")
  public void sub5(Model model,
                   @RequestParam(value = "page", defaultValue = "1") Integer pageNumber,
                   @RequestParam(value = "rowCount", defaultValue = "10") Integer rowCount) throws SQLException {
    // 총 레코드 수 조회
    String numberOfRiwSQL = """
            SELECT COUNT(*)
            FROM Customers
            """;
    Connection conn2 = dataSource.getConnection();
    PreparedStatement pstmt2 = conn2.prepareStatement(numberOfRiwSQL);
    ResultSet rs2 = pstmt2.executeQuery();
    try (conn2; pstmt2; rs2) {
      //총 레코드 수
      Integer numberOfRows = rs2.next() ? rs2.getInt(1) : 0;
      //마지막 페이지 번호
      Integer lastPageNumber = (numberOfRows - 1) / rowCount + 1;

      model.addAttribute("lastPageNo", lastPageNumber);

      //현재 페이지 번호
      model.addAttribute("currentPageNo", pageNumber);

      //페이지 번호의 끝(맨 오른쪽) 값 (10개씩 보여줄 때)
      Integer endPageNumber = ((pageNumber - 1) / 10 + 1) * 10;
      model.addAttribute("endPageNo", Math.min(endPageNumber, lastPageNumber));

      //페이지 번호의 시작(맨 왼쪽) 값
      Integer beginPageNumber = endPageNumber - 9;
      model.addAttribute("beginPageNo", beginPageNumber);

      //다음버튼 클릭 시 사용될 페이지 번호
      Integer nextPageNumber = endPageNumber + 1;
      if (nextPageNumber <= lastPageNumber) {
        model.addAttribute("nextPageNo", nextPageNumber);
      }

      //이전버튼 클릭 시 사용될 페이지 번호
      Integer prevPageNumber = beginPageNumber - 1;
      if (prevPageNumber > 0) {
        model.addAttribute("prevPageNo", prevPageNumber);
      }
    }

    //고객 목록 조회
    String sql = """
            SELECT *
            FROM Customers
            ORDER BY CustomerID
            LIMIT ?, ?
            """;

    Connection conn = dataSource.getConnection();
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, (pageNumber - 1) * rowCount);
    pstmt.setInt(2, rowCount);
    ResultSet rs = pstmt.executeQuery();
    try (conn; pstmt; rs) {
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

  //최신 주문 순으로 각 페이지에 20개 씩 주문이 조회되는  페이지
  @GetMapping("sub6")
  public void sub6(Model model,
                   @RequestParam(value = "page", defaultValue = "1") Integer pageNumber,
                   @RequestParam(value = "amount", defaultValue = "20") Integer pageCount
  ) throws SQLException {
    String lastPageSQL = """
            SELECT COUNT(*)
            FROM Orders
            """;
    Connection conn2 = dataSource.getConnection();
    PreparedStatement pstmt2 = conn2.prepareStatement(lastPageSQL);
    ResultSet rs2 = pstmt2.executeQuery();
    try (conn2; pstmt2; rs2) {
      Integer Rows = rs2.next() ? rs2.getInt(1) : 0;
      Integer lastPage = (Rows - 1) / pageCount + 1;
      model.addAttribute("lastPage", lastPage);

      model.addAttribute("currentPageNumber", pageNumber);

      Integer lastPageNumber = (Rows - 1) / pageCount + 1;
      model.addAttribute("lastPageNumber", lastPageNumber);

      Integer endPageNumber = ((pageNumber - 1) / 10 + 1) * 10;
      model.addAttribute("endPageNumber", Math.min(endPageNumber, lastPageNumber));

      Integer beginPageNumber = endPageNumber - 9;
      model.addAttribute("beginPageNumber", beginPageNumber);

      Integer prevPageNumber = beginPageNumber - 1;
      if (prevPageNumber > 0) {
        model.addAttribute("prevPageNumber", prevPageNumber);
      }

      Integer nextPageNumber = endPageNumber + 1;
      if (nextPageNumber <= lastPageNumber) {
        model.addAttribute("nextPageNumber", nextPageNumber);
      }
    }
    String sql = """
            SELECT *
            FROM Orders
            ORDER BY OrderDate DESC
            LIMIT ?, ?
            """;
    Connection conn = dataSource.getConnection();
    PreparedStatement pstmt = conn.prepareStatement(sql);
    pstmt.setInt(1, (pageNumber - 1) * pageCount);
    pstmt.setInt(2, pageCount);
    ResultSet rs = pstmt.executeQuery();
    try (conn; pstmt; rs) {
      List<Order> list = new ArrayList<>();
      while (rs.next()) {
        Order order = new Order();
        order.setOrderId(rs.getString("OrderID"));
        order.setCustomerId(rs.getString("CustomerID"));
        order.setCustomerId(rs.getString("CustomerID"));
        order.setEmployeeId(rs.getString("EmployeeID"));
        order.setOrderDate(rs.getString("OrderDate"));
        order.setShipperId(rs.getString("ShipperID"));
        list.add(order);
      }
      model.addAttribute("orderList", list);
    }
  }
}
