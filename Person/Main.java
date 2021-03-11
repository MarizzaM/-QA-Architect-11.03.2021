package com.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(3, 1.87f, "Dana", new Date(2000, 1 , 3)));
        people.add(new Person(2, 1.55f, "Nira", new Date (1989, 4 , 20)));
        people.add(new Person(1, 1.92f, "Moshe", new Date (1991, 10 , 8)));
        people.add(new Person(4, 1.90f, "Ranny", new Date (2015, 6 , 36)));

        System.out.println("======== before sort ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

//        Collections.sort(people);

        Collections.sort(people, new PersonCompareById());

        System.out.println("======== after sort By Id ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        Collections.sort(people, new PersonCompareByHeight());

        System.out.println("======== after sort By Height ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        Collections.sort(people, new PersonCompareByName());

        System.out.println("======== after sort By Name ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

        Collections.sort(people, new PersonCompareByBirthDay());

        System.out.println("======== after sort By BirthDay ==========");
        for (int index = 0; index < people.size(); index++)
        {
            System.out.println(people.get(index));
        }

    }
}
