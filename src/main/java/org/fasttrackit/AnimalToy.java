package org.fasttrackit;

public class AnimalToy {


    private String name;
    private double price;
    private String type;


    public AnimalToy(String name, double price, String type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    public AnimalToy(){

    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }




    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }




}
