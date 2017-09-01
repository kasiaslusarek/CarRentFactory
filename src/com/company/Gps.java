package com.company;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.List;

public class Gps {

    private Double latitude;
    private Double longitude;
    private Car car;
    private Driver driver;
    private List<Gps> localization = new ArrayList<Gps>();

    public Gps() {
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Gps(Double latitude, Double longitude, Car car, Driver driver) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.car = car;
        this.driver = driver;

    }

    public void setLocalization(Double latitude, Double longitude, Car car, Driver driver) {
        Gps newLocalization = new Gps(latitude, longitude, car, driver);
        localization.add(newLocalization);

        if (latitude != 0.0 && longitude != 0.0) {
            car.setAvailable(false);
        } else {
            car.setAvailable(true);
        }

        System.out.println("New location has been set.");
    }

    public void findLocalization(String name) {
        for (Gps gps : localization) {
            if (gps.driver.getName() != null && gps.driver.getName().equals(name)) {
                System.out.println("Current Driver's position: " + gps.getLatitude() + "/" + gps.getLongitude());
                break;
            } else {
            }
        }
        System.out.println("I'm not able to find a driver: " + name);

    }

    public void printAnvalibleCars (List<Car> carList){
        System.out.println("\n-----------------------------------------\n");
        System.out.println("Available cars :");
        for (Car car : carList) {
            if(car.getAvailable().equals(true)) {
                car.printCar();
            }
        }

    }




}
