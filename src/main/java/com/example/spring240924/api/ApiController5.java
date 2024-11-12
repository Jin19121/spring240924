package com.example.spring240924.api;

import com.example.spring240924.dto.a5.Book;
import com.example.spring240924.dto.a5.Company;
import com.example.spring240924.dto.a5.Worker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/api/main5")
public class ApiController5 {
  @GetMapping("sub1")
  @ResponseBody
  public String sub1() {
    System.out.println("ApiController5.sub1");
    return "sub1";
  }

  @GetMapping("sub3")
  @ResponseBody
  public String sub3() {
    return "seoul";
  }

  @GetMapping("sub4")
  @ResponseBody
  public Map<String, Object> sub4() {
    return Map.of("name", "kim", "age", 28);
  }

  @GetMapping("sub5")
  @ResponseBody
  public Map<String, Object> sub5() {
    return Map.of("title", "도겸 시점", "content", "street photos", "price", 45000, "available", false);
  }

  @GetMapping("sub6")
  @ResponseBody
  public Map<String, Object> sub6() {
    return Map.of("name", "son",
            "items", List.of("치킨", "돈까스", "떡볶이"),
            "team", Map.of("name", "토트넘", "location", "런던"));
  }

  @GetMapping("sub7")
  @ResponseBody
  public Map<String, Object> sub7() {
    return Map.of("product", Map.of(
                    "name", "book",
                    "price", 4500,
                    "quality", "supreme"),
            "company", Map.of("location", List.of("용산", "jeju")));
  }

  @GetMapping("sub8")
  @ResponseBody
  public Book sub8() {
    Book book = new Book();
    book.setTitle("도겸시점");
    book.setAuthor("DK");
    book.setContent("길거리 사진");
    book.setPrice(4500);

    return book;
  }

  @GetMapping("sub9")
  @ResponseBody
  public Worker sub9() {
    Worker worker = new Worker();
    Company company = new Company();
    company.setName("woozo");
    company.setLocation("Hype");

    worker.setName("Minghao");
    worker.setAddress("caratLand");
    worker.setMarried(false);
    worker.setItems(List.of("shoes", "sheep"));
    worker.setCompany(company);

    return worker;
  }

  @GetMapping("sub10")
  @ResponseBody
  public List<Book> sub10() {
    Book book1 = new Book();
    book1.setTitle("Book 1");
    book1.setAuthor("Author 1");
    book1.setContent("Content 1");
    book1.setPrice(3000);
    
    Book book2 = new Book();
    book2.setTitle("Book 2");
    book2.setAuthor("Author 2");
    book2.setContent("Content 2");

    book2.setPrice(4000);
    Book book3 = new Book();
    book3.setTitle("Book 3");
    book3.setAuthor("Author 3");
    book3.setContent("Content 3");
    book3.setPrice(5000);

    return List.of(book1, book2, book3);
  }
}
