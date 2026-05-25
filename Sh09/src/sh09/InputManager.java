/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh09;

import java.util.Scanner;

/**
 * S09 - This class is used to receive and validate input.
 *
 * @author CE201300 Thi Thanh Nghĩa
 */
public class InputManager {

    private final Scanner sc = new Scanner(System.in);

    /**
     * This method is used to validate input and check if it is empty.
     *
     * @return The trimmed raw text entered by the user.
     */
    public String inputString() {
        while (true) {
            String result = sc.nextLine();
            if (result != null && !result.trim().isEmpty()) {
                return result.trim();
            }
            System.err.println("Input cannot be empty!");
        }
    }

    /**
     * This method is used to check if the input can be converted to a Double
     * value type.
     *
     * @param inputVal the raw input string from the user
     * @return The parsed Double object if valid, otherwise returns null.
     */
    public Double checkIn(String inputVal) {
        try {
            return Double.valueOf(inputVal);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    /**
     * This method is used to Checks if input operator matches valid supported
     * system characters.
     *
     * @param operator the operator input from the user.
     * @return The Operator Enum if valid, otherwise returns null.
     *
     */
    public Operator checkOperator(String operator) {
        if (operator == null) {
            return null;
        }
        String trimmedInput = operator.trim();
        for (Operator op : Operator.values()) {
            if (op.getSymbol().equals(trimmedInput)) {
                return op;
            }
        }
        return null;
    }

    /**
     * This method is used to input data of the Double data type.
     *
     * @param msg the message printed to the screen.
     * @param errMsg reports an error message if the authentication process
     * fails.
     * @return primitive numeric double value.
     */
    public Double inputDouble(String msg, String errMsg) {
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

    /**
     * This method is used to input data of the Operator class.
     *
     * @param msg the message printed to the screen.
     * @param errMsg reports an error message if the authentication process
     * fails.
     * @return the Operator object if it is valid, otherwise returns errMsg.
     */
    public Operator inputOperator(String msg, String errMsg) {
        while (true) {
            System.out.print(msg);
            String input = inputString();
            Operator op = checkOperator(input);
            if (op != null) {
                return op;
            }
            System.err.println(errMsg);
        }
    }

    /**
     * This method is used to input a value within a limited range.
     *
     * @param min the lowest value.
     * @param max the highest value.
     * @return valid integer number if valid, otherwise returns error.
     */
    public int inputInt(int min, int max) {
        while (true) {
            try {
                System.out.println("Please choice one option: ");
                int choice = Integer.parseInt(inputString());
                if (choice >= min && choice <= max) {
                    return choice;
                } else {
                    System.err.println("Value out of range! Please enter an integer number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.err.println("Invalid format! Please enter an integer number between " + min + " and " + max);
            }
        }
    }
}
