/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09;

import java.util.Scanner;

/**
 *
 * @author LOQ
 */
public class Validation {

    private static final Scanner sc = new Scanner(System.in);

    public static String inputString() {
        while (true) {
            String input = sc.nextLine();
            if (input != null || !input.trim().isEmpty()) {
                return input.trim();
            }
            System.err.println("Input cannot be empty!");
        }
    }

    public static Double checkIn(String inputVal) {
        if (inputVal == null || inputVal.trim().isEmpty()) {
            return null;
        }
        try {
            return Double.parseDouble(inputVal);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Double inputDouble(String msg, String errMsg) {
        while (true) {
            System.out.print(msg);
            String input = inputString();
            Double result = checkIn(input);
            if (result != null) {
                return result;
            }
            System.err.println(errMsg);
        }
    }

    public static Operator checkOperator(String operator) {
        if (operator == null) {
            return null;
        }
        switch (operator.trim()) {
            case "+":
                return Operator.ADD;
            case "-":
                return Operator.SUBTRACT;
            case "*":
                return Operator.MULTIPLY;
            case "/":
                return Operator.DIVIDE;
            case "^":
                return Operator.EXPONENT;
            case "=":
                return Operator.EQUAL;
            default:
                return null;
        }
    }

    public static Operator inputOperator() {
        while (true) {
            System.out.print("Enter Operator: ");
            String input = inputString();
            Operator op = checkOperator(input);
            if (op != null) {
                return op;
            }
            System.out.println("Please input (+, -, *, /, ^)");
        }
    }

    public static int inputChoice(int min, int max) {
        while (true) {
            try {
                int choice = Integer.parseInt(inputString());
                if (choice >= min && choice <= max) {
                    return choice;
                }
            } catch (NumberFormatException e) {
                System.err.print("Please choice option " + min + " - " + max + ": ");
            }
        }
    }
}
