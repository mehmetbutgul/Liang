/* (Display calendars)
Write a program that prompts the user to enter the year and first day of the year
and displays the calendar table for the year on the console.
For example, if the user entered the year 2013, and 2 for Tuesday, January 1, 2013,
your program should display the calendar for each month in the year,*/
package chapter5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class V5_29 {
    public static void main(String[] args) {
        int year=readNumber("Enter year:",1,2500);
        for (int month=1;month<=12;month++){
            printCalendar(year,month);
        }
    }
    public static void printCalendar(int year,int month){
        printCalendar(year, Month.of(month));
    }
    public static void printCalendar(int year,Month month){
        LocalDate date=LocalDate.of(year,month,1);
        System.out.println("              "+date.format(DateTimeFormatter.ofPattern("MMMM yyyy",Locale.ENGLISH)));
        System.out.println("---------------------------------------");
        for (int day=1;day<=7;day++){
            System.out.print(DayOfWeek.of((day+5)%7+1).getDisplayName(TextStyle.SHORT,Locale.ENGLISH)+"   ");
        }
        System.out.println();
        int start=date.getDayOfWeek().getValue()%7;
        for (int space=0;space<start;space++) System.out.print("      ");
        for (int day=1;day<=date.lengthOfMonth();day++){
            System.out.print((String.valueOf(day).length()==1?" ":"")+ day+"    ");
            if ((start+day)%7==0) System.out.println();
        }
        System.out.println("\n");
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
