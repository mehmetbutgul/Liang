/*(Check password) Some websites impose certain rules for passwords. Write a
method that checks whether a string is a valid password. Suppose the password
rules are as follows:
■ A password must have at least eight characters.
■ A password consists of only letters and digits.
■ A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.*/
package chapter6;

import Util.Reader;

public class V6_18 {
    public static void main(String[] args) {
        String password= Reader.readText("Enter your password");
        if (validatePassword(password)) System.out.println("Valid Password");
        else System.out.println("Invalid Password");
    }
    public static boolean validatePassword(String password){
        if (password.length()<8) return false;
        if (!isLettersOrDigits(password)) return false;
        if (!areThereTwoDigits(password)) return false;
        return true;
    }
    private static boolean isLettersOrDigits(String password){
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) return false;
        }
        return true;
    }
    private static boolean areThereTwoDigits(String password){
        int sum=0;
        for (int i = 0; i < password.length() && sum<2; i++) {
            if (Character.isDigit(password.charAt(i))) sum++;
        }
        return sum>1;
    }
}
