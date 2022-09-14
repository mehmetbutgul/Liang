/*
   (Algebra: solve quadratic equations)
   The two roots of a quadratic equation ax2 + bx + c = 0 can be obtained using the following formula:
    r1 =-b +2b2 - 4ac 2a
and r2 = -b -2b2 - 4ac 2a b2 - 4ac
is called the discriminant of the quadratic equation.
If it is positive, the equation has two real roots.
If it is zero, the equation has one root.
If it is negative, the equation has no real roots.
Write a program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant.
If the discriminant is positive, display two roots.
If the discriminant is 0, display one root. Otherwise, display “The equation has no real roots”.
Note that you can use Math.pow(x, 0.5) to compute 2x.
 */
package chapter3;

import java.util.Scanner;

public class V3_1 {
    public static void main(String[] args) {
        double a=readNumber("Enter a");
        double b=readNumber("Enter b");
        double c=readNumber("Enter c");
        double discriminant=Math.pow(b,2)-4*a*c;
        if(discriminant>0){
            System.out.println("The equation has two roots "+(-b+Math.pow(discriminant,0.5))/(2*a)+" and "+(-b-Math.pow(discriminant,0.5))/(2*a));
        } else if (discriminant<0) {
            System.out.println("The equation has no real roots ");
        }
        else System.out.println("The equation has one root "+(-b)/(2*a));
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextDouble();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
