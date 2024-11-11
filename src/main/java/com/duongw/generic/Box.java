package com.duongw.generic;

public class Box<T> {
    // generic class
    private T value;
    private String name;


    public T getValue() {
        return value;
    }


    public void setValue(T value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // generic method

    public T doSomething(T value) {
        System.out.println("This is generic method, return type is: " + value.getClass());
        return value;
    }
    public Box(T value, String name) {
        this.value = value;
        this.name = name;
    }


}
