/* (Display leap years)
Write a program that displays all the leap years, ten per line, from 101 to 2100, separated by exactly one space.
Also display the number of leap years in this period.*/
package chapter5;

import java.time.Year;

public class V5_27 {
    public static void main(String[] args) {
        int sumOfLeapYears=0;
        for (int year=101,line=0;year<=2100;year++){
            if (Year.of(year).isLeap()){
                System.out.print(year+" ");
                sumOfLeapYears++;
                line++;
                if (line%10==0) System.out.println();
            }
        }
    }
}
