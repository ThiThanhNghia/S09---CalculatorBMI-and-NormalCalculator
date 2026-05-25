/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh09;

/**
 * This method is used to manage normal calculate and BMI calculate.
 *
 * @author CE201300 Thi Thanh Nghĩa
 */
public class CalculatorManage {

    private final InputManager inputManager;

    /**
     * The constructor has an object of the InputManager class as a parameter.
     *
     * @param inputManager object is passed into the function.
     */
    public CalculatorManage(InputManager inputManager) {
        this.inputManager = inputManager;
    }

    /**
     * This method is used to calculate a and b.
     *
     * @param a the first value.
     * @param operator the operator symbol
     * @param b the second value.
     * @return result after calculate
     */
    public double calculate(double a, Operator operator, double b) {
        switch (operator) {
            case ADD:
                return a + b;
            case SUBTRACT:
                return a - b;
            case MULTIPLY:
                return a * b;
            case DIVIDE:
                if (b == 0) {
                    throw new ArithmeticException("Arithmetic error: Divided by case 0.");
                }
                return a / b;
            case EXPONENT:
                return Math.pow(a, b);
            default:
                throw new IllegalArgumentException("Unexpected execution state error.");
        }
    }

    /**
     * This method is used to run normal calculate.
     *
     * @return the result if valid, otherwise returns to the main interface.
     */
    public void runNormalCalculate() {
        // print the title
        System.out.println("----- Normal Calculator -----");
        // Requires the user to enter the first value.
        Double memory = inputManager.inputDouble("Enter number: ", "Invalid number format!");
        // using while loop to prompt user to re-enter the data again.
        while (true) {
            // Requires the user to enter the operator symbol
            Operator op = inputManager.inputOperator("Enter operator: ", "Please input (+, -, *, /, ^)");
            // using 'if' command if user enter '=' to stop calculate.
            if (op == Operator.EQUAL) {
                // print the current result.
                System.out.println("Result: " + memory);
                break;
            }
            // Requires the user to enter the second value
            double nextNum = inputManager.inputDouble("Enter number: ", "Invalid number format!");
            // using 'try - catch' to catch Exception if error occurred.
            try {
                // calculate the result
                memory = calculate(memory, op, nextNum);
                // print the result
                System.out.println("Memory: " + memory);
            } catch (ArithmeticException e) {
                // print if the error occurs
                System.out.println(e.getMessage());
                // return to the main interface.
                return;
            }
        }
    }

    /**
     * This method is used to check BMI status.
     *
     * @param bmiValue the value of BMI.
     * @return the status that matches BMI value.
     */
    public BMI calculateBMI(double bmiValue) {
        if (bmiValue < 19) {
            return BMI.UNDER_STANDARD;
        } else if (bmiValue < 25) {
            return BMI.STANDARD;
        } else if (bmiValue < 30) {
            return BMI.OVERWEIGHT;
        } else if (bmiValue < 40) {
            return BMI.FAT;
        } else {
            return BMI.VERY_FAT;
        }
    }

    /**
     * This method is used to calculate BMI and print the result.
     *
     * @return BMI number and BMI status.
     */
    public void runBMICalculator() {
        // print the title
        System.out.println("----- BMI Calculator -----");
        // Requires user to enter weight
        double weight = inputManager.inputDouble("Enter Weight(kg): ", "BMI is digit");
        // Requires user to enter height.
        double height = inputManager.inputDouble("Enter Height(cm): ", "BMI is digit");
        // check if the weight and height are negative numbers.
        if (weight <= 0 || height <= 0) {
            // print error.
            System.out.println("Error: Input data must be values greater than 0.");
            // return to the main interface.
            return;
        }

        // convert height to height in meters.
        double heightInMeters = height / 100;
        // calculate BMI value.
        double bmiValue = weight / (heightInMeters * heightInMeters);
        // check BMI status.
        BMI status = calculateBMI(bmiValue);
        // print BMI number.
        System.out.printf("BMI Number: %.2f\n", bmiValue);
        // print BMI status.
        System.out.println("BMI status: " + status.getDescription());

    }
}
