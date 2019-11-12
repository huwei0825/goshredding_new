/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goshredding;

/**
 *
 * @author huwei
 */
public class Validation {
    public static boolean isPresent(String inputStr){
        // Presence check to determine if the input string is empty // Parameter: Takes a String as input
        // Returns: Outputs a Boolean, false if empty, true otherwise
        boolean valid = true; 
        if(inputStr.equals("")){
            valid = false;
        }
            return valid;
    }
    public static boolean isReal(String inputStr){
    //Real Type check to determine if the input string is a real number // Parameter: Takes a String as input
    // Returns: Outputs a Boolean, true if a real number, false otherwise
        boolean valid = true;
        try{
    Float.parseFloat(inputStr);
    valid = true; }
        catch(NumberFormatException e){
            valid = false;
        }
        return valid;
    }
    public static boolean isDate(String inputStr){
    //Date Format check to determine if the correct dd/mm/yyyy is used
    // Parameter: Takes a String as input
    // Returns: Outputs a Boolean, true if correct format, false otherwise
        boolean valid = true;
        if(inputStr.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})")){
            valid = true;
        }
        else{
            valid = false;
        }
        return valid;
    }
    public static boolean isRange(int input, int lower, int upper){
        boolean valid = true;
        if(input >= lower && input <= upper){
            valid = true;
               
        }
        else{
            valid = false;
        }
        return valid;
    }
    public static boolean isLength(String inputStr, int length){
        boolean valid = true;
        if(inputStr.length() != length){
            valid = false;
        }
        return valid;
    }
    public static boolean isDoubleVerification(String inputStr1, String inputStr2){
        boolean valid = true;
        //if(inputStr1.is)
        return valid;
    }
}
