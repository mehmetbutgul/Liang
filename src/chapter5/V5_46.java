/* (Reverse a string) Write a program that prompts the user to enter a string and displays the string in reverse order.
 */
package chapter5;

import java.util.Scanner;

public class V5_46 {
    public static void main(String[] args) {
        System.out.println("Enter a string:");
        System.out.println("The reversed string is "+new StringBuffer(new Scanner(System.in).next()).reverse().toString());
    }
}
