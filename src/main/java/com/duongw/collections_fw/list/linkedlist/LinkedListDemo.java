package com.duongw.collections_fw.list.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        // Khởi tạo LinkedList
        List<String> animals = new LinkedList<>();

        // Thêm phần tử vào LinkedList
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cow");

        // Truy cập phần tử
        System.out.println("First animal: " + animals.get(0)); // Output: Cat

        // Thêm phần tử vào đầu và cuối
        ((LinkedList<String>) animals).addFirst("Horse");
        ((LinkedList<String>) animals).addLast("Elephant");
        System.out.println("Updated list: " + animals); // Output: [Horse, Cat, Dog, Cow, Elephant]

        // Xóa phần tử
        animals.remove("Cat");
        System.out.println("After removal: " + animals); // Output: [Horse, Dog, Cow, Elephant]

        // Duyệt qua các phần tử
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
