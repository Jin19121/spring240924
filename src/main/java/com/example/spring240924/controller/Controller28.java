package com.example.spring240924.controller;

import com.example.spring240924.dto.c26.Customer;
import com.example.spring240924.dto.c26.Product;
import com.example.spring240924.dto.c28.Employee;
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

  @PostMapping("sub6")
  public String sub6(String id, RedirectAttributes rttr) {
    String sql = """
            DELETE FROM Customers
            WHERE CustomerId = ?
            """;

    try {
      Connection conn = dataSource.getConnection();
      PreparedStatement pstmt = conn.prepareStatement(sql);
      try (conn; pstmt) {
        pstmt.setString(1, id);
        int count = pstmt.executeUpdate();
        if (count == 1) {
          rttr.addFlashAttribute("message", id + "번 고객님의 정보가 삭제되었습니다.");

        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

    rttr.addAttribute("id", id);
    return "redirect:/main28/sub5";
  }

  //연습: 상품번호 조회 + 상품 삭제
  @GetMapping("sub7")
  public void sub7(String id, Model model) {
    String sql = """
            SELECT *
            FROM Products
            WHERE ProductId = ?
            """;
    try {
      Connection conn = dataSource.getConnection();
      PreparedStatement pstmt = conn.prepareStatement(sql);
      try (conn; pstmt) {
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
          Product product = new Product();
          product.setId(rs.getString("ProductId"));
          product.setName(rs.getString("ProductName"));
          product.setSupplierId(rs.getString("SupplierId"));
          product.setCategoryId(rs.getString("CategoryId"));
          product.setUnit(rs.getString("Unit"));
          product.setPrice(rs.getString("Price"));
          model.addAttribute("product", product);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @PostMapping("sub8")
  public String sub8(String id, RedirectAttributes rttr) {
    String sql = """
            DELETE FROM Products
            WHERE ProductId = ?
            """;
    try {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(sql);
      try (con; pstmt) {
        pstmt.setString(1, id);
        int check = pstmt.executeUpdate();
        if (check == 1) {
          rttr.addFlashAttribute("message", id + "번 상품 삭제 완료");
        }
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
    rttr.addAttribute("id", id);
    return "redirect:/main28/sub7";
  }

  @PostMapping("sub9")
  public String sub9(Customer customer, RedirectAttributes rttr) {
    String sql = """
            UPDATE Customers
            SET CustomerName = ?,
                ContactName = ?,
                Address = ?,
                City = ?,
                PostalCode = ?,
                Country = ?
            WHERE CustomerId = ?
            """;

    try {
      Connection conn = dataSource.getConnection();
      PreparedStatement pstmt = conn.prepareStatement(sql);
      try (conn; pstmt) {
        pstmt.setString(1, customer.getCustomerName());
        pstmt.setString(2, customer.getContactName());
        pstmt.setString(3, customer.getAddress());
        pstmt.setString(4, customer.getCity());
        pstmt.setString(5, customer.getPostalCode());
        pstmt.setString(6, customer.getCountry());
        pstmt.setString(7, customer.getId());
        pstmt.executeUpdate();
        rttr.addFlashAttribute("message", customer.getId() + "번 고객 정보가 수정되었습니다.");
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    rttr.addAttribute("id", customer.getId());
    return "redirect:/main28/sub10";
  }

  @GetMapping("sub10")
  public void sub10(String id, Model model) {
    String sql = """
            SELECT *
            FROM Customers
            WHERE CustomerId = ?
            """;

    try {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(sql);
      try (con; pstmt) {
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
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //연습: 직원 정보 조회+수정
  @PostMapping("sub11")
  public void sub11(Employee employee) {
    //수정 로직
    String sql = """
            UPDATE Employees
            SET LastName = ?,
                FirstName = ?,
                BirthDate = ?,
                Photo = ?,
                Notes = ?
            WHERE EmployeeId = ?
            """;

    try {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(sql);
      try (con; pstmt) {
        pstmt.setString(1, employee.getLastName());
        pstmt.setString(2, employee.getFirstName());
        pstmt.setString(3, employee.getBirthDate());
        pstmt.setString(4, employee.getPhoto());
        pstmt.setString(5, employee.getNotes());
        pstmt.setString(6, employee.getId());
        pstmt.executeUpdate();

      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @GetMapping("sub12")
  public void sub12(String id, Model model) {
    //조회 로직
    String sql = """
            SELECT *
            FROM Employees
            WHERE EmployeeId = ?
            """;

    try {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(sql);
      try (con; pstmt) {
        pstmt.setString(1, id);
        ResultSet re = pstmt.executeQuery();
        if (re.next()) {
          Employee employee = new Employee();
          employee.setId(re.getString("EmployeeId"));
          employee.setLastName(re.getString("LastName"));
          employee.setFirstName(re.getString("FirstName"));
          employee.setBirthDate(re.getString("BirthDate"));
          employee.setPhoto(re.getString("Photo"));
          employee.setNotes(re.getString("Notes"));
          model.addAttribute("employee", employee);
        }
      }

    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  //따라헤보자
  @GetMapping("sub13")
  public void sub13(String id, Model model) {
    //조회
    String sql = """
            SELECT *
            FROM Employees
            WHERE EmployeeId = ?
            """;
    try {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(sql);
      try (con; pstmt) {
        pstmt.setString(1, id);
        ResultSet rs = pstmt.executeQuery();
        if (rs.next()) {
          Employee e = new Employee();
          e.setId(rs.getString("EmployeeId"));
          e.setBirthDate(rs.getString("BirthDate"));
          e.setFirstName(rs.getString("FirstName"));
          e.setLastName(rs.getString("LastName"));
          e.setNotes(rs.getString("Notes"));
          e.setPhoto(rs.getString("Photo"));

          model.addAttribute("employee", e);
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @PostMapping("sub14")
  public String sub14(Employee employee, RedirectAttributes rttr) {
    //수정
    String sql = """
            UPDATE Employees
            SET FirstName = ?,
                LastName = ?,
                Notes = ?,
                Photo = ?,
                BirthDate = ?
            WHERE EmployeeId = ?
            """;
    try {
      Connection con = dataSource.getConnection();
      PreparedStatement pstmt = con.prepareStatement(sql);
      try (con; pstmt) {
        pstmt.setString(1, employee.getFirstName());
        pstmt.setString(2, employee.getLastName());
        pstmt.setString(3, employee.getNotes());
        pstmt.setString(4, employee.getPhoto());
        pstmt.setString(5, employee.getBirthDate());
        pstmt.setString(6, employee.getId());

        pstmt.executeUpdate();
        rttr.addFlashAttribute("message",
                employee.getId() + "번 직원 정보가 수정되었습니다.");
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    rttr.addAttribute("id", employee.getId());
    return "redirect:/main28/sub13";
  }
}
