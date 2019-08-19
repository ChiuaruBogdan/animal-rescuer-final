package org.fasttrackit;


import org.fasttrackit.domain.Cat;
import org.fasttrackit.domain.Dog;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Pet pet = new Pet();
        pet.setName(("Rex"));
        pet.setAge(3);
        pet.setHappinessLevel(4);
        pet.setHealth(1);
        pet.setHungerLevel(1);
        pet.setFavouriteFood("bones");
        pet.setFavouriteActivity("running");
        pet.setType("dog");
        pet.setBreed("Shepherd");
        pet.setEnergy(9);
        pet.setGender("male");


        Pet dog = new Dog();
        dog.setName("Goku");
        dog.setHappinessLevel(5);
        dog.setHungerLevel(8);
        dog.setFavouriteFood("KFC");
        dog.setFavouriteActivity("playing");

        Cat cat = new Cat();
        cat.setName("Andreea");
        cat.setBreed("Persana");
        cat.setColor("Rosie");
        cat.setHappinessLevel(6);
        cat.setHungerLevel(5);
        cat.setFavouriteActivity("Chilling");
        cat.setFavouriteFood("Crispy Strips");

        Rescuer rescuer = new Rescuer();
        rescuer.setName("Batman");
        rescuer.setMoney(100);
        rescuer.setAge(32);
        rescuer.setGender("male");
        rescuer.setJob("Crime-Fighter");
        rescuer.setFavoriteActivity("running");
        rescuer.setName("Bruce");


        AnimalFood animalFood = new AnimalFood();
        animalFood.setName("Bones");
        animalFood.setAmount(5);
        animalFood.setExpirationDate(LocalDateTime.of(2020, 10, 8, 8, 10, 2));
        animalFood.setPrice(50);
        animalFood.setEnergyLevel(6);
        animalFood.setFlavor("tasty");
        animalFood.setType("crunchy");
        animalFood.setManufacturer("PetShop");

        AnimalFood animalFood2 = new AnimalFood();
        animalFood2.setName("Ice Cream");
        animalFood2.setAmount(4);
        animalFood2.setExpirationDate(LocalDateTime.of(2020, 10, 8, 8, 10, 2));
        animalFood2.setPrice(50);
        animalFood2.setEnergyLevel(6);
        animalFood2.setFlavor("tasty");
        animalFood2.setType("sweet");
        animalFood2.setManufacturer("PetShop");


        Activity activity = new Activity();
        activity.setName("running");
        activity.setType("sport");
        activity.setHappinessLevel(4);
        activity.setDuration(15);
        activity.setExhaustionLevel(5);

        Medic medic = new Medic();
        medic.setName("Jones");
        medic.setSpecialization("Vet");
        medic.setAge(46);
        medic.setServices("treatment");
        medic.setSkill(10);
        medic.setPrice(9.95);


        Game game = new Game();
        game.dog = new Dog();
        game.medic = new Medic();
        game.rescuer = new Rescuer();
        game.cat = new Cat();
        game.start();


//        AnimalCrib animalCrib = new AnimalCrib();
//        animalCrib.setName("Bed");
//        animalCrib.setPrice(50);
//
//        AnimalPark animalPark = new AnimalPark();
//        animalPark.setName("Central");
//
//
//        AnimalToy animalToy = new AnimalToy();
//        animalToy.setName("Squeaky");
//        animalToy.setPrice(3.5);
//        animalToy.setType("Plastic");
//
//
//
    }
}