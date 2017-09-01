package com.company;

public class Driver {
    String name;
    String plateNumber;
    Boolean available;
    String drivingLicense;
    String setName;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getDrivingLicense() {
        return drivingLicense;
    }

    public void setDrivingLicense(String drivingLicense) {
        this.drivingLicense = drivingLicense;
    }

    public Driver() {
    }

    public Driver(String name, String plateNumber, Boolean available, String drivingLicense) {
        this.name = name;
        this.plateNumber = plateNumber;
        this.available = available;
        this.drivingLicense = drivingLicense;
    }

    public Driver(String name) {
        this.name = name;
    }

    public void printDriver() {
        System.out.println("Name: " + name + "," + "Plate Number: " + plateNumber + "," + "Availble:" + available + " ," + "Driving Licence:" + drivingLicense);

    }
}
