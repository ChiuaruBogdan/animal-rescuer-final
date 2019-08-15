package org.fasttrackit;

import java.time.LocalDateTime;

public class AnimalFood {

    private String name;
    private int price;
    private int amount;
    private int energyLevel;
    private String flavor;
    private String type;
    private String manufacturer;
    private LocalDateTime expirationDate;

    public AnimalFood(String name, int price, String manufacturer, String type){
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.type = type;
    }
    public AnimalFood() {

    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setPrice(int price) {
        this.price = price;
    }
    public int getPrice() {
        return price;
    }


    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }


    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }
    public int getEnergyLevel() {
        return energyLevel;
    }


    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    public String getFlavor() {
        return flavor;
    }


    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }


    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }



    public void setExpirationDate(LocalDateTime expirationDate) {
        this.expirationDate = expirationDate;
    }

    public LocalDateTime getExpirationDate() {
        return expirationDate;
    }







//    LocalDateTime expirationDate = LocalDateTime.of(2020,10, 8,8,10,2);

    }

