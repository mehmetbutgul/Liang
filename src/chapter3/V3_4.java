
/*
     (Random month)
     Write a program that randomly generates an integer between 1 and 12
     and displays the English month name January, February, …, December
      for the number 1, 2, …, 12, accordingly.
 */

package chapter3;

import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Random;

public class V3_4 {
    public static void main(String[] args) {
        Random random=new Random();
        int month=random.nextInt(1,13);
        System.out.println(Month.of(month).getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
}
