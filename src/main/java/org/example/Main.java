package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        // Call the static methods from Calculator
        int sum = Calculator.add(a, b);
        int difference = Calculator.subtract(a, b);
        int product = Calculator.multiply(a, b);
        int quotient = Calculator.divide(a, b);

        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The quotient is " + quotient);

        scanner.close();
    }
}