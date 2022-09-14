
/*
     (Cost of driving)
     Write a program that prompts the user to enter the distance to drive,
     the fuel efficiency of the car in miles per gallon, and the price per gallon,
     and displays the cost of the trip.

        Enter the driving distance: 900.5
        Enter miles per gallon: 25.5
        Enter price per gallon: 3.55
        The cost of driving is $125.36

 */

package chapter2;

import java.util.Scanner;

public class V2_23 {
    public static void main(String[] args) {
        double dirivingDistance=readNumber("Enter the driving distance: ");
        double milesPerGallon=readNumber("Enter miles per gallon: ");
        double pricePerGallon=readNumber("Enter price per gallon: ");
        double cost= dirivingDistance/milesPerGallon*pricePerGallon;
        System.out.println("The cost of driving is $"+cost);
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
