/* (Order three cities) Write a program that prompts the user to enter three cities and displays them in ascending order.*/
package chapter4;

import java.util.Scanner;
import java.util.stream.Stream;

public class V4_24 {
    public static void main(String[] args) {
        XCity city=new XCity(readText("Enter the first city:"));
        XCity city1=new XCity(readText("Enter the second city:"));
        XCity city2=new XCity(readText("Enter the third city:"));
        System.out.print("The three cities in alphabetical order are");
       Stream.of(city,city1,city2).sorted((x,y)->x.getName().compareTo(y.getName())).forEach(city3 -> System.out.print(" "+city3.getName()));
    }
    private static String readText(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).next();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }

}
class XCity{
    private String name;

    public XCity(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
