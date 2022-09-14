/*
     (Geometry: point in a circle?)
     Write a program that prompts the user to enter a point (x, y) and
     checks whether the point is within the circle centered at (0, 0) with radius 10.
     For example, (4, 5) is inside the circle and (9, 9) is outside the circle, as shown in Figure 3.7a.
     (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
     The formula for computing the distance is 2(x2 - x1)2 + (y2 - y1)2.
 */
package chapter2;

import java.util.Scanner;

public class V3_22 {
    public static void main(String[] args) {
        Circle circle=new Circle(0,0,10);
        double x2=readNumber("Enter a point x:");
        double y2=readNumber("Enter a point y:");
        if (circle.isPointInside(x2,y2)) System.out.println("Point ("+x2+", "+y2+") is in the circle");
        else System.out.println("Point ("+x2+", "+y2+") is not in the circle");
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                double number = new Scanner(System.in).nextDouble();
                return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
class Circle {
    private double x;
    private double y;
    private double radius;

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public boolean isPointInside(double x2,double y2){
        double distance=Math.sqrt(Math.pow(x2-this.getX(),2)+Math.pow(y2-this.getY(),2));
        return distance<this.getRadius();
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getRadius() {
        return radius;
    }
}
