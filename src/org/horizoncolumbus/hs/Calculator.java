package org.horizoncolumbus.hs;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        System.out.println("Give Operation: (Add, Sub, Mul, Div)");
        Scanner input = new Scanner(System.in);
        String operation = input.next().toLowerCase();
        System.out.println("Give 1st Number: (NOTE: Num1 is ALWAYS first)");
        Scanner inputNum1 = new Scanner(System.in);
        int number1 = inputNum1.nextInt();
        System.out.println("Give 2nd Number:");
        Scanner inputNum2 = new Scanner(System.in);
        int number2 = inputNum2.nextInt();

        switch (operation) {
            case "add": {
                int result = number1 + number2;
                System.out.println(number1 + " + " + number2);
                System.out.println("Result: " + result);
                break;
            }
            case "sub": {
                int result = number1 - number2;
                System.out.println(number1 + " - " + number2);
                System.out.println("Result: " + result);
                break;
            }
            case "mul": {
                int result = number1 * number2;
                System.out.println(number1 + " * " + number2);
                System.out.println("Result: " + result);
                break;
            }
            case "div": {
                int result = number1 / number2;
                System.out.println(number1 + " / " + number2);
                System.out.println("Result: " + result);
                break;
            }
            default: System.out.println("Invalid operation. Given: " + operation);
        }

    }
}
