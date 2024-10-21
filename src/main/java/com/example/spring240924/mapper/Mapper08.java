package com.example.spring240924.mapper;

import com.example.spring240924.controller.dto.c38.Customer;
import com.example.spring240924.controller.dto.c38.Employee;
import org.apache.ibatis.annotations.*;

import java.util.Map;

@Mapper
public interface Mapper08 {

    @Update("""
            UPDATE Customers 
            SET CustomerName = '한강', ContactName = '노벨상', Address = '서울', Country = '한국'
            WHERE CustomerID = 2
            """)
    int update1();


    @Update("""
            UPDATE Customers
            SET CustomerName = #{name},
                ContactName = #{contactName},
                Address = #{address},
                City = #{city},
                PostalCode = #{postalCode},
                Country = #{country}
            WHERE CustomerID = #{id}
            """)
    int update2(String name,
                String contactName,
                String address,
                String city,
                String postalCode,
                String country,
                int id);

    @Update("""
            UPDATE Customers
            SET CustomerName = #{name},
                ContactName = #{contactName},
                Address = #{address},
                City = #{city},
                PostalCode = #{postalCode},
                Country = #{country}
            WHERE CustomerID = #{id}
            """)
    int update3(Customer c);

    @Update("""
            UPDATE Employees
            SET LastName = #{lastName},
                FirstName = #{firstName},
                BirthDate = #{birthDate},
                Photo = #{photo},
                Notes = #{notes}
            WHERE EmployeeID = #{id}
            """)
    int update4(Employee employee);

    @Select("""
            SELECT CustomerID id, CustomerName name, ContactName, Address, City, PostalCode, Country
            FROM Customers
            WHERE CustomerID = #{id}
            """)
    Customer select1(Integer id);


    @Select("""
            SELECT EmployeeID id, LastName, FirstName, BirthDate, Photo, Notes
            FROM Employees
            WHERE EmployeeID = #{id}
            """)
    Employee select2(Integer id);

    //예시 쿼리
//    @Select("""
//SELECT *
//FROM Customers
//WHERE CustomerName = #{b1.name}
//OR ContactName = #{b2.contactName}
//OR CustomerID = #{b1.id}
//OR BirthDate = #{birthDate}
//""")
//    //메소드 아규먼트가 여러개면 쿼리 #{}파라미터에 bean 이름을 앞에 붙여야 한다.
//    Map<String, Object> select03(Bean1 b1, Bean2 b2)

    @Insert("""
            INSERT INTO Customers
            (CustomerName, ContactName, Address, City, PostalCode, Country) 
            VALUES (#{name}, #{contactName}, #{address}, #{city}, #{postalCode}, #{country})""")
    @Options(useGeneratedKeys = true, keyProperty = "id")
        //새로 입력되는 레코드의 pk 업는 어노테이션
    int insert1(Customer customer);

    @Insert("""
            INSERT INTO Employees (LastName, FirstName, BirthDate, Photo, Notes) 
            VALUES (#{firstName}, #{lastName}, #{birthDate}, #{photo}, #{notes})
            """)
    @Options(useGeneratedKeys = true, keyProperty = "id")
    int insert02(Employee employee);
}
