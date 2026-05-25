/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08;

import java.util.Scanner;

/**
 * S08 - This class is used to enter input
 *
 * @author CE201300 Thi Thanh Nghĩa
 */
public class InputManager {

    private static final Scanner sc = new Scanner(System.in);

    /**
     * this method is used to enter phone numbers
     *
     * @param msg the message to the user
     */
    public void getPhoneInput(String msg) {
        while (true) {
            System.out.print(msg);
            String phone = sc.nextLine().trim();
            String error = Validation.checkPhone(phone);
            if (error.isEmpty()) {
                break;
            }
            System.err.println(error);
        }
    }

    /**
     * This method is used to enter date
     *
     * @param msg the message to the user
     */
    public void getDateInput(String msg) {
        while (true) {
            System.out.print(msg);
            String date = sc.nextLine().trim();
            String error = Validation.checkDate(date);
            if (error.isEmpty()) {
                break;
            }
            System.err.println(error);
        }
    }

    /**
     * This method is used to enter email
     *
     * @param msg the message to the user
     */
    public void getEmailInput(String msg) {
        while (true) {
            System.out.print(msg);
            String email = sc.nextLine().trim();
            String error = Validation.checkEmail(email);
            if (error.isEmpty()) {
                break;
            }
            System.err.println(error);
        }
    }
}
