package entities;

import java.text.SimpleDateFormat;

public class Product {
    private String name;
    private Double price;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
