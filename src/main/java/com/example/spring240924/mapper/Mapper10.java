package com.example.spring240924.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface Mapper10 {

    // dynamic sql
    // if
    @Select("""
            <script>
            SELECT *
            FROM Customers
            WHERE 
                Country = 'USA'
                <if test="name != null">
                AND CustomerName = #{name}
                </if>
            
                <if test="contact != null">
                AND ContactName = #{contact}
                </if>
            </script>
            """)
    Map<String, Object> select1(String name, String contact);

    @Select("""
            <script>
            SELECT *
            FROM Employees
            WHERE 
                EmployeeID = 3
                <if test="firstName !=null">
                AND FirstName = #{firstName}
                </if>
                <if test="lastName !=null">
                AND LastName = #{lastName}
                </if>
            </script>
            """)
    Map<String, Object> select2(String firstName, String lastName);

    @Select("""
            <script>
                SELECT *
                FROM Customers
                <trim prefix="WHERE" prefixOverride="AND">
                WHERE
                    <if test="name != null">
                        CustomerName = #{name}
                    </if>
                    <if test="contact != null">
                        AND ContactName = #{contact}
                    </if>
                </trim>
            </script>
            """)
    Map<String, Object> select3(String name, String contact);

    @Select("""
            <script>
            SELECT *
            FROM Employees
            <trim prefix="WHERE" prefixOverride="OR">
            WHERE
                <if test="firstName !=null">
                FirstName = #{firstName}
                </if>
                <if test="lastName !=null">
                OR LastName = #{lastName}
                </if>
            </trim>
            </script>
            """)
    Map<String, Object> select4(String firstName, String lastName);

    @Select("""
            <script>
            SELECT * FROM Customers
            <trim prefix="WHERE">
            <foreach collection="countryList" item="country" separator=","
            open="Country IN (" close=")">
                #{country}
            </foreach>
            </trim>
            </script>
            """)
    Object select5(List<String> countryList);

    @Select("""
            <script>
                SELECT *
                FROM Suppliers
                <trim prefix="WHERE">
                    <foreach collection="cityList" item="city" separator=", " open="City IN (" close=")">
                        #{city}
                    </foreach>
                </trim>
            </script>
            """)
    Object select6(List<String> cityList);

    @Select("""
            <script>
            SELECT *
            FROM Customers
            WHERE CustomerID &li; 5
            </script>
            """)
    List<Object> select7();

    //cdata 태그: 일반 텍스트임을 표시
    @Select("""
            <script>
            <![CDATA[
            SELECT *
            FROM Customers
            WHERE CustomerID < 5
            ]]>
            </script>
            """)
    List<Object> select8();
}
