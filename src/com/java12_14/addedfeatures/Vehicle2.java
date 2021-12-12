package com.java12_14.addedfeatures;

public record Vehicle2(String brand,String licensePlate, int numberOfSeats, String color) {
    public Vehicle2(String brand,String licensePlate){
        this(brand,licensePlate,0,null);

    }
    public String brandAsLowerCase(){
        return brand.toLowerCase();
    }
}
