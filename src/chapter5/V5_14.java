/* (Compute the greatest common divisor)
 Another solution for Listing 5.9 to find the greatest common divisor of two integers n1 and n2 is as follows:
 First find d to be the minimum of n1 and n2, then check whether d, d-1, d-2, ...,2, or 1 is a divisor for both n1 and n2 in this order.
 The first such common divisor is the greatest common divisor for n1 and n2.
 Write a program that prompts the user to enter two positive integers and displays the gcd.*/
package chapter5;

import java.util.Scanner;

public class V5_14 {
    public static void main(String[] args) {
        int n1=readNumber("Enter first number");
        int n2=readNumber("Enter second number");
        int gcd = computeGCD(n1, n2);
        System.out.println("The greatest common divisor is "+gcd);
    }

    private static int computeGCD(int n1, int n2) {
        int minimum= n1 < n2 ? n1 : n2;
        while (n1 %minimum!=0 || n2 %minimum!=0){
            minimum--;
        }
        return minimum;
    }

    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
