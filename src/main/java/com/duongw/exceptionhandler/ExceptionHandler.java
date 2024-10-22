package com.duongw.exceptionhandler;

import java.util.Scanner;
import java.util.logging.Logger;

public class ExceptionHandler {

    private static Logger logger = Logger.getLogger(
            ExceptionHandler.class.getName());

    // exception handler example using try catch
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero");
        }

        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(numbers[5]);
        } catch (Exception ex) {
            logger.severe("Invalid Array index. Please try again with a valid index number");
        }

        // using multiple catch blocks
        String input = null;
        try {
            input = "Madan";
            input = input.toUpperCase();
            logger.info(input);
            input = input.substring(1, 10);
            logger.info(input);
        } catch (NullPointerException ex) {
            logger.severe("An null pointer exception occurred. Please check your data");
        } catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException ex) {
            logger.severe("IndexOutOfBoundsException exception occurred. Please check your input data");
        } catch (Exception ex) {
            logger.severe("An exception occurred. Please check your program");
        }

        // using final block
        Scanner scanner = new Scanner(System.in);
        try {

            scanner = new Scanner(System.in);
            System.out.println("Enter a number....");
            int number = scanner.nextInt();
            System.out.println(number);
        }
        catch(Exception ex){
            System.out.println("Please provide input in numerical format only and try again...");
        }
        finally{
            System.out.println("finally block is being executed");
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
