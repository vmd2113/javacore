package com.duongw.collections_fw.list.stack.core;

public class StackLinkedList {
    private StackNode top;
    public StackLinkedList(){
        this.top = null;

    }

    public void push(int data){
        StackNode newNode = new StackNode(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        StackNode current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public int search(int data) {
        StackNode current = top;
        int index = 0;
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean isFull() {
        return false;
    }
}
