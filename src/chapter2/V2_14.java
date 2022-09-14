
/*
     (Health application: computing BMI)
     Body Mass Index (BMI) is a measure of health on weight.
     It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters.
      Write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI.
      Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.

      Enter weight in pounds: 95.5
      Enter height in inches: 50
      BMI is 26.8573
 */

package chapter2;

import java.util.Scanner;

public class V2_14 {
    public static void main(String[] args) {
        double weightAsPounds=readNumber("Enter weight in pounds:");
        double heightAsInches=readNumber("Enter height in inches:");
        double onePound= 0.45359237;    //onePound= 0.45359237 kg
        double oneInch=0.0254;          //oneInch=0.0254 meter
        double bmi=weightAsPounds*onePound/(Math.pow(heightAsInches*oneInch,2));
        System.out.println("BMI is "+bmi);
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
