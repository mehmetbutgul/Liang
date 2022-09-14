/*
4.11 (Decimal to hex)
Write a program that prompts the user to enter an integer between 0 and 15
and displays its corresponding hex number.*/
package chapter4;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class V4_11 {
    public static void main(String[] args) {
        int number=readNumber("Enter a decimal value (0 to 15):");
        if (number<0||number>15) System.out.println(number+" is an invalid input");
        else System.out.println("The hex value is "+ Integer.toHexString(number).toUpperCase());
    }
    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
