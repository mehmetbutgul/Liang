/*
     (Sort three integers)
     Write a program that prompts the user to enter three integers and display the integers in non-decreasing order.
 */
package chapter3;

import java.util.Scanner;
import java.util.stream.Stream;

public class V3_8 {
    public static void main(String[] args) {
       int first=readNumber("Enter first number");
       int second=readNumber("Enter second number");
       int third=readNumber("Enter third number");
        Stream.of(first,second,third).sorted().forEach(System.out::println);
    }
    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
