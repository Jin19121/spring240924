package com.example.spring240924.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface Mapper02 {

    @Select("""
            SELECT SupplierName
            FROM Suppliers
            WHERE SupplierID = 1""")
    String selectSupplierName(
            //커넥션 만들고 execute 지금 다 mybatis가 해주는거
    );
}
