/*(Current date and time) Invoking System.currentTimeMillis() returns the
elapsed time in milliseconds since midnight of January 1, 1970. Write a program
that displays the date and time.*/
package chapter6;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class V6_33 {
    public static void main(String[] args) {
        String localDateTime=LocalDateTime.ofInstant(Instant.ofEpochMilli(System.currentTimeMillis()), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("MMM dd, yyyy hh:mm:ss", Locale.ENGLISH));
        System.out.println("Current date and time is "+localDateTime);
    }
}
