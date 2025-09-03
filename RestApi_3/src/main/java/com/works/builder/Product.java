package com.works.builder;

public class Product {

    private String name;
    private String description;
    private String color;
    private int size;
    private int kg;

    public String getName() {
        return name;
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public String getColor() {
        return color;
    }

    public Product setColor(String color) {
        this.color = color;
        return this;
    }

    public int getSize() {
        return size;
    }

    public Product setSize(int size) {
        this.size = size;
        return this;
    }

    public int getKg() {
        return kg;
    }

    public Product setKg(int kg) {
        this.kg = kg;
        return this;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", kg=" + kg +
                '}';
    }

    public Product build() {
        // call line
        return this;
    }
}

// perde -> 1, 0
// çay -> 0, 1
// new Product().setName("").setdescription("")