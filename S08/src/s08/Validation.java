/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s08;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * S08 - this class is used to validate input
 *
 * @author CE201300 Thi Thanh Nghĩa
 */
public class Validation {

    /**
     * This method is used to check phone number
     *
     * @param phone number that will be check for
     * @return error if phone number is invalid
     */
    public static String checkPhone(String phone) {

        // check phone if it is null or empty.
        if (phone == null || phone.trim().isEmpty()) {
            return "Phone number must is number";
        }
        // Check the format including: starting with 0, followed by 3,5,7,8,9; and exactly 8 more digits (total 10 digits)
        if (!phone.matches("^0[35789][0-9]{8}+$")) {
            return "Phone number must is number";
        }
        // return "" if the phone number is valid.
        return "";
    }

    /**
     * Checks date format using SimpleDateFormat
     *
     * @param date the input date String
     * @return error message if invalid, or empty string if correct.
     */
    public static String checkDate(String date) {
        // check if the date is null or an empty value.
        if (date == null || date.trim().isEmpty()) {
            return "Date to correct format(dd/MM/yyyy)";
        }
        // Initialize an sdf object for testing.
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        // Turn off the automatic date rounding feature to avoid entering fake dates.
        sdf.setLenient(false);
        // using try-catch to catch error
        try {
            // check format
            sdf.parse(date);
            // return "" if the date is correct
            return "";
        } catch (ParseException e) {
            return "Date to correct format(dd/MM/yyyy)";
        }
    }

    /**
     * Checks email format using Regex.
     *
     * @param email the input email string
     * @return error message if invalid, or empty string if correct
     */
    public static String checkEmail(String email) {
        // check if the email is null or an empty value
        if (email == null || email.trim().isEmpty()) {
            return "Email must is correct format";
        }
        // using regex to check mail format
        String emailRegex = "^[A-Za-z0-9.+_-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        // if the email does not match, return an error message
        if (!email.matches(emailRegex)) {
            // return an error message if the email is invalid.
            return "Email must is correct format";
        }
        // return "" if email is valid.
        return "";
    }

}
