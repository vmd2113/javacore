package com.duongw.iofile;

public class Main {

    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        // Đọc file danh sách học sinh
        manager.loadStudents();

        // Hiển thị danh sách học sinh hiện tại
        System.out.println("Danh sách học sinh:");
        manager.displayStudents();

        // Thêm học sinh mới
        System.out.println("\nThêm học sinh mới:");
        manager.addStudent(4, "Lan", 88.5);
        manager.displayStudents();

        // Sửa thông tin học sinh
        System.out.println("\nSửa thông tin học sinh có ID 2:");
        manager.updateStudent(2, "Nguyen Van B", 92.0);
        manager.displayStudents();

        // Xóa học sinh
        System.out.println("\nXóa học sinh có ID 3:");
        manager.deleteStudent(3);
        manager.displayStudents();
    }
}
