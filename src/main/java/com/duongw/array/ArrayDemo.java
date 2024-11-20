package com.duongw.array;

import java.util.Arrays;
import java.util.Objects;

public class ArrayDemo {


    public static void print2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {


        // one dimensional array
        int array[] = new int[10];

        array[1] = 1;
        array[2] = 1;
        array[3] = 4;
        array[4] = 5;
        array[5] = 6;
        array[6] = 7;
        array[7] = 8;
        array[8] = 9;
        array[9] = 10;

        // use for loop
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        // use foreach
        for (int num : array) {
            System.out.println(num);
        }

        // using Object
        Object object = array;
        if (object instanceof int[]) {
            System.out.println("object instanceof int[]");
        }

        Object objectArray[] = new Object[5];

        objectArray[0] = "apple";
        objectArray[1] = new StringBuilder("orange");
        objectArray[2] = new int[5];
        objectArray[3] = "grape";
        objectArray[4] = "watermelon";

        for (Object object1 : objectArray) {
            System.out.println(object);
        }


        // two dimensional array

        int array2[][] = new int[2][3];
        array2[0][0] = 1;
        array2[0][1] = 2;
        array2[0][2] = 3;
        array2[1][0] = 4;
        array2[1][1] = 5;
        array2[1][2] = 6;


        int array3[][] = {{1, 2, 3}, {4, 5, 6}};

        // deep equals
        Arrays.deepEquals(array2, array3);


    }
}
