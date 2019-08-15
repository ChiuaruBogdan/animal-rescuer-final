package org.fasttrackit;
// inheritance or "is-a" relationship cu Dog

public class Pet {

    private String name;
    private int age;
    private int health;
    int hungerLevel;
    int happinessLevel;
    private String favouriteFood;
    private String favouriteActivity;
    private String type;
    private int energy;
    private String breed;
    private String gender;


    public Pet(String name, String type, int age, String breed, String gender) {
        this();
        this.name = name;
        this.type = type;
        this.age = age;
        this.breed = breed;
        this.gender = gender;
    }

    public Pet() {

    }

    public void showHappinessLevel() {
        System.out.println(getName() + "'s happiness level is high");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }


    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }


    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }


    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }


    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }


    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }


}
