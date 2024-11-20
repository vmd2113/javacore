package com.duongw.collections_fw.map.hashmap;

import com.duongw.collections_fw.Person;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, new Person(1, "Duong", 18, "Developer", "Ha Noi"));
        personMap.put(2, new Person(2, "Lam", 18, "Manager Winmart", "Ha Noi"));
        personMap.put(3, new Person(3, "Thien", 18, "Trader", "Ha Noi"));
        personMap.put(4, new Person(4, "Ngo", 21, "HR", "Ha Noi"));

        System.out.println("Person Map: " + personMap);

        // method get
        System.out.println("Get person: " + personMap.get(1));

        // method put
        personMap.put(5, new Person(5, "Uyen", 18, "Tester", "Ha Noi"));
        System.out.println("Person Map: " + personMap);

        // method putAll
        HashMap<Integer, Person> personMap2 = new HashMap<>();
        personMap2.put(6, new Person(6, "Ngo", 21, "HR", "Ha Noi"));
        personMap2.put(7, new Person(7, "Uyen", 18, "Tester", "Ha Noi"));
        personMap2.put(8, new Person(8, "Thien", 18, "Trader", "Ha Noi"));

        personMap.putAll(personMap2);
        System.out.println("Person Map: " + personMap);

        // method remove
        personMap.remove(1);
        System.out.println("Person Map: " + personMap);

        // method containsKey
        System.out.println("Contains key 1: " + personMap.containsKey(1));


        // method isEmpty
        System.out.println("Is empty: " + personMap.isEmpty());

        // method size
        System.out.println("Size: " + personMap.size());


        // method keySet
        System.out.println("Key set: " + personMap.keySet());


        // method values
        System.out.println("Values: " + personMap.values());


        // method clear
        personMap.clear();
        System.out.println("Person Map: " + personMap);
    }
}
