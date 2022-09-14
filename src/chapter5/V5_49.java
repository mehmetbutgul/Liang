/*(Count vowels and consonants) Assume letters A, E, I, O, and U as the vowels.
Write a program that prompts the user to enter a string and displays the number
of vowels and consonants in the string.*/
package chapter5;

import java.util.Scanner;

public class V5_49 {
    public static void main(String[] args) {
        String str=readText("Enter a string ");
        int vowels=0;
        int consonants=0;
        for (int i=0; i<str.length(); i++){
            if (isVowel(str.charAt(i))) vowels++;
            else if (isConsonant(str.charAt(i))) consonants++;
        }
        System.out.println("The number of vowels is "+vowels);
        System.out.println("The number of consonants is "+consonants);
    }
    private static boolean isVowel(char letter){
        return switch (Character.toLowerCase(letter)) {
                case 'a', 'e', 'o', 'u', 'i', 'ı' -> true;
                default -> false;
        };
    }
    private static boolean isConsonant(char letter){
        if (!Character.isLetter(letter)) return false;
        return !isVowel(letter);
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
