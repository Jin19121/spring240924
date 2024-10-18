package com.example.spring240924.mapper;

import com.example.spring240924.controller.dto.c34.*;
import org.apache.ibatis.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

@Mapper
public interface Mapper04 {

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductID = 1""")
    String getProductName();

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductID = 1""")
//    @Insert()
//    @Delete()
//    @Update()
    String select2(); //하나니까 void도 , string도 가능

    @Select("""
            SELECT Price
            FROM Products
            WHERE ProductID = 1""")
    String select3(); //웬만하면 데이터타입을 맞춰서 받을 것

    @Select("""
            SELECT Price
            FROM Products
            WHERE ProductID = 1""")
    Double select4(); //웬만하면 데이터타입을 맞춰서 받을 것

    @Select("""
            SELECT LastName
            FROM Employees
            WHERE EmployeeID = 1""")
    String select5();

    @Select("""
            SELECT CategoryID
            FROM Categories
            WHERE CategoryID = 2""")
    Integer select6();

    @Select("""
            SELECT BirthDate
            FROM Employees
            WHERE EmployeeID = 2""")
    LocalDate select7();

    @Select("""
            SELECT Distinct Country
            FROM Customers
            """)
    List<String> select8();

    @Select("""
            SELECT DISTINCT LastName
            FROM Employees""")
    List<String> select9();

    @Select("""
            SELECT Price
            FROM Products
            ORDER BY Price DESC
            LIMIT 5""")
    List<Double> select10();

    @Select("""
            SELECT CustomerName, City, Country
            FROM Customers
            WHERE CustomerID=1""")
    Map<String, String> select12();

    @Select("""
            SELECT CustomerName 이름, City 도시, Country 국가
            FROM Customers
            WHERE CustomerID=1
            """)
    Map<String, String> select13();

    @Select("""
            SELECT ProductName name, Price, CategoryID
            FROM Products
            WHERE ProductID=1
            """)
    Map<String, Object> select14(); //String으로 받아도 되고, Object는 모두 포함해서 가능

    @Select("""
            SELECT CONCAT(LastName, ' ', FirstName) 이름, BirthDate
            FROM Employees
            WHERE EmployeeID=1
            """)
    Map<String, Object> select15();


    @Select("""
            SELECT CustomerName 성함, Address 주소, PostalCode 우편번호
            FROM Customers
            WHERE CustomerID=3
            """)
    Map<String, String> select16();

    @Select("""
            SELECT CustomerName name, Address address, PostalCode post
            FROM Customers
            WHERE CustomerID=1""")
    Customer select17();

    @Select("""
            SELECT ProductID id, ProductName name, Price price
                FROM Products
                WHERE ProductID = 1""")
    Product select18(); //JavaBean

    @Select("""
            SELECT LastName lName, FirstName fName, BirthDate birth
            FROM Employees
            WHERE EmployeeID = 3
            """)
        //이거는 CONCAT할 수 있나?
    Employee select19();

    @Select("""
            SELECT SupplierID id, SupplierName name, Phone phone
                FROM Suppliers
                WHERE SupplierID = 2
            """)
    Supplier select20();

    @Select("""
            SELECT OrderDate date, CustomerName client
            FROM Orders ord
                JOIN Customers cu
                    ON ord.CustomerID = cu.CustomerID
            WHERE OrderID = 10248""")
    Order select21();

    @Select("""
            SELECT CustomerName name, Address address, PostalCode post
            FROM Customers
            LIMIT 3
            """)
    List<Map<String, String>> select22();

    @Select("""
            SELECT ProductName, CategoryName, Unit, Price
            FROM Products p
                JOIN Categories c
                    ON p.CategoryID = c.CategoryID
            ORDER BY Price DESC
            LIMIT 5
            """)
    List<Map<String, Object>> select23();


    @Select("""
            SELECT ProductName, Quantity, Price
            FROM Orders o
                JOIN OrderDetails od
                    ON o.OrderID= od.OrderID
                JOIN Products p
                    ON od.ProductID=p.ProductID
            WHERE o.OrderID = 10248
            """)
    List<Map<String, Object>> select24();

    @Select("""
            SELECT LastName lName, FirstName fName, BirthDate birth
            FROM Employees
            """)
    List<Employee> select25();

    @Select("""
            SELECT SupplierID id, SupplierName name, Phone phone
            FROM Suppliers
            WHERE Country = 'usa'
            """)
    List<Supplier> select26();

    @Select("""
            SELECT OrderDate date, CustomerName client
            FROM Orders o
                JOIN Customers c
                ON o.CustomerID = c.CustomerID
            WHERE OrderDate LIKE '1996-07-__'
            """)
    List<Order> select27();
}
