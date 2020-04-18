package com.company;

public class Dog {
    private byte age;
    private String name;
    {
        age=1;
        name="Chappie";
    }
    Dog(){
    }
    Dog(byte dogAge, String dogName){
        age=dogAge;
        name=dogName;
    }
    boolean executeCommand(){
        double rand = Math.random()*5;
        if(this.age>2){
            if(rand>1) return true;
            else return false;
        }else{
            if(rand>2) return true;
            else return false;
        }
    }
    void wantEat(Owner owner){
        owner.feed();
    }
    String getInfo(){
        String str = name+" "+String.valueOf(age)+" years";
        return str;
    }
}

class Poodle extends Dog{
    Poodle(){
    }
    Poodle(byte dogAge, String dogName) {
        super(dogAge, dogName);
    }
}

class Terrier extends Dog{
    Terrier(){
    }
    Terrier(byte dogAge, String dogName) {
        super(dogAge, dogName);
    }
}

class ShepherdDog extends Dog{
    ShepherdDog(){
    }
    ShepherdDog(byte dogAge, String dogName) {
        super(dogAge, dogName);
    }
}