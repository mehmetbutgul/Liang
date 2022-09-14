
/*
     (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays the current time in GMT.
     Revise the program so that it prompts the user to enter the time zone offset to GMT and
     displays the time in the specified time zone.

     Enter the time zone offset to GMT: −5
     The current time is 4:50:34
 */

package chapter2;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class V2_8 {
    public static void main(String[] args) {
        int gmt=readNumber("Enter the time zone offset to GMT:");
        LocalTime localTime=LocalTime.now();    // shorter
        localTime=localTime.plusHours(-gmt);    //  System.out.println(LocalTime.now().plus(-gmt));
        System.out.println("The current time is "+localTime.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));          //
    }
    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if(number<-9||number>9) throw new RuntimeException("number must be between -9 and +9");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
