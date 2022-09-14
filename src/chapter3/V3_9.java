/*
     (Business: check ISBN-10)
     An ISBN-10 (International Standard Book Number) consists of 10 digits: d1d2d3d4d5d6d7d8d9d10.
     The last digit, d10, is a checksum, which is calculated from the other nine digits using the following formula:
        (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
     If the checksum is 10, the last digit is denoted as X according to the ISBN-10 convention.
     Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros).
     Your program should read the input as an integer.
 */
package chapter3;

import java.util.Scanner;
import java.util.stream.Stream;

public class V3_9 {
    public static void main(String[] args) {
        String isbn=readNumber("Enter the first 9 digits of an ISBN as integer:");
        int totalOfDigits=0;
        for(int digit=1; digit<=isbn.length(); digit++){
            totalOfDigits+=Integer.parseInt(String.valueOf(isbn.charAt(digit-1)))*digit;
        }
        int checksum=totalOfDigits%11;
        System.out.println("The ISBN-10 number is "+isbn+(checksum==10?"X":checksum));
    }
    private static String readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                String isbn= new Scanner(System.in).next();
                if(isbn.length()!=9) throw new RuntimeException();
                return isbn;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
