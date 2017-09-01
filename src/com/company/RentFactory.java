package com.company;

import java.util.ArrayList;
import java.util.List;

public class RentFactory {

    public static List<Car> getCars() {
        List<Car> cars = new ArrayList<>();


        cars.add(new SmallCar("ABB765 ", "Opel ", 177000, 178, true));
        cars.add(new SmallCar("BGG876 ", "Fiat ", 197000, 358, true));
        cars.add(new SmallCar("IUU876 ", "Mazda ", 179800, 786, false));
        cars.add(new SmallCar("BFR879 ", "Ford ", 175380, 135, false));
        cars.add(new Bus("EWQ465 ", "Opel ", 177000, 178, true));
        cars.add(new Bus("KUR865 ", "Mercedes ", 177000, 178, true));
        cars.add(new Bus("DDD765 ", "Kia ", 177000, 167, true));
        cars.add(new Truck("ABC465 ", "BMW ", 187600, 986, false));
        cars.add(new Truck("ABB765 ", "Audi ", 198700, 387, true));
        cars.add(new Truck("ABB865 ", "Opel ", 176230, 278, true));


        return cars;
    }

    public static List<Driver> getDrivers() {
        List<Driver> drivers = new ArrayList<>();
        drivers.add(new Driver("Kamil ", "IUU876", true, "A55676C"));
        drivers.add(new Driver("Maciej ", "ABB865", false, "G65433"));
        drivers.add(new Driver("Andrzej ", "ABB765", true, "NH7654"));
        drivers.add(new Driver("Bob ", "DDD765", false, "HYR45667"));
        drivers.add(new Driver("Timi ", "KUR865", true, "DS3458"));
        drivers.add(new Driver("Robert ", "EWQ465", true, "K12780"));
        drivers.add(new Driver("Josh ", "BFR879", false, "Q56780"));
        drivers.add(new Driver("Mario ", "IUU876", true, "GT6789"));
        drivers.add(new Driver("Gorge ", "BGG876", false, "A5987"));
        drivers.add(new Driver("Filip ", "ABB765", true, "A559876"));
        return drivers;


    }


}

