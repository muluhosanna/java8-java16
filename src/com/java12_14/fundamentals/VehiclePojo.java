package com.java12_14.fundamentals;
/*
* Using this class we will generate a record;
 */

public class VehiclePojo {
    private String brand;
    private String licensePlate;
    private int numberOfSeats;
    private String color;

    public VehiclePojo(String brand, String licensePlate, int numberOfSeats, String color) {
        this.brand = brand;
        this.licensePlate = licensePlate;
        this.numberOfSeats = numberOfSeats;
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColor() {
        return color;
    }

    @Override
    public int hashCode() {
        return this.brand.hashCode() * this.licensePlate.hashCode();
    }

    public boolean equals(Object others) {
        if (others == null) {
            return false;

        }
        if (!(others instanceof VehiclePojo)){
            return false;
        }
        VehiclePojo otherVehicle = (VehiclePojo) others;
        return this.brand.equals(otherVehicle.brand)&&this.licensePlate.equals(otherVehicle.licensePlate);
    }
    public String toString(){
        return "Vehicle[brands=" + this.brand +",licensePlate=" +this.licensePlate + "Number of seats:"+
                this.numberOfSeats+ "Color:"+ this.color +"]";
    }
}


