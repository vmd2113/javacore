package com.duongw.collections_fw.list.stack.core;

public class StackArray {
    int maxSize;
    int [] stackArray;
    int top;


    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full, cannot push " + data);
        } else {
            top++;
            stackArray[top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return -1;
        } else {
            int value = stackArray[top];
            top--;
            return value;
        }

    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty, cannot peek.");
            return -1;
        } else {
            return stackArray[top];
        }
    }

    int search(int data) {
        for (int i = 0; i <= top; i++) {
            if (stackArray[i] == data) {
                return i;
            }
        }
        return -1;
    }

    int size() {
        return top + 1;
    }


    public static void main(String[] args) {
        StackArray stack = new StackArray(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack.search(2));
        System.out.println(stack.size());

        // pop
        System.out.println(stack.pop());

        // peek
        System.out.println(stack.peek());

        // isEmpty
        System.out.println(stack.isEmpty());

        // isFull
        System.out.println(stack.isFull());
    }



}
