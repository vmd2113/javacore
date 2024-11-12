package com.duongw.collections_fw.list.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionDequeArray {

    public static void main(String[] args) {


        Deque<Integer> stack = new ArrayDeque<>();

        // Thêm phần tử vào stack
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack sau khi thêm phần tử: " + stack);

        // Lấy phần tử đầu tiên ra khỏi stack
        int poppedElement = stack.pop();
        System.out.println("Phần tử vừa lấy ra: " + poppedElement);
        System.out.println("Stack sau khi lấy ra phần tử: " + stack);

        // Lấy phần tử đầu tiên mà không xóa nó
        int peekedElement = stack.peek();
        System.out.println("Phần tử đầu tiên (không xóa): " + peekedElement);
        System.out.println("Stack sau khi peek: " + stack);

        // Kiểm tra xem stack có rỗng không
        System.out.println("Stack có rỗng không? " + stack.isEmpty());




    }
}
