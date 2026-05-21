/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s09;

/**
 *
 * @author LOQ
 */
public class CalculatorManager {

    //funtion 1
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
                    throw new ArithmeticException("Divided by zero is invalid");
                }
                return a / b;
            case EXPONENT:
                return Math.pow(a, b);
            default:
                return 0;
        }
    }

    public void runNormalCalculator() {
        System.out.println("----- Normal Calculator -----");
        double memory = Validation.inputDouble("Enter number: ", "Digit only.");

        while (true) {
            Operator op = Validation.inputOperator();
            if (op == Operator.EQUAL) {
                System.out.println("Result: " + memory);
                break;
            }

            double b = Validation.inputDouble("Enter number: ", "Digit only.");
            try {
                memory = calculate(memory, op, b);
                System.out.println("Memory: " + memory);
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public BMI calculateBMI(double weight, double height) {
        double heightInMeter = height / 100;
        double bmi = weight / (heightInMeter * heightInMeter);

        if (bmi < 19) {
            return BMI.UNDER_STANDARD;
        }
        if (bmi >= 19 && bmi < 25) {
            return BMI.STANDARD;
        }
        if (bmi >= 25 && bmi < 30) {
            return BMI.OVERWEIGHT;
        }
        if (bmi >= 30 && bmi < 40) {
            return BMI.FAT;
        }
        return BMI.VERY_FAT;
    }

    public void runBMICalculator() {
        System.out.println("----- BMI Calculator -----");
        double weight = Validation.inputDouble("Enter Weight(kg): ", "BMI is digit.");
        double height = Validation.inputDouble("Enter height (cm): ", "BMI is digit.");

        double heightInMeter = height / 100;
        double bmiNumber = weight / (heightInMeter * heightInMeter);
        BMI status = calculateBMI(weight, height);

        System.out.printf("BMI Number: %.2f\n", bmiNumber);
        System.out.print("BMI Status: ");
        switch (status) {
            case UNDER_STANDARD:
                System.out.println("Under-standard");
                break;
            case STANDARD:
                System.out.println("Standard");
                break;
            case OVERWEIGHT:
                System.out.println("Overweight");
                break;
            case FAT:
                System.out.println("Fat - should lose weight");
                break;
            case VERY_FAT:
                System.out.println("Very fat - should lose weight immediately");
                break;
        }
    }
}
