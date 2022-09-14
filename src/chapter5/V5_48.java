/*(Process string) Write a program that prompts the user to enter a string and displays
the characters at odd positions.*/
package chapter5;

import java.util.Scanner;

public class V5_48 {
    public static void main(String[] args) {
        String str=readText("Enter a string ");
        StringBuffer buffer=new StringBuffer();
        for (int i=0; i<str.length(); i++){
            if (i%2==0) buffer.append(str.charAt(i));
        }
        System.out.println(buffer);
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
