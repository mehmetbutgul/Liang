/* (Display the first days of each month)
Write a program that prompts the user to enter the year and first day of the year,
and displays the first day of each month in the year.
For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013, your program should display the following output:
January 1, 2013 is Tuesday
...
December 1, 2013 is Sunday*/
package chapter5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class V5_28 {
    public static void main(String[] args) {
        int year=readNumber("Enter year:",1,2500);
        for (int i=1;i<=12;i++){
            LocalDate date=LocalDate.of(year,i,1);
            System.out.println(date.format(DateTimeFormatter.ofPattern("MMMM d, yyyy",Locale.ENGLISH))+" is "+date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        }
    }
    private static int readNumber(String text,int sublimit,int toplimit){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if (number<sublimit||number>toplimit) throw new RuntimeException();
                return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
