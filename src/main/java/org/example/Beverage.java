package org.example;

public abstract class Beverage {
    String description = "UnKnown Beverage";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}