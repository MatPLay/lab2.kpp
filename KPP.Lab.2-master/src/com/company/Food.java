package com.company;

public class Food {
    private int amountOfFood=1000;
    void takeFood(int takenFood){ amountOfFood-=takenFood;}
    int getFood(){ return amountOfFood; }
}
