/* (Days of a month)
Write a program that prompts the user to enter a year and the first three letters of a month name
(with the first letter in uppercase) and displays the number of days in the month. */
package chapter4;

import java.time.Month;
import java.time.Year;
import java.time.format.TextStyle;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class V4_17 {
    public static void main(String[] args) {
        int year=readNumber("Enter a year: ");
        String month=readText("Enter a month: ");
       if (!Arrays.stream(Month.values()).anyMatch(month1 ->month1.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase(Locale.ENGLISH).startsWith(month.toUpperCase(Locale.ENGLISH)))){
           System.out.println("Enter a valid name");
       }
       else {
           int day = Arrays.stream(Month.values()).filter(month1 -> month1.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).compareToIgnoreCase(month) == 0).findFirst().get().maxLength();
           System.out.println(month + " " + year + " has " + (day==29? (Year.of(year).isLeap()?29:28):day) + " days");
       }
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
