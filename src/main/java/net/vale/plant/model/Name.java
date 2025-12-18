package net.vale.plant.model;

import java.sql.Date;

public class Name {
  private Integer id;
  private String name;
  private String description;
  private Date createdAt;
  private Double price;
  private Boolean available;

  public Integer getId() {
    return id;
  }

  public Integer setId(Integer id) {
    this.id = id;
    return id;
  }

  public String getName() {
    return name;
  }

  public String setName(String name) {
    this.name = name;
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String setDescription(String description) {
    this.description = description;
    return description;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
    return createdAt;
  }

  public Double getPrice() {
    return price;
  }

  public Double setPrice(Double price) {
    this.price = price;
    return price;
  }

  public Boolean getAvailable() {
    return available;
  }

  public Boolean setAvailable(Boolean available) {
    this.available = available;
    return available;
  }

  @Override
  public String toString() {
    return "Name [id=" + id + ", name=" + name + ", description=" + description + ", createdAt=" + createdAt
        + ", price=" + price
        + ", available=" + available + "]";
  }
}
