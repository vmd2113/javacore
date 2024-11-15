package com.duongw.collections_fw.list.arraylist;

import com.duongw.collections_fw.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ArrayListPerson {

    private ArrayList<Person> personArrayList = new ArrayList<>();

    public ArrayListPerson() {
        personArrayList = new ArrayList<>(Arrays.asList(
                new Person(1, "Duong", 18, "IT", "HCM"),
                new Person(2, "Thi", 19, "IT", "HCM"),
                new Person(3, "Hong", 20, "IT", "HCM")));

    }

    public ArrayList<Person> getPersonArrayList() {
        return personArrayList;
    }

    public void setPersonArrayList(ArrayList<Person> personArrayList) {
        this.personArrayList = personArrayList;
    }

    public void addPerson(Person person) {
        personArrayList.add(person);
    }

    public void removePerson(Person person) {
        personArrayList.remove(person);
    }

    public void editPerson(Person person) {
        personArrayList.set(personArrayList.indexOf(person), person);
    }

    public Person findPersonById(int id) {
        for(Person person : personArrayList) {
            if(person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public Person findPersonByName(String name) {
        for(Person person : personArrayList) {
            if(person.getName().equalsIgnoreCase(name)) {
                return person;
            }
        }
        return null;
    }


    // using iterator in arraylist
    public ArrayList<Person> findPersonByAge(int age) {
        ArrayList<Person> personList = new ArrayList<>();
        for(Person person : personArrayList) {
            if(person.getAge() <= age) {
                personList.add(person);
            }
        }
        return personList;
    }

    public ArrayList<Person> findPersonByJob(String job) {
        ArrayList<Person> personList = new ArrayList<>();
        for(Person person : personArrayList) {
            if(person.getJob().equalsIgnoreCase(job)) {
                personList.add(person);
            }
        }
        return personList;
    }

    // sort person

    public void sortByAgeAscending() {
        personArrayList.sort(Comparator.comparingInt(Person::getAge));
    }

    // Sắp xếp theo tuổi từ lớn đến nhỏ
    public void sortByAgeDescending() {
        personArrayList.sort(Comparator.comparingInt(Person::getAge).reversed());
    }

    // Sắp xếp theo tên (thứ tự alphabet)
    public void sortByName() {
        personArrayList.sort(Comparator.comparing(Person::getName));
    }

    // Xóa tất cả những người trong danh sách thỏa mãn điều kiện
    public void removePersonsByAge(int age) {
        personArrayList.removeIf(person -> person.getAge() == age);
    }

    // Kiểm tra xem danh sách có trống không
    public boolean isEmpty() {
        return personArrayList.isEmpty();
    }

    // Đếm số người trong danh sách
    public int getSize() {
        return personArrayList.size();
    }

    // In thông tin của tất cả các Person
    public void printAllPersons() {
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }

}
