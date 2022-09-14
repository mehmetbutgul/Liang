/*(Display current date and time) Listing 2.7, ShowCurrentTime.java, displays the
current time. Improve this example to display the current date and time. The calendar
example in Listing 6.12, PrintCalendar.java, should give you some ideas on
how to find the year, month, and day.*/
package chapter6;

import java.time.LocalDateTime;

public class V6_24 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
    }
}
