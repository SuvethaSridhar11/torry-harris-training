package com.torryharris.collection;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> strHash = new HashSet<>();
        strHash.add("hi");
        strHash.add("hello");
        strHash.add("hi world");
        System.out.println(strHash);
        System.out.println(strHash.contains("hi"));
        strHash.add(null);
        strHash.remove("hi");
        System.out.println(strHash);
        System.out.println(strHash.contains("hi"));
        System.out.println();
        HashSet<Integer> intHash = new HashSet<>();
        intHash.add(11);
        intHash.add(16);
        intHash.add(1);
        intHash.add(9);
        System.out.println(intHash);
        System.out.println();
        HashSet<Double> doubleHash = new HashSet<>();
        doubleHash.add(34.544);
        doubleHash.add(35.54);
        doubleHash.add(36.5);
        System.out.println(doubleHash);
        doubleHash.remove(35.54);
        System.out.println(doubleHash);
        System.out.println(doubleHash.contains(35.54));
    }
}
