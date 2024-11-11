package com.duongw.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Box<Integer> box = new Box<>(10, "No lucky number");
        Box<Integer> box1 = new Box<>(11, "No lucky number");

        Box<Integer> box2 = new Box<>(13, "No lucky number");
        Box<Integer> box3 = new Box<>(16, "No lucky number");


        Box<Integer> box4 = new Box<>(17, "No lucky number");
        Box<Integer> box5 = new Box<>(14, "No lucky number");


        Box<Integer> box6 = new Box<>(20, "No lucky number");
        Box<Integer> box7 = new Box<>(29, "Yes lucky number");

        List<Box<Integer>> list = new ArrayList<>();

        list.add(box);
        list.add(box1);
        list.add(box2);
        list.add(box3);
        list.add(box4);
        list.add(box5);
        list.add(box6);
        list.add(box7);
        System.out.println(list);

        System.out.println("Enter your lucky number: ");
        Scanner scanner = new Scanner(System.in);
        int luckyNumber = Integer.parseInt(scanner.nextLine());

        // check if the number is in the list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getValue() == luckyNumber) {
                if (list.get(i).getName().equals("Yes lucky number")) {
                    System.out.println("Congratulations! You are lucky!");
                } else {
                    System.out.println("Sorry, you are not lucky!");
                }
            }


        }

        // Java collections framework provides a set of classes and interfaces to store and manipulate groups of objects. Before the introduction of generics, these collections could hold any type of objects, which could lead to runtime errors if the wrong type of object was added or retrieved.
        List<Box<String>> list2 = new ArrayList<>();
        Box<String> box8 = new Box<>("Hello", "No lucky number");
        Box<String> box9 = new Box<>("World", "No lucky number");
        list2.add(box8);
        list2.add(box9);

        List<Box<?>> listNew = new ArrayList<>();

        listNew.add((Box<?>) list);
        listNew.add((Box<?>) list2);


        for (Box<?> boxNew : listNew) {
            for (Box<?> boxNew1 : (List<Box<?>>) boxNew.getValue()) {
                System.out.println("Box: " + boxNew.getName());
                System.out.println(boxNew1.getValue());
            }
        }


    }
}
