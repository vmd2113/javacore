package com.duongw.collections_fw.list.linkedlist.core;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        // Thêm phần tử vào đầu và cuối
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(25);
        System.out.print("Danh sách sau khi thêm phần tử vào đầu và cuối: ");
        list.display();

        // Thêm phần tử vào vị trí cho trước
        list.addAtPosition(15, 3);
        System.out.print("Danh sách sau khi thêm phần tử 15 vào vị trí thứ 3: ");
        list.display();

        // Sửa phần tử ở đầu, cuối và vị trí cho trước
        list.updateFirst(8);
        System.out.print("Danh sách sau khi sửa phần tử ở đầu thành 8: ");
        list.display();

        list.updateLast(30);
        System.out.print("Danh sách sau khi sửa phần tử ở cuối thành 30: ");
        list.display();

        list.updateAtPosition(18, 3);
        System.out.print("Danh sách sau khi sửa phần tử tại vị trí thứ 3 thành 18: ");
        list.display();

        // Xóa phần tử ở đầu, cuối và vị trí cho trước
        list.deleteFirst();
        System.out.print("Danh sách sau khi xóa phần tử ở đầu: ");
        list.display();

        list.deleteLast();
        System.out.print("Danh sách sau khi xóa phần tử ở cuối: ");
        list.display();

        list.deleteAtPosition(2);
        System.out.print("Danh sách sau khi xóa phần tử tại vị trí thứ 2: ");
        list.display();

        // Sắp xếp danh sách liên kết
        list.sort();
        System.out.print("Danh sách sau khi sắp xếp: ");
        list.display();

        // Đảo ngược danh sách
        list.reverse();
        System.out.print("Danh sách sau khi đảo ngược: ");
        list.display();

        // Truy xuất phần tử đầu, cuối và tại vị trí cho trước
        try {
            System.out.println("Phần tử đầu tiên: " + list.getFirst());
            System.out.println("Phần tử cuối cùng: " + list.getLast());
            System.out.println("Phần tử tại vị trí thứ 2: " + list.getAtPosition(2));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        // Kiểm tra danh sách trống
        System.out.println("Danh sách có trống không? " + list.isEmpty());

        // Xóa tất cả các phần tử để danh sách trống
        list.deleteFirst();
        list.deleteFirst();
        list.deleteFirst();
        System.out.println("Danh sách có trống không sau khi xóa hết phần tử? " + list.isEmpty());
    }
}
