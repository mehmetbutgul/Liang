/* (Financial application: compare loans with various interest rates)
Write a program that lets the user enter the loan amount and loan period in number of years
and displays the monthly and total payments for each interest rate starting from 5% to 8%, with an increment of 1/8. */
package chapter5;

import java.text.DecimalFormat;
import java.util.Formatter;
import java.util.Scanner;

public class V5_21 {
    public static void main(String[] args) {
        double loan=readNumber("Loan Amount");
        int numberOfYears=(int) readNumber("Number Of Years:");
        double interestRateStart=5.0;
        double interestRateEnd=8.0;
        compareLoans(loan,numberOfYears,interestRateStart,interestRateEnd,(double) 1/8);
    }
    public static void compareLoans(double loan,int numberOfYears,double start,double end,double increment){
        System.out.println("Interest Rate    Monthly Payment    Total Payment");
        DecimalFormat decimalFormat=new DecimalFormat("#.000");
        DecimalFormat format=new DecimalFormat("#.00");
        for (;start<=end;start+=increment){
            Formatter formatter=new Formatter();
            double monthlyPayment=loan;                     //todo
            formatter.format("%.3f%10.2f+10.2f",start);
        }
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
