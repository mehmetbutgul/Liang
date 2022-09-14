/*(Check SSN)
Write a program that prompts the user to enter a Social Security number in the format DDD-DD-DDDD,
where D is a digit. Your program should check whether the input is valid.*/
package chapter4;

import java.util.Scanner;

public class V4_21 {
    public static void main(String[] args) {
        String ssn=readText("Enter a SSN");
        if (validateSSN(ssn)) System.out.println(ssn+" is a valid social security number");
        else System.out.println(ssn+" is an invalid social security number");
    }
    public static boolean validateSSN(String ssn){
        return ssn.matches("\\d{3}[-]\\d{2}[-]\\d{4}");
    }
    private static String readText(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).next();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
