package com.app;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Car> cars = new ArrayList<>();

        cars.add(new Car("56-777-65", "Nissan", "Juke", LocalDateTime.of(2016,3,20,0,0,0), "Black", 5 ));
        cars.add(new Car("32-333-23", "Nissan", "Sentra", LocalDateTime.of(2019,4,20,0,0,0), "Black", 5 ));
        cars.add(new Car("55-333-56", "Lincoln", "Navigator ", LocalDateTime.of(2020,4,3,0,0,0), "White", 7 ));
        cars.add(new Car("55-333-55", "Bugatti", "Chiron", LocalDateTime.of(2021,11,15,0,0,0), "Red", 2 ));
        cars.add(new Car("77-888-77", "Hennessey", "VenomGT", LocalDateTime.of(2018,10,5,0,0,0), "Blue", 2 ));

        System.out.println("======== before sort ==========");
        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars);
        System.out.println("\n======== after sort by id ==========");
        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortByBrandAndModel());

        System.out.println("\n======== after sort by brand (model) ==========");
        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortByDateCreation());

        System.out.println("\n======== after sort by date creation ==========");
        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortByColor());

        System.out.println("\n======== after sort by color ==========");
        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }

        Collections.sort(cars, new CarSortBySeats());

        System.out.println("\n======== after sort by seats ==========");
        for (int index = 0; index < cars.size(); index++)
        {
            System.out.println(cars.get(index));
        }


    }
}