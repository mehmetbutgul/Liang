/*(Longest common prefix) Write a program that prompts the user to enter two
strings and displays the largest common prefix of the two strings.*/
package chapter5;

import java.util.Scanner;

public class V5_51 {
    public static void main(String[] args) {
        String first=readText("Enter the first string: ");
        String second=readText("Enter the second string: ");
        String prefix=findPrefix(first,second);
        if (prefix.isEmpty()) System.out.println(first+" and "+second+" have no common prefix");
        else System.out.println("The common prefix is "+prefix);
    }
    private static String findPrefix(String first,String second){
        int index=0;
        StringBuffer buffer=new StringBuffer();
        while (first.startsWith(second.substring(0,index+1)) && index<first.length() && index<second.length()) {
            buffer.append(first.charAt(index));
            index++;
        }
        return buffer.toString();
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
