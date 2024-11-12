package com.duongw.collections_fw.list.stack;

import java.util.Stack;

public class CollectionStack {


    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Thêm phần tử vào stack bằng phương thức push()
        stack.push(1);
        stack.push(2);
        stack.push(3); // [1, 2, 3] - phần tử đầu tiên là 3

        System.out.println("Stack: sau khi thêm phần tử: " + stack);

        // Lấy phần tử đầu tiên bằng phương thức pop()
        int poppedElement = stack.pop();
        System.out.println("Phần tử vừa lấy ra: " + poppedElement);
        System.out.println("Stack sau khi lấy ra phần tử: " + stack);

        // Lấy phần tử đầu mà không xóa nó bằng phương thức peek()
        int peekedElement = stack.peek();
        System.out.println("Phần tử đầu tiên (không xóa): " + peekedElement);
        System.out.println("Stack sau khi peek: " + stack);

        // Kiểm tra xem stack có rỗng không
        System.out.println("Stack có rỗng không? " + stack.isEmpty());

        // Tìm vị trí của phần tử trong stack
        int position = stack.search(1);
        System.out.println("Vị trí của phần tử 1 trong stack: " + position);
    }

}

