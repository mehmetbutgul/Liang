
/*
     (Geometry: area of a triangle)
     Write a program that prompts the user to enter three points (x1, y1), (x2, y2), (x3, y3) of a triangle and displays its area.
     The formula for computing the area of a triangle is
            s = (side1 + side2 + side3)/2;
            area =2s(s - side1)(s - side2)(s - side3)
 */

package chapter2;

import java.util.Scanner;

public class V2_19 {
    public static void main(String[] args) {
        System.out.println("Enter three points for a triangle: ");
        Triangle triangle=new Triangle(readNumber("x1"),readNumber("y1"),readNumber("x2"),readNumber("y2"),readNumber("x3"),readNumber("y3"));
        System.out.println("The area of the triangle is "+triangle.calculateArea());
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                double number= new Scanner(System.in).nextDouble();
                return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
class Triangle{
    private double x1,y1,x2,y2,x3,y3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public double calculateArea(){
        double side1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        double side2=Math.sqrt(Math.pow(x1-x3,2)+Math.pow(y1-y3,2));
        double side3=Math.sqrt(Math.pow(x2-x3,2)+Math.pow(y2-y3,2));
        double s=(side1+side2+side3)/2;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
}
