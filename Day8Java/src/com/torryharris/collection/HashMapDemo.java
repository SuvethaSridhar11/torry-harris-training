package com.torryharris.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        students.put(11,"Suve");
        students.put(12,"Sri");
        students.put(13,"Swar");
        students.put(14,"Suvi");
        System.out.println(students);
        System.out.println("-------------KeySet method ----------");
        for (Integer key: students.keySet()) {
            System.out.println(key+"="+students.get(key));
        }
        System.out.println("----------entry set------------");
        students.entrySet().forEach(entry->{
            System.out.println(entry.getKey()+"="+entry.getValue());
        });
        for(Map.Entry<Integer,String>entry : students.entrySet())
            System.out.println(entry);
        System.out.println();
        BiConsumer<Integer, String> biConsumer = (key,val)->
                System.out.println(key+"="+val);
        students.forEach(biConsumer);

        }

    }

