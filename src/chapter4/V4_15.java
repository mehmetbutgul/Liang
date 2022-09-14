/* (Phone key pads)
    The international standard letter/number mapping found on the telephone is shown below:
  Write a program that prompts the user to enter a letter and displays its corresponding */
package chapter4;

import java.util.Scanner;

public class V4_15 {
    public static void main(String[] args) {
        char letter=readChar("Enter a letter: ");
        if (!Character.isLetter(letter)) System.out.println(letter+" is an invalid input");
        else {
             int number=find(Character.toLowerCase(letter));
            System.out.println("The corresponding number is "+number);
        }
    }
    public static int find(char letter){
        return switch (letter){
          case 'a','b','c'->2;
          case 'd','e','f'->3;
            case 'g','h','i'->4;
            case 'j','k','l'->5;
            case 'm','n','o'->6;
            case 'p','q','r','s'->7;
            case 't','u','v'->8;
            case 'w','x','y','z'->9;
            default -> 13;
        };
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
