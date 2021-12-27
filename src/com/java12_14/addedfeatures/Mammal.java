package com.java12_14.addedfeatures;

public class Mammal extends Animal{
     String name="Mammal";
     public Mammal(){}
    @Override
    public void eat(){
        System.out.println("eat grass and meat");
    }
    public void bread(){
        System.out.println("breeds through in born");
    }
}
