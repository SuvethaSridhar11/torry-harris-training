package com.torryharris.collection;

import com.torryharris.comparator.PersonCityComparator;
import com.torryharris.comparator.PersonNameComparator;
import com.torryharris.model.Person;

import java.util.TreeSet;

public class PersonTreeSetDemo {
    public static void main(String[] args) {
        Person p1 = new Person(121, "Suve", "manager", "Chennai");
        Person p2 = new Person(111, "Sri", "hr", "Banglore");
        Person p3 = new Person(131, "Achu", "business", "Trichy");
        TreeSet<Person> people = new TreeSet<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();
        TreeSet<Person> TreeSetByName = new TreeSet<>(new PersonNameComparator());
        TreeSetByName.add(p1);
        TreeSetByName.add(p2);
        TreeSetByName.add(p3);
        for (Person person : TreeSetByName) {
            System.out.println(person);
        }
        System.out.println();
        TreeSet<Person> TreeSetByCity = new TreeSet<>(new PersonCityComparator());
        TreeSetByCity.add(p1);
        TreeSetByCity.add(p2);
        TreeSetByCity.add(p3);
        for (Person person : TreeSetByCity) {
            System.out.println(person);
        }
    }
}
