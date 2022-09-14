
/*
     (Financial application: calculate interest)
     If you know the balance and the annual percentage interest rate,
     you can compute the interest on the next monthly payment using the following formula:
        interest = balance * (annualInterestRate/1200)
     Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
 */

package chapter2;

import java.util.Scanner;

public class V2_20 {
    public static void main(String[] args) {
        double balance=readNumber("Enter balance: ");
        double annualInterestRate=readNumber("Enter  the annual percentage interest rate: ");
        double interestAsMonth=balance*(annualInterestRate/100/12);
        System.out.println("The interest is "+interestAsMonth);
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                double number= new Scanner(System.in).nextDouble();
                if(number<=0) throw new RuntimeException("number must be greater than 0");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
