/*
     (Find future dates)
     Write a program that prompts the user to enter an integer for today’s day of the week
     (Sunday is 0, Monday is 1, …, and Saturday is 6).
     Also prompt the user to enter the number of days after today for a future day
     and display the future day of the week.
 */
package chapter3;

import java.time.DayOfWeek;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class V3_5 {
    public static void main(String[] args) {
        int today=readNumber("Enter today's day:",0,6);
        int futureDay=readNumber("Enter the number of days elapsed since today: ",0,2111111111);
        String todayAsString=DayOfWeek.of(today==0?7:today).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        String futureDayAsString=DayOfWeek.of(((today+futureDay)%7)==0?7:(today+futureDay)%7).getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        System.out.println("Today is "+todayAsString+" and the future day is "+futureDayAsString);
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
