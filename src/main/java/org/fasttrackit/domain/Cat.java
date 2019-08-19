package org.fasttrackit.domain;

import org.fasttrackit.domain.Dog;

public class Cat extends Dog {


    @Override
    public void showHappinessLevel() {
        super.showHappinessLevel();
    }

    public Cat(String color) {
        super(color);
    }

    public Cat(int happinessLevel) {
        super(happinessLevel);
    }

    public Cat() {
        super();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setHappinessLevel(int happinessLevel) {
        super.setHappinessLevel(happinessLevel);
    }

    @Override
    public int getHappinessLevel() {
        return super.getHappinessLevel();
    }

    @Override
    public void setAge(int age) {
        super.setAge(age);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }

    @Override
    public void setHealth(int health) {
        super.setHealth(health);
    }

    @Override
    public int getHealth() {
        return super.getHealth();
    }

    @Override
    public void setHungerLevel(int hungerLevel) {
        super.setHungerLevel(hungerLevel);
    }

    @Override
    public int getHungerLevel() {
        return super.getHungerLevel();
    }

    @Override
    public void setFavouriteFood(String favouriteFood) {
        super.setFavouriteFood(favouriteFood);
    }

    @Override
    public String getFavouriteFood() {
        return super.getFavouriteFood();
    }

    @Override
    public void setFavouriteActivity(String favouriteActivity) {
        super.setFavouriteActivity(favouriteActivity);
    }

    @Override
    public String getFavouriteActivity() {
        return super.getFavouriteActivity();
    }

    @Override
    public void setType(String type) {
        super.setType(type);
    }

    @Override
    public String getType() {
        return super.getType();
    }

    @Override
    public void setEnergy(int energy) {
        super.setEnergy(energy);
    }

    @Override
    public int getEnergy() {
        return super.getEnergy();
    }

    @Override
    public void setBreed(String breed) {
        super.setBreed(breed);
    }

    @Override
    public String getBreed() {
        return super.getBreed();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }
}
