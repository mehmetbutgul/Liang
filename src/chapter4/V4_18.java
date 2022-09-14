/* (Student major and status)
Write a program that prompts the user to enter two characters and displays the major and status represented in the characters.
The first character indicates the major and the second is number character 1, 2, 3, 4,
which indicates whether a student is a freshman, sophomore, junior, or senior.
Suppose the following chracters are used to denote the majors:
M: Mathematics C: Computer Science I: Information Technology */
package chapter4;

import java.util.Scanner;

public class V4_18 {
    public static void main(String[] args) {
        try {
            String input = readText("Enter two characters:");
            String major = findMajor(String.valueOf(input.charAt(0)));
            String status = findStatus(String.valueOf(input.charAt(1)));
            System.out.println(major + " " + status);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static String findMajor(String major){
        return switch (major){
            case "M"-> "Mathematics";
            case "C"->"Computer Science";
            case "I"->"Information Technology";
            default -> throw new RuntimeException("invalid input");
        };
    }
    private static String findStatus(String status){
        return switch (status){
            case "1"->"Freshman";
            case "2"->"Sophomore";
            case "3"->"Junior";
            case "4"->"Senior";
            default -> {throw new RuntimeException("invalid input");}
        };
    }
    private static String readText(String text){
        while (true) {
            System.out.println(text);
            try {
                String str= new Scanner(System.in).next();
                if (str.length()!=2) throw new RuntimeException();
                return str;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
