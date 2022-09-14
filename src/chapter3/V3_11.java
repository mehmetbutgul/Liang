/*
     (Find the number of days in a month)
     Write a program that prompts the user to enter the month and year
     and displays the number of days in the month.
     For example, if the user entered month 2 and year 2012,
     the program should display that February 2012 had 29 days.
     If the user entered month 3 and year 2015,
     the program should display that March 2015 had 31 days.
 */
package chapter3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class V3_11 {
    public static void main(String[] args) {
        int month=readNumber("Enter month",1,12);
        int year=readNumber("Enter year",1970,2100);
        LocalDate localDate=LocalDate.of(year,month,1);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMMM yyyy", Locale.ENGLISH))+" had "+localDate.plusMonths(1).minusDays(1).getDayOfMonth()+" days");
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
