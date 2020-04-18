package com.company;

public class Owner {
    Dog dog;
    Food dogFood;
    Owner(String dogType){
        if(dogType=="Poodle") dog=new Poodle();
        if(dogType=="Terrier") dog=new Terrier();
        if(dogType=="Shepherd Dog") dog=new ShepherdDog();
        dogFood = new Food();
    }
    Food feed(){
        if (Poodle.class.equals(dog.getClass())) dogFood.takeFood(10);
        if (Terrier.class.equals(dog.getClass())) dogFood.takeFood(20);
        if (ShepherdDog.class.equals(dog.getClass())) dogFood.takeFood(30);
        return dogFood;
    }
    void giveCommand(Dog dog){
        dog.executeCommand();
    }
}
