package com.example.spring240924.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@Mapper
public interface Mapper07 {

    @Select("""
            SELECT *
            FROM Customers
            """)
    List<Map<String, Objects>> select1();

    @Delete("""
            DELETE FROM Customers
            WHERE CustomerId = #{id}
            """)
    int delete1(Integer id);

    @Delete("""
            DELETE FROM Products
            WHERE ProductID = #{id}
            """)
    int delete2(Integer id);

    @Insert("""
            INSERT INTO Customers
            (CustomerName, City, Country) 
            VALUES (#{n}, #{ci}, #{co} )
            """)
    int insert1(String n, String ci, String co);

    @Insert("""
            INSERT INTO Products
            (ProductName, Price)
            VALUES (#{n}, #{p})
            """)
    int insert2(String n, Double p);
}
