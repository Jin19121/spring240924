package com.example.spring240924.api;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.Map;

@RestController
@RequestMapping("/api/main8")
public class ApiController8 {

  @PostMapping("sub1")
  public void method1(@RequestParam String city,
                      @RequestParam String country,
                      @RequestParam MultipartFile file) {
    System.out.println("city = " + city);
    System.out.println("country = " + country);
    //file name
    System.out.println("file.getOriginalFilename() = " + file.getOriginalFilename());
    //file size
    System.out.println("file.getSize() = " + file.getSize());

    //file save
    try {
      InputStream is = file.getInputStream();
      BufferedInputStream bis = new BufferedInputStream(is);
      String outputFilePath = "C:/Temp/" + file.getOriginalFilename();
      FileOutputStream fos = new FileOutputStream(outputFilePath);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      try (bis; bos; fos; is;) {
        byte[] buffer = new byte[1024];
        int length;
        while ((length = bis.read(buffer)) != -1) {
          bos.write(buffer, 0, length);
        }
        bos.flush();
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @PostMapping("sub2")
  public void method2(@RequestParam String title,
                      @RequestParam MultipartFile file) {
    System.out.println("title = " + title);
    System.out.println("file = " + file.getOriginalFilename());

    try {
      InputStream is = file.getInputStream();
      BufferedInputStream bis = new BufferedInputStream(is);
      String outputFilePath = "C:/Temp/" + file.getOriginalFilename();
      FileOutputStream fos = new FileOutputStream(outputFilePath);
      BufferedOutputStream bos = new BufferedOutputStream(fos);
      try (bis; bos; fos; is;) {
        byte[] buffer = new byte[1024];
        int length;
        while ((length = bis.read(buffer)) != -1) {
          bos.write(buffer, 0, length);
        }
        bos.flush();
      }

    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
