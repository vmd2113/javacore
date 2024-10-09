package com.duongw.iofile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<>();
    private final String FILE_PATH = "D:\\@duong\\untitled\\src\\main\\java\\com\\duongw\\iofile\\students.txt";

    // Đọc danh sách học sinh từ file
    public void loadStudents() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] attributes = line.split("\\|");
                if (attributes.length == 3) {
                    int id = Integer.parseInt(attributes[0]);
                    String name = attributes[1];
                    double score = Double.parseDouble(attributes[2]);
                    students.add(new Student(id, name, score));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Ghi danh sách học sinh vào file
    public void saveStudents() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) { // Ghi đè file
            for (Student student : students) {
                writer.write(student.getId() + "|" + student.getName() + "|" + student.getScore());
                writer.write("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Thêm học sinh
    public void addStudent(int id, String name, double score) {
        students.add(new Student(id, name, score));
        saveStudents(); // Ghi lại danh sách sau khi thêm
    }

    // Sửa thông tin học sinh
    public void updateStudent(int id, String newName, double newScore) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.set(i, new Student(id, newName, newScore)); // Cập nhật học sinh
                saveStudents(); // Ghi lại danh sách sau khi cập nhật
                return; // Thoát khỏi phương thức
            }
        }
        System.out.println("Không tìm thấy học sinh với ID: " + id);
    }

    // Xóa học sinh
    public void deleteStudent(int id) {
        students.removeIf(student -> student.getId() == id);
        saveStudents(); // Ghi lại danh sách sau khi xóa
    }

    // Hiển thị danh sách học sinh
    public void displayStudents() {
        for (Student student : students) {
            System.out.println("ID: " + student.getId() + ", Name: " + student.getName() + ", Score: " + student.getScore());
        }
    }
}
