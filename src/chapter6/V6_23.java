/*(Occurrences of a specified character) Write a method that finds the number of
occurrences of a specified character in a string using the following header:
public static int count(String str, char a)
For example, count("Welcome", 'e') returns 2. Write a test program that
prompts the user to enter a string followed by a character and displays the number
of occurrences of the character in the string.*/
package chapter6;

import Util.Reader;

public class V6_23 {
    public static void main(String[] args) {
        String text= Reader.readText("Enter a string");
        char letter=Reader.readChar("Enter a letter");
        int sum=count(text,letter);
        System.out.println("the number of occurrences of the character in the string is "+sum);
    }
    public static int count(String str,char c){
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            if (c==str.charAt(i)) sum++;
        }
        return sum;
    }
}
