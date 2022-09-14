/* (Find the character of an ASCII code)
 Write a program that receives an ASCII code (an integer between 0 and 127) and displays its character. */
package chapter4;

import java.util.Scanner;

public class V4_8 {
    public static void main(String[] args) {
        int number=readNumber("Enter an ASCII code:",0,127);
        char ascii=(char)number;
        System.out.println("The character for ASCII code 69 is "+ascii);


    }
    private static int readNumber(String text,int sublimit,int toplimit) {
        while (true) {
            System.out.println(text);
            try {
                int number = new Scanner(System.in).nextInt();
                if (number < sublimit || number > toplimit)
                    throw new RuntimeException("number must be between " + sublimit + " and " + toplimit);
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
}
