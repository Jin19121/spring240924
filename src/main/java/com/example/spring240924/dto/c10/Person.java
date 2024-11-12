package com.example.spring240924.dto.c10;

public class Person {
  private String email;
  private boolean married;
  private String address;
  private int age;

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public boolean isMarried() {
    return married;
  } //field를 Boolean(wrapper)로 선언하면 getMarried 로 된다.

  public void setMarried(boolean married) {
    this.married = married;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
