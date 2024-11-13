package com.example.spring240924.api;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/main7")
public class ApiController7 {

  @GetMapping("sub1")
  public String sub1() {
    return "sub1";
  }

  @GetMapping("sub3")
  public ResponseEntity sub3() {
    ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(200));
    return response;
  }

  @GetMapping("sub4")
  public ResponseEntity sub4() {
    ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(404));
    return response;
  }

  @GetMapping("sub5")
  public ResponseEntity sub5() {
    ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(500));
    return response;
  }

  @GetMapping("sub6")
  public ResponseEntity sub6() {
    ResponseEntity response
            = ResponseEntity.ok().build();
    return response;
  }

  @GetMapping("sub7")
  public ResponseEntity sub7() {
    ResponseEntity response
            = ResponseEntity.notFound().build();
    return response;
  }

  @GetMapping("sub8")
  public ResponseEntity sub8() {
    ResponseEntity response
            = ResponseEntity.noContent().build();
    return response;
  }

  @GetMapping("sub9")
  public ResponseEntity sub9() {
    ResponseEntity response = ResponseEntity.status(405).build();
    return response;
  }

  @GetMapping("sub10")
  public ResponseEntity sub10() {
    ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(202));
    return response;
  }

  @GetMapping("sub11")
  public ResponseEntity sub11() {
    ResponseEntity response = new ResponseEntity(HttpStatusCode.valueOf(403));
    return response;
  }

  @GetMapping("sub12")
  public ResponseEntity sub12() {
    ResponseEntity response = ResponseEntity.status(405).body(Map.of("name", "dk", "age", 28));
    return response;
  }
}
