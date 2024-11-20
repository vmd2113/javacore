package com.duongw.array;
import com.duongw.collections_fw.Person;

import java.util.Arrays;
import java.util.List;

public class ArraysUtilsDemo {


    public static int[] getRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }


    public static void main(String[] args) {

        int[] array = getRandomArray(10);
        // print array
        System.out.println(Arrays.toString(array));

        // sort array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));


        // find value by binary search
        int value = Arrays.binarySearch(array, 50);
        System.out.println("Value: " + value);

        int value2 = Arrays.binarySearch(array, 100);
        System.out.println("Value: " + value2);

        // equal: sử dụng để thực hiện so sánh các dữ liệu kiểu nguyên thủy, không thể thực hiện so sánh các dữ liệu đói tượng, hoặc reference
        boolean isEqual = Arrays.equals(array, new int[]{1, 2, 3, 4, 5});
        System.out.println("Equal: " + isEqual);


        // fill array: should use to fill all array when initialize by 0, " ", or true, ...
        int[] array2 = new int[10];
        Arrays.fill(array2, 100);
        System.out.println(Arrays.toString(array));

        // fill part of array
        Arrays.fill(array2,1, 5,  0);
        System.out.println(Arrays.toString(array2));


        // copy array

        int[] original = {1, 2, 3};
        int[] copy = Arrays.copyOf(original, 5); // New array size is 5
        System.out.println(Arrays.toString(copy));

        int [] copy2 = Arrays.copyOfRange(original, 1, 3); // New array size is 2

        // other copy method
        int copy3 [] = new int[10];
        System.arraycopy(array2, 0, copy3, 0, 10);
        System.out.println(Arrays.toString(copy3));


        // aslist method
        String[] arr = {"A", "B", "C"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);


        // deep equals
        int [] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Person person1 = new Person(1, "Duong", 18, "Developer", "Ha Noi");
        Person person2 = new Person(2, "Lam", 18, "Manager Winmart", "Ha Noi");

        Person[] personArray = {person1, person2};
        List<Person> list1 = Arrays.asList(personArray);

        Person[] personArray2 = {person1, person2};
        List<Person> list2 = Arrays.asList(personArray2);
        boolean isDeepEqual = Arrays.deepEquals(new List[]{list2}, new List[]{list1});
        System.out.println("Deep Equal: " + isDeepEqual);


        // stream method

        // find max value
        int maxValue = Arrays.stream(array).max().getAsInt();
        System.out.println("Max value: " + maxValue);

        // find min value
        int minValue = Arrays.stream(array).min().getAsInt();
        System.out.println("Min value: " + minValue);

        // find average value
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("Average value: " + average);

        // find sum of all values
        int sumOfAllValues = Arrays.stream(array).sum();
        System.out.println("Sum of all values: " + sumOfAllValues);

    }
}
