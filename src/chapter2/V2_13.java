
/*
    (Financial application: compound value)
    Suppose you save $100 each month into a savings account with the annual interest rate 5%.
    Thus, the monthly interest rate is 0.05/12 = 0.00417.
     After the first month, the value in the account becomes
            100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
            (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
            (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month.
     (In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.)
 */

package chapter2;

import java.util.Scanner;

public class V2_13 {
    public static void main(String[] args) {
        double annualInterestRate=5.0;
        double monthlyInterest=annualInterestRate/100/12;
        double monthlySavingAmount=readNumber("Enter the monthly saving amount:");
        double currentAmount=0;
        for(int month=1; month<=6; month++){
            currentAmount=(monthlySavingAmount+currentAmount)*(1+monthlyInterest);
        }
        System.out.println("After the six month, the account value is $"+currentAmount);
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
