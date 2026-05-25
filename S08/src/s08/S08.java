/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08;

/**
 * S08 - This class is used to Check Data Format
 *
 * @author CE201300 Thi Thanh Nghĩa
 */
public class S08 {

    /**
     * This method is used to control the execution flow.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        System.out.println("===== Validate Program =====");
        // initialize the app object of the class InputManager
        InputManager app = new InputManager();
        // using getPhoneInput method to enter phone number
        app.getPhoneInput("Phone number: ");
        // using getDateInput method to enter date
        app.getDateInput("Date: ");
        // using getEmailInput method to enter email
        app.getEmailInput("Email: ");
    }

}
