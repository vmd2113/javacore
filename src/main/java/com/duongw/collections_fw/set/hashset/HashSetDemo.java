package com.duongw.collections_fw.set.hashset;

import com.duongw.collections_fw.Person;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {


    public static void main(String[] args) {
        Set<Person> personSet = new HashSet<>();


        personSet.add(new Person(1, "Duong", 18, "Developer", "Ha Noi"));
        personSet.add(new Person(2, "Lam", 18, "Manager Winmart", "Ha Noi"));
        personSet.add(new Person(4, "Thien", 18, "Trader", "Ha Noi"));
        personSet.add(new Person(3, "Duc", 18, "Networking", "Ha Noi"));
        personSet.add(new Person(5, "Uyen", 18, "Tester", "Ha Noi"));
        personSet.add(new Person(6, "Ngo", 21, "HR", "Ha Noi"));

        // thực hiện duyệt với for

        for (Person person : personSet) {
            System.out.println(person);
        }

        // thực hiện duyệt với foreach

        for (Person person : personSet) {
            System.out.println(person);
        }


        // thực hiện duyệt với iterator
        Iterator<Person> iterator = personSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        personSet.forEach(item -> System.out.println(item));
        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        setInteger.add(3);
        setInteger.add(100);
        setInteger.add(45);
        setInteger.add(30);
        setInteger.add(5);
        setInteger.add(7);
        setInteger.add(11);
        setInteger.add(9);
        setInteger.add(21);

        for (Integer integer : setInteger) {
            System.out.println(integer);
        }

        setInteger.add(21);


        // method remove
        setInteger.remove(21);
        System.out.println("After remove: " + setInteger);

        // method contains
        System.out.println("Contains 21: " + setInteger.contains(21));

        // method size
        System.out.println("Size: " + setInteger.size());

        // method clear
        setInteger.clear();
        System.out.println("After clear: " + setInteger);

        // method isEmpty
        System.out.println("Is empty: " + setInteger.isEmpty());



        // method retain all

        Set<String> set1 = new HashSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");

        Set<String> set2 = new HashSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");

        // Giữ lại các phần tử chung giữa set1 và set2
        set1.retainAll(set2);

        System.out.println("Set sau khi gọi retainAll: " + set1);

        // method clone
        Set<String> cloneSet = (Set<String>) ((HashSet<String>) set1).clone();
        System.out.println("Clone set: " + cloneSet);

        // method clear
        cloneSet.clear();





    }

}
