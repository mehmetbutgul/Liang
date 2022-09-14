
/*
     (Financial application: calculate future investment value)
     Write a program that reads in investment amount, annual interest rate, and number of years,
     and displays the future investment value using the following formula:
            futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12
    For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98.
 */

package chapter2;

import java.util.Scanner;

public class V2_21 {
    public static void main(String[] args) {
        double investmentAmount=readNumber("Enter investment amount: ");
        double annualInterestRate=readNumber("Enter annual interest rate in percentage: ");
        double numberOfYears=readNumber("Enter number of years: ");
        double futureInvestmentValue= investmentAmount*Math.pow(1+annualInterestRate/100/12,numberOfYears*12);
        System.out.println("Accumulated value is $"+futureInvestmentValue);
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
