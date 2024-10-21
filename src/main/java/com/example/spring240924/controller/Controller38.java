package com.example.spring240924.controller;

import com.example.spring240924.controller.dto.c38.Customer;
import com.example.spring240924.controller.dto.c38.Employee;
import com.example.spring240924.mapper.Mapper08;
import lombok.RequiredArgsConstructor;
import org.eclipse.jdt.internal.compiler.env.ICompilationUnit;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("main38")
@RequiredArgsConstructor
public class Controller38 {
    private final Mapper08 mapper08;

    @GetMapping("sub1")
    public void method1() {
        mapper08.update1();
    }

    @GetMapping("sub2")
    public void method2() {
        mapper08.update2("DK", "겸", "용산", "서울", "1034", "한국", 2);
    }

    @GetMapping("sub3")
    public void method3() {
        Customer customer = new Customer();
        customer.setId(2);
        customer.setName("석민");
        customer.setContactName("도겸");
        customer.setAddress("용인");
        customer.setCity("서울");
        customer.setPostalCode("2018");
        customer.setCountry("Korea");
        mapper08.update3(customer);
    }

    @GetMapping("sub4")
    public void method4(String name,
                        String contactName,
                        String address,
                        String city,
                        String postalCode,
                        String country,
                        int id) {
        mapper08.update2(name, contactName, address, city, postalCode, country, id);
    }

    @GetMapping("sub5")
    public void method5(Customer customer) {
        mapper08.update3(customer);
    }

    @GetMapping("sub6")
    public void method6(Employee employee) {
        mapper08.update4(employee);
    }

    @GetMapping("sub7")
    public void method7(Integer id, Model model) {
        Customer customer = mapper08.select1(id);
        if (customer != null) {
            model.addAttribute("customer", customer);
        }
    }

    @PostMapping("sub8")
    public void method8(Customer customer) {
        mapper08.update3(customer);
    }

    @GetMapping("sub9")
    public void method9(Integer id, Model model) {
        Employee employee = mapper08.select2(id);
        if (employee != null) {
            model.addAttribute("employee", employee);
        }
    }

    @PostMapping("sub10")
    public void method10(Employee employee) {
        mapper08.update4(employee);
    }

    @GetMapping("sub11")
    public void method11() {
        Customer customer = new Customer();
        customer.setName("한강");
        customer.setContactName("노벨");
        customer.setPostalCode("1015");
        customer.setAddress("광주");
        customer.setCity("서울");
        customer.setCountry("한국");

        System.out.println("입력 전: " + customer);
        mapper08.insert1(customer);
        System.out.println("입력 후: " + customer);
    }

    @GetMapping("sub12")
    public void method12() {
        Employee employee = new Employee();
        employee.setFirstName("명호");
        employee.setLastName("Seo");
        employee.setBirthDate(LocalDate.parse("1997-07-07"));
        employee.setPhoto("NA");
        employee.setNotes("SVT Performance Team");

        System.out.println("입력 전 = " + employee);
        mapper08.insert02(employee);
        System.out.println("입력 후 = " + employee);
    }
}
