/*(Vowel or consonant?)
Write a program that prompts the user to enter a letter
and check whether the letter is a vowel or consonant*/
package chapter4;

import java.util.Scanner;

public class V4_13 {
    public static void main(String[] args) {
        char letter=readChar("Enter a letter: ");
        if (!Character.isLetter(letter)) System.out.println(letter+" is an invalid input");
        else {
            switch (Character.toLowerCase(letter)) {
                case 'a', 'e', 'o', 'u', 'i', 'ı' -> System.out.println(letter + " is a vowel");
                default -> System.out.println(letter + " is a consonant");
            }
        }
    }
    private static char readChar(String text) {
        while (true) {
            System.out.println(text);
            try {
                String c = new Scanner(System.in).next();
                if (c.length()!=1) throw new RuntimeException();
                return c.charAt(0);
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
}
