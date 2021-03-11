package com.app;

import java.util.Comparator;

public class PersonCompareByBirthDay implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getM_birth_date().compareTo(o2.getM_birth_date());
    }
}
