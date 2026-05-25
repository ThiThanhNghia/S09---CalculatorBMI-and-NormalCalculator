/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sh09;

/**
 * This class is used to run normal calculator and BMI calculator.
 *
 * @author CE201300 Thi Thanh Nghĩa
 */
public class Sh09 {

    /**
     * this class is used to launch the program.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // initialize InputManager object.
        InputManager inputManager = new InputManager();
        // initialize Calculator object with inputManager as parameter.
        CalculatorManage calculatorManage = new CalculatorManage(inputManager);
        // using 'while' loop to requires user to re-enter data.
        while (true) {
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            // requires user to chose options.
            int choice = inputManager.inputInt(1, 3);
            switch (choice) {
                case 1:
                    calculatorManage.runNormalCalculate();
                    break;
                case 2:
                    calculatorManage.runBMICalculator();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
            }
        }
    }

}
