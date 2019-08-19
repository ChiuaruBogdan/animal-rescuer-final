package org.fasttrackit.domain;

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
    private long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", health=" + health +
                ", hungerLevel=" + hungerLevel +
                ", happinessLevel=" + happinessLevel +
                ", favouriteFood='" + favouriteFood + '\'' +
                ", favouriteActivity='" + favouriteActivity + '\'' +
                ", type='" + type + '\'' +
                ", energy=" + energy +
                ", breed='" + breed + '\'' +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                '}';
    }

}
