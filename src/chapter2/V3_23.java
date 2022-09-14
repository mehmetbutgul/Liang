/*
     (Geometry: point in a rectangle?)
     Write a program that prompts the user to enter a point (x, y) and
     checks whether the point is within the rectangle centered at (0, 0) with width 10 and height 5.
     For example, (2, 2) is inside the rectangle and (6, 4) is outside the rectangle, as shown in Figure 3.7b.
     (Hint: A point is in the rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2
     and its vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to cover all cases.)
 */
package chapter2;

import java.awt.*;
import java.util.Scanner;

public class V3_23 {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle((0-10)/2,(0-5)/2,10,5);
        double x=readNumber("Enter a point x:");
        double y=readNumber("Enter a point y:");
        if (rectangle.contains(x,y)) System.out.println("Point ("+x+", "+y+") is in the rectangle");
        else System.out.println("Point ("+x+", "+y+") is not in the rectangle");
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

