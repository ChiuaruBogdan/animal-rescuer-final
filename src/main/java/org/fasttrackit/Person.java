package org.fasttrackit;

import javax.naming.Name;

public class Person {
//    am adaugat clasa asta pentru "if-a" relationships

    private String name;
    private int money;
    private String job;
    private String gender;
    private String favoriteActivity;
    private int age;
    private String services;
    private double price;


    public Person(String name, int money, String job){
        this.name = name;
        this.money = money;
        this.job = job;
    }

    public Person() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setServices(String services) {
        this.services = services;
    }

    public String getServices() {
        return services;
    }


    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }





    }



