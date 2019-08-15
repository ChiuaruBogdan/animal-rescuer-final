package org.fasttrackit;
// inheritance or "is-a" relationship cu Pet

public class Dog extends Pet{


    private String name;
    private String color;
    private int happinessLevel;


//    public void showHappinessLevel(Dog happinessLevel){
//        System.out.println(getName() + " is wagging his tail because his happiness level is " + getHappinessLevel());
//    }

    @Override
    public void showHappinessLevel() {
        System.out.println(getName() + "'s happiness level is high");
    }


//   @Override
//   public void showHappinessLevel(Pet happinessLevel){
//       System.out.println(getName() +"'s happiness level is" + getHappinessLevel());
//   }


    public Dog(String color) {
        this.color = color;
    }

    public Dog(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public Dog() {

    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }



    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }



    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }









}


//getName() + " is playing with" + pet.getName() + "by doing " + activity.getName());  <<<---