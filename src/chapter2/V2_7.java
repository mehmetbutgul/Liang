
// Find the number of years
/*   Write a program that prompts the user to enter the minutes (e.g., 1 billion),
 and displays the number of years and days for the minutes. For simplicity, assume a year has 365 days.
 */

package chapter2;

import java.util.Scanner;

public class V2_7 {
    public static void main(String[] args) {
        long minutes=readNumber("Enter the number of minutes");
        long days=minutes/(60*24);
        long years=days/365;
        days=days%365;
        System.out.println(minutes+" minutes is approximately "+years+" years and "+days+" days");
    }
    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if(number<1) throw new RuntimeException("number must be greater than 0");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
