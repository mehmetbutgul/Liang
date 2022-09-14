/*(Geometry: great circle distance)
The great circle distance is the distance between two points on the surface of a sphere.
Let (x1, y1) and (x2, y2) be the geographical latitude and longitude of two points.
The great circle distance between the two points can be computed using the following formula:
 d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees
and displays its great circle distance. The average earth radius is 6,371.01 km.
Note that you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians.
The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees. */
package chapter4;

import java.awt.*;
import java.util.Scanner;

public class V4_2 {
    private static final double RADIUS = 6371.01;
    public static void main(String[] args) {
        double latitude1=Math.toRadians(readNumber("Enter point 1 latitude in degrees:"));
        double longitude1=Math.toRadians(readNumber("Enter point 1 longitude in degrees:"));
        double latitude2=Math.toRadians(readNumber("Enter point 2 latitude in degrees:"));
        double longitude2=Math.toRadians(readNumber("Enter point 2 longitude in degrees:"));
        double distance=calculateDistance(latitude1,longitude1,latitude2,longitude2);
        System.out.println("The distance between the two points is " + distance);
    }
    public static double computeDistance(City first,City second){
        return calculateDistance(Math.toRadians(first.getLatitude()), Math.toRadians(first.getLongitude()), Math.toRadians(second.getLatitude()), Math.toRadians(second.getLongitude()));
    }
    private static double calculateDistance(double latitude1,double longitude1,double latitude2,double longitude2){
        return RADIUS * Math.acos(Math.sin(latitude1) * Math.sin(latitude2) +
                Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                double point=Double.parseDouble(new Scanner(System.in).next());
                return point;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}