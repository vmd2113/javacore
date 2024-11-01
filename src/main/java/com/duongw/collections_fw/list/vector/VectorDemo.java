package com.duongw.collections_fw.list.vector;

import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {


        Vector<Integer> vector = new Vector<>(5, 2); // dung lượng ban đầu là 5, tăng thêm 2 khi đầy

        // 1. Thêm phần tử vào Vector
        vector.add(10);
        vector.add(20);
        vector.add(30);
        vector.add(40);
        vector.add(50);

        vector.add (3, 35); // thêm phần tử tại vị trí 3
        System.out.println("Vector sau khi thêm phần tử: " + vector);

        // 2. Truy cập phần tử tại một vị trí cụ thể
        System.out.println("Phần tử tại vị trí 2: " + vector.get(2));

        // 3. Thay thế phần tử tại vị trí 1
        vector.set(1, 25);
        System.out.println("Vector sau khi thay thế phần tử tại vị trí 1: " + vector);

        // 4. Xóa phần tử tại vị trí 3
        vector.remove(3);
        System.out.println("Vector sau khi xóa phần tử tại vị trí 3: " + vector);

        // 5. Kiểm tra kích thước và dung lượng hiện tại
        System.out.println("Kích thước của Vector: " + vector.size());
        System.out.println("Dung lượng của Vector: " + vector.capacity());

        // 6. Thêm phần tử để kiểm tra khả năng tăng dung lượng
        vector.add(60);
        vector.add(70);
        System.out.println("Vector sau khi thêm thêm phần tử: " + vector);
        System.out.println("Dung lượng của Vector sau khi mở rộng: " + vector.capacity());

        // 7. Sử dụng firstElement() và lastElement()
        System.out.println("Phần tử đầu tiên: " + vector.firstElement());
        System.out.println("Phần tử cuối cùng: " + vector.lastElement());

        // 8. Duyệt qua Vector
        System.out.print("Duyệt qua các phần tử trong Vector: ");
        for (Integer element : vector) {
            System.out.print(element + " ");
        }
        // 9. Duyệt vector sử dụng Iterator
        System.out.print("\nDuyệt vector sử dụng Iterator: ");
        java.util.Iterator<Integer> iterator = vector.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
