package com.duongw.collections_fw.list.linkedlist.core;

public class MyLinkedListv2 {


    private Node head;
    private int size;

    public MyLinkedListv2() {
        head = null;
        size = 0;
    }

    public Node getHead() {
        return head;
    }

    // 1. Thêm phần tử vào đầu
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        size++;
    }

    // 2. Thêm phần tử vào cuối
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // 3. Thêm phần tử vào vị trí cho trước
    // Thêm phần tử vào vị trí cho trước (index bắt đầu từ 0)
    public void addAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Position should be >= 0.");
            return;
        }
        if (position == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Position is out of bounds.");
        } else {
            newNode.next = current.next;
            current.next = newNode;
            size++;
        }
    }


    // 4. Sửa phần tử ở đầu
    public void updateFirst(int data) {
        if (head != null) {
            head.data = data;
        } else {
            System.out.println("List is empty.");
        }
    }

    // 5. Sửa phần tử ở cuối
    public void updateLast(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.data = data;
    }

    // 6. Sửa phần tử ở vị trí cho trước
    // Sửa phần tử ở vị trí cho trước (index bắt đầu từ 0)
    public void updateAtPosition(int data, int position) {
        if (position < 0) {
            System.out.println("Position should be >= 0.");
            return;
        }
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        if (current != null) {
            current.data = data;
        } else {
            System.out.println("Position is out of bounds.");
        }
    }


    // 7. Xóa phần tử ở đầu
    public void deleteFirst() {
        if (head != null) {
            head = head.next;
            size--;
        } else {
            System.out.println("List is empty.");
        }
    }

    // 8. Xóa phần tử ở cuối
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.next == null) {
            head = null;
            size--;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        size--;
    }

    // 9. Xóa phần tử ở vị trí cho trước
    // Xóa phần tử ở vị trí cho trước (index bắt đầu từ 0)
    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("Position should be >= 0.");
            return;
        }
        if (position == 0 && head != null) {
            head = head.next;
            size--;
            return;
        }
        Node current = head;
        for (int i = 0; i < position - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null || current.next == null) {
            System.out.println("Position is out of bounds.");
        } else {
            current.next = current.next.next;
            size--;
        }
    }


    // 10. Hiển thị LinkedList
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // 11. Sắp xếp LinkedList (Bubble Sort)
    public void sort() {
        if (head == null) return;
        Node current, index;
        int temp;
        for (current = head; current.next != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    // 12. Đảo ngược LinkedList
    public void reverse() {
        Node previous = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
    }

    // 13. Truy xuất phần tử ở đầu danh sách
    public int getFirst() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }
        return head.data;
    }

    // 14. Truy xuất phần tử tại vị trí cho trước
    // Truy xuất phần tử tại vị trí cho trước (index bắt đầu từ 0)
    public int getAtPosition(int position) {
        if (position < 0) {
            throw new IllegalArgumentException("Position should be >= 0.");
        }
        Node current = head;
        for (int i = 0; i < position && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            throw new RuntimeException("Position is out of bounds.");
        }
        return current.data;
    }


    // 15. Truy xuất phần tử ở cuối danh sách
    public int getLast() {
        if (head == null) {
            throw new RuntimeException("List is empty.");
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        return current.data;
    }

    // 16. Kiểm tra danh sách trống
    public boolean isEmpty() {
        return head == null;
    }

    // 17. Lấy kích thước danh sách
    public int getSize() {
        return size;
    }
}



