package com.example.spring240924.controller.dto.c40;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

@Mapper
public interface Mapper10 {

    //dynamic sql
    //if
    @Select("""
            <script>            
            SELECT * 
            FROM Customers
            WHERE 
                Country = 'USA'
                <if test="name !=null">
                AND CustomerName = #{name}
                </if>
            
                <if test="contact !=null">
                AND ContactName = #{contact}
                </if>
                </script>
            """)
    Map<String, Object> select1(String name, String contact);
}
