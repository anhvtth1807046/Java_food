package entity;

import java.util.ArrayList;

public class Food {
    private int id;
    private String name;
    private String description;
    private double price;
    private String createdAt;

    public Food() {
    }

    public Food(int id, String name, String description, double price, String createdAt) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.createdAt = createdAt;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        System.out.println(String.format("%15s| %15s| %15s| %15s\n", "Mã món ăn", "Tên món ăn", "Giá món ăn", "Ngày tạo món ăn"));
        return String.format("%15s| %15s| %15s| %15s\n", this.id, this.name, this.description, this.createdAt);
    }
}
