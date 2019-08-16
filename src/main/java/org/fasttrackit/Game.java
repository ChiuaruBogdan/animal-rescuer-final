package org.fasttrackit;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Game {

    Rescuer rescuer;
    Pet pet;
    Dog dog;
    Cat cat;
    Medic medic;
    private List<AnimalFood> availableFood = new ArrayList<>();
    private Activity[] availableActivities = new Activity[2];



    public void start() {
        initActivities();
        initAnimal();
        initRescuer();
        initFood();
        nameAnimal();

        int dayNumber = 1;
        boolean winnerNotKnown;
        winnerNotKnown = true;
        while (winnerNotKnown && pet.getHealth() > 0 || pet.getHungerLevel() > 0) {
            System.out.println("It is now day number: " + dayNumber);
            requireFeeding();
            requireActivity();
            if (pet.getHappinessLevel() >= 10) {
                System.out.println("You won!");
                winnerNotKnown = false;
                break;
            }
            if (pet.getHungerLevel() < 0) {
                System.out.println("Game Over! Your pet starved and you lasted for " + dayNumber + "days");
                break;
            }

            dayNumber++;
        }
    }




    private void initFood() {
        AnimalFood carnat = new AnimalFood();
        carnat.setName("Carnat");
        availableFood.add(0, carnat);


        AnimalFood pizza = new AnimalFood();
        pizza.setName("Pizza");
        availableFood.add(1, pizza);
    }

    private void displayFood() {
        System.out.println("Available food: ");
        for (int i = 0; i < availableFood.size(); i++) {
            if (availableFood != null) {
                System.out.println(availableFood.get(i).getName());
            }
        }
    }

    private void initActivities() {
        Activity sport = new Activity();
        sport.setName("Sport");
        availableActivities[0] = sport;

        Activity fun = new Activity();
        fun.setName("Relax");
        availableActivities[1] = fun;
    }


    private void displayActivities() {
        for (Activity activity : availableActivities) {
            if (availableActivities != null) {
                System.out.println("Available activities: " + activity.getName());
            }
        }
    }


    private void initAnimal() {
        System.out.println("Please pick an animal to rescue: (Dog or Cat)");
        Scanner scanner = new Scanner(System.in);
        String pickedAnimal = scanner.nextLine();
        if (pickedAnimal.equals("dog")) {
            System.out.println("You picked to rescue a: " + pickedAnimal);
            pet = new Dog();
        } else {
            if (pickedAnimal.equals("cat")) {
                System.out.println("You picked to rescue a: " + pickedAnimal);
                pet = new Cat();
            } else {
                System.out.println("Please try to pick a dog or cat!");
                initAnimal();
            }
        }
        pet.setHungerLevel(1);
        pet.setHappinessLevel(1);
    }

    private void initRescuer() {
        System.out.println("Please pick a name for the rescuer.");
        try {
            Scanner scanner = new Scanner(System.in);
            String rescuerName = scanner.nextLine();
            System.out.println("You have selected: " + rescuerName);
            rescuer.setName(rescuerName);
        } catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
            System.out.println("You have entered an invalid name. Please try again");
        }
    }

    private void nameAnimal() {
        System.out.println("Please choose a name for your pet. ");
        Scanner scanner = new Scanner(System.in);
        String animalName = scanner.nextLine();
        pet.setName(animalName);
        System.out.println("The name you have selected for your pet is : " + animalName);

        System.out.println("Now please select a favorite food from the following: "
                        + "crispy, shaorma or something else that you want)");
        pet.setFavouriteFood(scanner.nextLine());
        System.out.println(pet.getName() + " likes " + pet.getFavouriteFood());

        System.out.println("Now please select a favorite activity for your pet");
        pet.setFavouriteActivity(scanner.nextLine());
        System.out.println(pet.getName() + "likes " + pet.getFavouriteActivity());
    }

//    private void requireFeeding() {
//        System.out.println("Please pick a food type to feed your pet from the list or type in your favorite food.");
//
//        displayFood();
//        Scanner scanner = new Scanner(System.in);
//        String userInputFood = scanner.nextLine();
//
//        AnimalFood AnimalFood = new AnimalFood();
//        displayFood();
//        AnimalFood.setName(userInputFood);
//        availableFood.add(AnimalFood);
//
//        System.out.println("You have picked: " + userInputFood);
//        rescuer.feeding(pet, AnimalFood);
//
//    }

//    require feeding original mai sus, testez o varianta noua jos

    private void requireFeeding(){
        System.out.print("You can now feed your animal with the following foods or other: ");
        for(int i = 0; i <availableFood.size(); i++){
            System.out.print(availableFood.get(i).getName() + " ");
        }
        AnimalFood animalFood= new AnimalFood();
        System.out.println("Please select a food type.");
        Scanner scanner = new Scanner(System.in);
        String selectedFood = scanner.nextLine();
        animalFood.setName(selectedFood);
        System.out.println("You have picked: " + animalFood.getName());
        rescuer.feeding(pet, animalFood);
    }


    private void requireActivity() {
        System.out.println("You can now play with your pet");
        displayActivities();
        Activity activity = new Activity();

        Scanner scanner = new Scanner(System.in);
        String userInputActivity = scanner.nextLine();
        activity.setName(userInputActivity);
        System.out.println("You have picked: " + activity.getName());

        rescuer.recreation(pet, activity);
    }

}


//    mai jos e versiunea originala de requireActivity

//        private void requireActivity(){
//        displayActivities();
//            System.out.println("Please pick an activity to play with your pet.");
//            Scanner scanner = new Scanner(System.in);
//            String userInputActivity = scanner.nextLine();
//            try {
//                if (userInputActivity.equals("Alergare")) {
//                    System.out.println("You have picked to run with your pet.");
//                }
//                if (userInputActivity.equals("Somn")) {
//                    System.out.println("You have picked to sleep and relax with your pet.");
//                } else {
//                    Activity activity = new Activity();
//                    displayActivities();
//                    activity.setName(userInputActivity);
//                    availableActivities[2] = new Activity();
//                    availableActivities[2] = activity;
//                    System.out.println("You will " + activity.getName() + "with your pet.");
//                }
//            }
//            catch (InputMismatchException | ArrayIndexOutOfBoundsException e) {
//                System.out.println("You have entered an invalid name. Please try again");
//                requireActivity();
//            }
//            }
















