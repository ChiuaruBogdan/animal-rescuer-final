package org.fasttrackit;

public class PetShop {

    private String name;
    private String products;
    private double price;

    public PetShop(String name, String products, double price){
        this.name = name;
        this.products = products;
        this.price = price;
    }

    public PetShop(){

    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setProducts(String products) {
        this.products = products;
    }
    public String getProducts() {
        return products;
    }


    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }




}
