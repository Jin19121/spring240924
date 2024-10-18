package com.example.spring240924.mapper;

import com.example.spring240924.controller.dto.c35.DTO59;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Mapper05 {

    @Select("""
            SELECT student_id studentId,
                   model_number modelNumber,
                   product_name productName,
                   birth_date birthDate,
                   inserted,
                   score
            FROM db1.my_table59
            """)
//컬럼명은 snake_case 여서 property(camelCase)와 다름 -> alias 줘야함
    List<DTO59> select1();

    //application properties에서 camelCase snake_case 혼용 허락
    @Select("""
            SELECT *
            FROM db1.my_table59
            """)
    List<DTO59> select2();
}
