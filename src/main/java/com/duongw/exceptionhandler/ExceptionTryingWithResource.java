package com.duongw.exceptionhandler;

import java.util.Scanner;

public class ExceptionTryingWithResource {

    // using try catch with resource : auto closing resource when end of program

    /**
     * Automatic Resource Management : With try-with-resources, resources are automatically closed after the try block, ensuring proper cleanup without the need for explicit finally blocks. This reduces the chance of resource leaks and simplifies code maintenance.
     * <p>
     * Concise and Readable Code : By eliminating the need for boilerplate code to close resources in finally blocks, try-with-resources leads to cleaner and more readable code. Developers can focus on the core logic of the program without getting distracted by resource management concerns.
     * <p>
     * Improved Exception Handling : Any exceptions thrown during the execution of the try block, as well as any exceptions thrown during resource closing, are properly handled. This simplifies error handling and makes code more robust.
     */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        } catch (Exception ex) {
            System.out.println("Please provide input in numerical format only and try again...");
        }
    }
}
