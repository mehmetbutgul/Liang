/*(Count the letters in a string) Write a method that counts the number of letters in
a string using the following header:
public static int countLetters(String s)
Write a test program that prompts the user to enter a string and displays the number
of letters in the string.*/
package chapter6;

import Util.Reader;

public class V6_20 {
    public static void main(String[] args) {
        String str= Reader.readText("Enter your text");
        int numberOfLetters=countLetters(str);
        System.out.println("The number of letters is "+numberOfLetters);
    }
    public static int countLetters(String str){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) sum++;
        }
        return sum;
    }
}
