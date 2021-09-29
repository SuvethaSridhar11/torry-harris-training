package com.torryharris.collection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> integerTreeSet = new TreeSet<>();
        integerTreeSet.add(8);
        integerTreeSet.add(11);
        integerTreeSet.add(4);
        integerTreeSet.add(23);
        System.out.println(integerTreeSet);
        integerTreeSet.add(7);
        integerTreeSet.ceiling(3);
        System.out.println(integerTreeSet);

    }
}

