/*
     (Geometry: two rectangles)
     Write a program that prompts the user to enter the center x-, y-coordinates, width, and height of two rectangles
     and determines whether the second rectangle is inside the first or overlaps with the first,
     as shown in Figure 3.9. Test your program to cover all cases.

* */
package chapter3;

import java.util.Scanner;

public class V3_28 {
    public static void main(String[] args) {
        System.out.println("Enter r1's center x-, y-coordinates, width, and height:");
        MyRectangle rectangle=new MyRectangle(readNumber(),readNumber(),readNumber(),readNumber());
        System.out.println("Enter r2's center x-, y-coordinates, width, and height:");
        MyRectangle rectangle2=new MyRectangle(readNumber(),readNumber(),readNumber(),readNumber());
        if (rectangle.contains(rectangle2)) System.out.println("r2 is inside r1 ");
        else if (rectangle.intersects(rectangle2)) System.out.println("r2 overlaps r1");
        else System.out.println("r2 does not overlap r1");


    }
    private static double readNumber(){
        while (true) {
            try {
                double number=Double.parseDouble(new Scanner(System.in).next());
                return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
class MyRectangle{
    private double x1,y1,width,height;

    public MyRectangle(double x1, double y1, double width, double height) {
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
    }

    public boolean contains(MyRectangle other){
        return ((Math.pow(Math.pow(other.getY1() - this.getY1(), 2),0.5) + other.getHeight() / 2 <= this.getHeight() / 2) &&
                (Math.pow(Math.pow(other.getX1() - this.getX1(), 2), 0.5) + other.getWidth() / 2 <= this.getWidth() / 2) &&
                (this.getHeight() / 2 + other.getHeight() / 2 <= this.getHeight()) &&
                (this.getWidth() / 2 + other.getWidth() / 2 <= this.getWidth()));
    }
    public boolean intersects(MyRectangle other){
        return (this.getX1() + this.getWidth() / 2 > other.getX1() - other.getWidth()) ||
                (this.getY1() + this.getHeight() / 2 > other.getY1() - other.getHeight());
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
