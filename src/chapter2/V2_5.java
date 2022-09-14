// financial app: calculate tips
/*
    Write a program that reads the subtotal and the gratuity rate,
    then computes the gratuity and total.
     For example, if the user enters 10 for subtotal and 15% for gratuity rate,
     the program displays $1.5 as gratuity and $11.5 as total.
 */
package chapter2;

import java.util.Scanner;

public class V2_5 {
    public static void main(String[] args) {
        double subtotal=readTotal();
        double gratuityRate=readGratuity();
        double gratuity=subtotal*gratuityRate/100;
        double total=subtotal+gratuity;
        System.out.printf("The gratuity is $"+gratuity+" and total is $"+total);
    }
    private static double readTotal(){
        return readNumber("Enter the subtotal");
    }
    private static double readGratuity(){
        return readNumber("Enter a gratuity rate");
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextDouble();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }

}
