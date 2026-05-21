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
public class S09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CalculatorManager manager = new CalculatorManager();

        while (true) {
            System.out.println("========= Calculator Program =========");
            System.out.println("1. Normal Calculator");
            System.out.println("2. BMI Calculator");
            System.out.println("3. Exit");
            System.out.print("Please choice one option: ");

            int choice = Validation.inputChoice(1, 3);
            switch (choice) {
                case 1:
                    manager.runNormalCalculator();
                    break;
                case 2:
                    manager.runBMICalculator();
                    break;
                case 3:
                    System.out.println("Exiting program...");
                    return;
            }
        }

    }

}
