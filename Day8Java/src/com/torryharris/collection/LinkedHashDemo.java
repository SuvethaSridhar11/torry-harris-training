package com.torryharris.collection;

import java.util.LinkedHashSet;

public class LinkedHashDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("HI");
        linkedHashSet.add("hello");
        linkedHashSet.add("hello world");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("HI");
        System.out.println(linkedHashSet);
    }
}
