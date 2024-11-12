package com.example.spring240924.dto.c10;

public class Computer {
  private int id;
  private String name;
  private String type;
  private boolean expired;
  private Boolean married;

  public Boolean getMarried() {
    return married;
  }

  public void setMarried(Boolean married) {
    this.married = married;
  }

  //property가 boolean타입이면 get메소드는 is로 시작
  public boolean isExpired() {
    return expired;
  }

  public void setExpired(boolean expired) {
    this.expired = expired;
  }

  //model property만 있고 type property는 생기지 않음
  public void setModel(String type) {
    this.type = type;
  }

  public String getModel() {
    return type;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
