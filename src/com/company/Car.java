package com.company;

import java.util.List;

public class Car {
    String plateNumber;
    String brand;
    int mileage;
    int weight;
    int countCar;
    Boolean available;


    public Car(String plateNumber, String brand, int mileage, int weight, Boolean available) {
        this.plateNumber = plateNumber;
        this.brand = brand;
        this.mileage = mileage;
        this.weight = weight;
        this.available = available;
    }

    public Car() {
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getCountCar() {
        return countCar;
    }

    public void setCountCar(int countCar) {
        this.countCar = countCar;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public void printCar() {
        System.out.println("Brand: " + getBrand() + "\nPlate number: " + getPlateNumber() + "\nMileage: " + getMileage() + "\nWeight: " + getWeight() + "\nAvainable:  " + getAvailable());
        System.out.println("--------------------------------");
    }

}
