package com.duongw.collections_fw._exampledemo;

import java.util.*;

public class ArraylistDemo {
    public static void main(String[] args) {


        ArrayList<Integer> listInteger = new ArrayList<>(); // <Integer>

        List<Character> listCharacter = new ArrayList<>(); // <Character>

        var doubleNums = new ArrayList<Double>();


        List<String> myFriendsName = new ArrayList<>();

        myFriendsName.add("Duong");
        myFriendsName.add("Thi");
        myFriendsName.add("Hong");
        myFriendsName.add("Van");
        myFriendsName.add("Duong");

        System.out.println(myFriendsName);

        String exampleAccessElement = myFriendsName.get(2);
        System.out.println("exampleAccessElement: " + exampleAccessElement);

        myFriendsName.set(2, "Thanh");
        System.out.println(myFriendsName);

        myFriendsName.remove(3);


        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(5);
        System.out.println(listInteger);

        listInteger.remove(3);
        System.out.println(listInteger);

        doubleNums.add(1.0);
        doubleNums.add(2.0);
        doubleNums.add(3.0);
        doubleNums.add(4.0);
        doubleNums.add(5.0);
        System.out.println(doubleNums);


        // Using loop in arraylist

        //using for each
        for (String name : myFriendsName) {
            System.out.println(name);
        }

        // using for loop
        for (int i = 0; i < myFriendsName.size(); i++) {
            System.out.println(myFriendsName.get(i));
        }

        // using iterator
        Iterator<String> iterator = myFriendsName.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        // using listIterator
        ListIterator<String> listIterator = myFriendsName.listIterator();
        while (listIterator.hasNext()) {
            String name = listIterator.next();
            System.out.println(name);
        }

        while (listIterator.hasPrevious()) {
            String name = listIterator.previous();
            System.out.println(name);
        }


        // araylist vs array
        ArrayList<String> countryNames = new ArrayList<>();
        countryNames.add("India");
        countryNames.add("Canada");
        countryNames.add("USA");
        countryNames.add("Germany");
        countryNames.add("India");

        String[] countries = countryNames.toArray(new String[countryNames.size()]);
        System.out.println(Arrays.toString(countries));

        List<String> newList = Arrays.asList(countries);
        System.out.println(newList);



        // using diamond operator
        ArrayList<Integer> nums = new ArrayList<>();
        List<Character> characters = new ArrayList<>();
        var doubleNums_ = new ArrayList<Double>();
        List<String> countryNames_ = new ArrayList<>();

        // immutable list vs mutable list

        List<Integer> accountNums = new ArrayList<>();
        accountNums.add(325454);
        accountNums.add(325455);
        accountNums.add(325456);
        accountNums = Collections.unmodifiableList(accountNums);
        List<Integer> immutableAccountNums = List.of(325454, 325455, 325456);
        var arrayListObject = new ArrayList<Integer>(immutableAccountNums);
        addTenDollars(arrayListObject);


    }

    private static List<Integer> addTenDollars(List<Integer> accountNums) {
        accountNums.add(545643);
        for(Integer account: accountNums) {
            System.out.println("Ten Dollars credited into the account : "+account);
        }
        return accountNums;
    }


}
