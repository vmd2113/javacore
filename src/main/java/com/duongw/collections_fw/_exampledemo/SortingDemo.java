package com.duongw.collections_fw._exampledemo;

import com.duongw.collections_fw._exampledemo.sort.LastCharComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingDemo {

    /**
     * Demo of sorting using collections.sort() and Comparator
     *
     * <pre>
     * 1. Sort list of integers in natural order
     * 2. Sort list of integers in reverse order
     * 3. Sort list of strings in natural order
     * 4. Sort list of strings in reverse order
     * 5. Sort list of strings using custom comparator, LastCharComparator
     * </pre>
     */

    public static void main(String[] args) {


        // sorting using collection sort
        List<Integer> numbers = new ArrayList<>();

        numbers.add(47);
        numbers.add(43);
        numbers.add(67);
        numbers.add(92);
        numbers.add(3);
        numbers.add(-67);
        numbers.add(-2);
        numbers.add(0);

        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        Collections.sort(numbers, Comparator.reverseOrder());
        System.out.println(numbers);

        var countries = new ArrayList<String>();
        countries.add("India");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Canada");

        System.out.println(countries);
        countries.sort(Comparator.naturalOrder());
        System.out.println(countries);
        countries.sort(Comparator.reverseOrder());
        System.out.println(countries);

        var countries1 = new ArrayList<String>();
        countries1.add("India");
        countries1.add("USA");
        countries1.add("Japan");
        countries1.add("France");
        countries1.add("Canada");

        // countries1.sort(new LastCharComparator());

        Collections.sort(countries1, new LastCharComparator());
        System.out.println(countries1);
    }


}

