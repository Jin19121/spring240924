package com.example.spring240924.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface Mapper06 {

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE CustomerID= #{id}
            """)
    String select01(Integer id);

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE ProductID= #{id}
            """)
    String select02(Integer id);

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE Country IN (#{c1}, #{c2})
            ORDER BY CustomerName
            """)
    List<String> select03(String c1, String c2);

    @Select("""
            SELECT ProductName
            FROM Products
            WHERE Price >= #{price1} AND Price <= #{price2}
            """)
    List<String> select04(int price1, int price2);

    @Select("""
            SELECT CONCAT(FirstName, ' ', LastName)
            FROM Employees
            WHERE BirthDate >= #{d1} AND BirthDate <= #{d2}
            """)
    List<String> select05(String d1, String d2);

    @Select("""
            SELECT CustomerName
            FROM Customers
            WHERE City IN (#{c1}, #{c2})
            
            """)
    List<String> select06(String c1, String c2);
}
