/*(Count uppercase letters) Write a program that prompts the user to enter a string
and displays the number of the uppercase letters in the string.*/
package chapter5;

import java.util.Scanner;

public class V5_50 {
    public static void main(String[] args) {
        String text=readText("Enter a string ");
        int uppercaseLetters=0;
        for (int i=0;i<text.length();i++)
            if (Character.isUpperCase(text.charAt(i))) uppercaseLetters++;
        System.out.println("The number of uppercase letters is "+uppercaseLetters);
    }
    private static String readText(String text) {
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
}
