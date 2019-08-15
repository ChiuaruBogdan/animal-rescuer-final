package org.fasttrackit;

public class Activity {
    private String name;
    private String type;
    private int happinessLevel;
    private int duration;
    private int exhaustionLevel;

    public Activity() {

    }

    public Activity (String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }


    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }
    public int getHappinessLevel() {
        return happinessLevel;
    }


    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setExhaustionLevel(int exhaustionLevel) {
        this.exhaustionLevel = exhaustionLevel;
    }

    public int getExhaustionLevel() {
        return exhaustionLevel;
    }







}

