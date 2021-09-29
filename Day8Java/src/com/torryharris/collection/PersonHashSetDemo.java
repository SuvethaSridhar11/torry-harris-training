package com.torryharris.collection;

import com.torryharris.model.Person;

import java.util.HashSet;
import java.util.TreeSet;

public class PersonHashSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(121, "Suve", "manager", "Chennai");
        Person p2 = new Person(111, "Sri", "hr", "Banglore");
        Person p3 = new Person(131, "Achu", "business", "Trichy");
        HashSet<Person> people = new HashSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        for (Person person : people)
            System.out.println(person);


    }
}
