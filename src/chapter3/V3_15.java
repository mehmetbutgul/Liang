/*
     (Game: lottery) Revise Listing 3.8, Lottery.java,
     to generate a lottery of a threedigit number.
     The program prompts the user to enter a three-digit number
     and determines whether the user wins according to the following rules:
     1. If the user input matches the lottery number in the exact order, the award is $10,000.
     2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
     3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
 */
package chapter3;

import java.util.Random;
import java.util.Scanner;

public class V3_15 {
    public static void main(String[] args) {
      while (true){
        String lottery= String.valueOf(new Random().nextInt(100,1000));
        String guess=readNumber("Enter your lottery pick (three digits)");
        System.out.println("The lottery number is " + lottery);
        compare(lottery,guess);
    }}
    private static String readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                String isbn= new Scanner(System.in).next();
                if(isbn.length()!=3) throw new RuntimeException();
                return isbn;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
    private static void compare(String lottery, String guess){
        if (lottery.equals(guess))  System.out.println("Exact match: you win $10,000");
        else if (lottery.contentEquals(guess))  System.out.println("Match all digits: you win $3,000");
        else if (verify(lottery,guess)) System.out.println("Match one digit: you win $1,000");
        else System.out.println("Sorry, no match");
    }
    private static boolean verify(String lottery,String guess){
        for (byte digit:lottery.getBytes()) {
            for (byte digit2:guess.getBytes()) {
                if (digit==digit2) return true;
            }
        }
        return false;
    }

}
