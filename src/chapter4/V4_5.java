/* (Geometry: area of a regular polygon)
A regular polygon is an n-sided polygon in which all sides are of the same length and all angles have the same degree
(i.e., the polygon is both equilateral and equiangular). The formula for computing the area of a regular polygon is
Area =
n * s2 4 * tan¢p n
 Here, s is the length of a side.
 Write a program that prompts the user to enter the number of sides and their length of a regular polygon and displays its area.
 */
package chapter4;

import java.util.Scanner;

public class V4_5 {
    public static void main(String[] args) {
        int numberOfSide=(int)readNumber("Enter the number of sides:");
        double side=readNumber("Enter the side:");
        double area=calculateArea(numberOfSide,side);
        System.out.println("The area of the polygon is "+area);
    }
    public static double calculateArea(int n,double side){
        return (n*Math.pow(side,2))/(4*Math.tan(Math.PI/n));
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
