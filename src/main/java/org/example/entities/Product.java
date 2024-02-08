package org.example.entities;

public class Product implements IEntity {
    private int id;
    private String Name;
    private double Price;

    public Product() {

    }
    public Product(int id, String name, double price) {
        this.id = id;
        this.Name = name;
        this.Price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}
