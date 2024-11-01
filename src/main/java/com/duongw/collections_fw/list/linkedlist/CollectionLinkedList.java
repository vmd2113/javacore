package com.duongw.collections_fw.list.linkedlist;

import java.util.LinkedList;

public class CollectionLinkedList {


    private LinkedList<Integer> linkedList;

    public CollectionLinkedList() {
        linkedList = new LinkedList<>();
    }

    // 1. Thêm phần tử vào đầu
    public void addFirst(int data) {
        linkedList.addFirst(data);
    }

    // 2. Thêm phần tử vào cuối
    public void addLast(int data) {
        linkedList.addLast(data);
    }

    // 3. Thêm phần tử vào vị trí cho trước (index bắt đầu từ 0)
    public void addAtPosition(int data, int index) {
        if (index < 0 || index > linkedList.size()) {
            System.out.println("Index is out of bounds.");
        } else {
            linkedList.add(index, data);
        }
    }

    // 4. Sửa phần tử ở đầu
    public void updateFirst(int data) {
        if (linkedList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            linkedList.set(0, data);
        }
    }

    // 5. Sửa phần tử ở cuối
    public void updateLast(int data) {
        if (linkedList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            linkedList.set(linkedList.size() - 1, data);
        }
    }

    // 6. Sửa phần tử ở vị trí cho trước (index bắt đầu từ 0)
    public void updateAtPosition(int data, int index) {
        if (index < 0 || index >= linkedList.size()) {
            System.out.println("Index is out of bounds.");
        } else {
            linkedList.set(index, data);
        }
    }

    // 7. Xóa phần tử ở đầu
    public void deleteFirst() {
        if (linkedList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            linkedList.removeFirst();
        }
    }

    // 8. Xóa phần tử ở cuối
    public void deleteLast() {
        if (linkedList.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            linkedList.removeLast();
        }
    }

    // 9. Xóa phần tử ở vị trí cho trước (index bắt đầu từ 0)
    public void deleteAtPosition(int index) {
        if (index < 0 || index >= linkedList.size()) {
            System.out.println("Index is out of bounds.");
        } else {
            linkedList.remove(index);
        }
    }

    // 10. Hiển thị LinkedList
    public void display() {
        for (int data : linkedList) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    // 11. Sắp xếp LinkedList (Bubble Sort)
    public void sort() {
        linkedList.sort(Integer::compareTo);
    }

    // 12. Đảo ngược LinkedList
    public void reverse() {
        LinkedList<Integer> reversedList = new LinkedList<>();
        for (int data : linkedList) {
            reversedList.addFirst(data);
        }
        linkedList = reversedList;
    }

    // 13. Truy xuất phần tử ở đầu danh sách
    public int getFirst() {
        if (linkedList.isEmpty()) {
            throw new RuntimeException("List is empty.");
        }
        return linkedList.getFirst();
    }

    // 14. Truy xuất phần tử tại vị trí cho trước (index bắt đầu từ 0)
    public int getAtPosition(int index) {
        if (index < 0 || index >= linkedList.size()) {
            throw new RuntimeException("Index is out of bounds.");
        }
        return linkedList.get(index);
    }

    // 15. Truy xuất phần tử ở cuối danh sách
    public int getLast() {
        if (linkedList.isEmpty()) {
            throw new RuntimeException("List is empty.");
        }
        return linkedList.getLast();
    }

    // 16. Kiểm tra danh sách trống
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
}


