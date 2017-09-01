package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Gps direction = new Gps();
        Random random = new Random();

        List<Car> carList = RentFactory.getCars();
        List<Driver> driversList = RentFactory.getDrivers();

        for (Car car : carList) {
            car.printCar();

            if (car instanceof Truck){
                direction.setLocalization(0.0,0.0,car, new Driver());
            }else {
                direction.setLocalization(random.nextDouble(), random.nextDouble(), car, new Driver("Kasia"));
            }

        }

        System.out.println("\nPrint drivers list:");
        for (Driver driver : driversList) {
            driver.printDriver();

        }

        System.out.println("Please find the driver: Mario");
        direction.findLocalization("Mario");

        direction.printAnvalibleCars(carList);
    }


}
