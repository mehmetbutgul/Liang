/*
    (Science: day of the week)
    Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week.
    The formula is
    h =¢q + 26(m + 1) 10 + k + k 4 + j 4 + 5j≤%7
    where
    ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, 6: Friday).
    ■ q is the day of the month.
    ■ m is the month (3: March, 4: April, …, 12: December). January and February are counted as months 13 and 14 of the previous year.
    ■ j is the century (i.e., year 100).
    ■ k is the year of the century (i.e., year % 100).
    Note that the division in the formula performs an integer division.
    Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.
 */
package chapter3;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.Locale;
import java.util.Scanner;

public class V3_21 {
    public static void main(String[] args) {
        int year = readNumber("Enter year: (e.g., 2012):",0,3000);
        int month=readNumber("Enter month: 1-12:",1,12);
        int dayOfTheMonth=readNumber("Enter the day of the month: 1-31: ",1,31);
        if (month<3){
            month+=12;
            year--;
        }
        DayOfWeek dayOfWeek=calculateDayOfWeek(year,month,dayOfTheMonth);
        System.out.println("Day of the week is "+dayOfWeek.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
    private static DayOfWeek calculateDayOfWeek(int year,int month,int dayOfTheMonth){
       int dayOfWeek=(dayOfTheMonth+(26*(month+1))/10+year%100+(year%100)/4+year/100+5*(year/100))%7;
       return DayOfWeek.of(((dayOfWeek+4)%7)+1);
    }
    private static int readNumber(String text,int sublimit,int toplimit){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if(number<sublimit||number>toplimit) throw new RuntimeException("number must be between "+sublimit+" and "+toplimit);
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
