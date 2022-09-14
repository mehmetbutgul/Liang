/*(Number of days in a year) Write a method that returns the number of days in a
year using the following header:
public static int numberOfDaysInAYear(int year)
Write a test program that displays the number of days in year from 2000 to 2020.*/
package chapter6;

import java.time.Year;

public class V6_16 {
    public static void main(String[] args) {
        System.out.println("Year                numberOfDays");
        System.out.println("----------------------------------");
        for (int year = 2000; year <2020 ; year++) {
            System.out.println(String.format("%d%25d",year,numberOfDaysInAYear(year)));
        }
    }
    public static int numberOfDaysInAYear(int year){
        if (Year.of(year).isLeap()) return 366;
        else return 365;
    }
}
