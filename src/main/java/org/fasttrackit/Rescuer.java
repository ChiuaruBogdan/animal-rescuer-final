package org.fasttrackit;

//inheritance or "is-a" relationship cu Person

public class Rescuer extends Person {

    private String nickname;
    Rescuer rescuer;


    public Rescuer(String name, int money, String job, Rescuer rescuer) {
        super(name, money, job);
        this.rescuer = rescuer;
    }

    public Rescuer(String name, int money, String job, String gender) {
        this.getName();
        this.getMoney();
        this.getJob();
        this.getGender();
    }

    public Rescuer(String nickname) {
        this.nickname = nickname;
    }

    public Rescuer() {

    }




    public void feeding(Pet pet, AnimalFood animalFood) {
        System.out.println(getName() + " is giving some " + animalFood.getName() + " food" + " to " + pet.getName());
        pet.setHungerLevel(pet.getHungerLevel() + 2);
        if (pet.getFavouriteFood().equals(animalFood.getName())){
            pet.setHappinessLevel(pet.getHappinessLevel() + 1);
            System.out.println("The happiness level has received a +1 bonus " +
                    "and it's now at " + pet.getHappinessLevel());
        }
        else {
            pet.setHappinessLevel(pet.getHappinessLevel() + 1);
            System.out.println("Happiness level received bonus +1, it is now: " + pet.getHappinessLevel());
        }
        if (pet.getName().contains("none")) {
            pet.setHungerLevel(pet.getHungerLevel() - 5);
            System.out.println("You did not feed your animal!" + " Food lvl " + "is now " + pet.getHungerLevel());
        }
        System.out.println("Food level after feeding is: " + pet.getHungerLevel());
    }


    public void recreation(Pet pet, Activity activity) {
        System.out.println("The animal's happiness level is " + pet.getHappinessLevel());

        if (pet.getFavouriteActivity().equals(getFavoriteActivity())) {
            pet.happinessLevel++;
            System.out.println(getName() + " is playing with " + pet.getName() + " by doing " + activity.getName());
            System.out.println("THe animal's happiness level is now " + pet.getHappinessLevel());
        }
        else {
            System.out.println("The animal feels like doing his favorite activity");
//        System.out.println(pet.getName() + "'s initial happiness level is " + pet.getHappinessLevel());
            pet.happinessLevel =+ 3;
            System.out.println(getName() + " just took " + pet.getName() + " to " + pet.getFavouriteActivity() +
                    " and the happiness level is now " + pet.getHappinessLevel());
        }
    }

    }



//favorite food pentru initAnimal


