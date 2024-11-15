package com.duongw.collections_fw.set.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

    public static void main(String[] args) {
        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("Apple");
        linkedSet.add("Banana");
        linkedSet.add("Cherry");

        System.out.println("LinkedHashSet elements in insertion order: " + linkedSet);

        // method addAll
        LinkedHashSet<String> linkedSet2 = new LinkedHashSet<>();
        linkedSet2.add("Orange");
        linkedSet2.add("Lemon");
        linkedSet.addAll(linkedSet2);
        System.out.println("LinkedHashSet elements in insertion order: " + linkedSet);


        // method remove
        linkedSet.remove("Banana");
        System.out.println("LinkedHashSet elements in insertion order: " + linkedSet);

        // method removeIf
        linkedSet.removeIf(item -> item.startsWith("C"));
        System.out.println("LinkedHashSet elements in insertion order: " + linkedSet);

        // duyệt với iterator
        Iterator<String> iterator = linkedSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        // duyệt với foreach
        for (String item : linkedSet) {
            System.out.println(item);
        }

        // method isEmpty
        if (linkedSet.isEmpty()) {
            System.out.println("LinkedHashSet is empty.");
        } else {
            System.out.println("LinkedHashSet is not empty.");


        }

        // method clear
        linkedSet.clear();
        System.out.println("LinkedHashSet elements in insertion order: " + linkedSet);


        // method contains
        if (linkedSet.contains("Cherry")) {
            System.out.println("LinkedHashSet contains 'Cherry'.");
        } else {
            System.out.println("LinkedHashSet does not contain 'Cherry'.");
        }

        // method size
        System.out.println("LinkedHashSet size: " + linkedSet.size());

        // method containsAll
        LinkedHashSet<String> linkedSet3 = new LinkedHashSet<>();
        linkedSet3.add("Apple");
        linkedSet3.add("Banana");
        if (linkedSet.containsAll(linkedSet3)) {
            System.out.println("LinkedHashSet contains all elements of LinkedHashSet3.");
        } else {
            System.out.println("LinkedHashSet does not contain all elements of LinkedHashSet3.");
        }
    }
}
