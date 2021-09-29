package com.torryharris.model;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private int Id;
    private String name;
    private String occupation;
    private String city;

    public Person(int id, String name, String occupation, String city) {
        Id = id;
        this.name = name;
        this.occupation = occupation;
        this.city = city;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", occupation='" + occupation + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.Id-o.Id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getId() == person.getId() && Objects.equals(getName(), person.getName()) && Objects.equals(getOccupation(), person.getOccupation()) && Objects.equals(getCity(), person.getCity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getOccupation(), getCity());
    }
}
