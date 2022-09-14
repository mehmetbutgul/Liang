/*(Display pyramid)
Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid*/
package chapter5;

import java.util.Scanner;

public class V5_17 {
    public static void main(String[] args) {
        int number=readNumber("Enter an integer from 1 to 15",1,15);
        for (int i=1;i<number;i++) System.out.print("  ");
        String pattern="1";
        System.out.println(pattern);
        for (int starter=2;starter<=number;starter++){
                String spaces="";
                for (int i=1;i<=number-starter;i++) spaces+="  ";
                pattern=starter+" "+pattern+" "+starter;
                System.out.println(spaces+pattern);
        }
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
