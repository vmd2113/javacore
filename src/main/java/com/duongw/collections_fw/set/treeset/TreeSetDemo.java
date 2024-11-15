package com.duongw.collections_fw.set.treeset;

import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {
        // Khởi tạo TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // Thêm các phần tử vào TreeSet
        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Cherry");

        // In các phần tử theo thứ tự tự nhiên
        System.out.println("TreeSet: " + treeSet);

        // Truy xuất phần tử đầu tiên và cuối cùng
        System.out.println("First element: " + treeSet.first());
        System.out.println("Last element: " + treeSet.last());

        // Trả về tập hợp các phần tử nhỏ hơn "Cherry"
        System.out.println("HeadSet (Cherry): " + treeSet.headSet("Cherry"));

        // Duyệt qua các phần tử
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
