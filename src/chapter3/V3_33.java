/* (Financial: compare costs)
Suppose you shop for rice in two different packages.
You would like to write a program to compare the cost.
The program prompts the user to enter the weight and price of the each package
and displays the one with the better price.*/
package chapter3;

import java.util.Scanner;

public class V3_33 {
    public static void main(String[] args) {
        System.out.println("Enter weight and price for package 1:");
        Package package1=new Package(readNumber(),readNumber());
        System.out.println("Enter weight and price for package 2:");
        Package package2=new Package(readNumber(),readNumber());
        switch (package1.compareTo(package2)){
            case 1:
                System.out.println("Package 1 has a better price.");break;
            case -1:
                System.out.println("Package 2 has a better price.");break;
            case 0:
                System.out.println("Two packages have the same price.");break;
        }
    }
    private static double readNumber(){
        while (true) {
            try {
                double weight=Double.parseDouble(new Scanner(System.in).next());
                if (weight<0) throw new RuntimeException();
                return weight;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
class Package implements Comparable<Package>{
    private double weight,price;
    public Package(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }
    public double findRealValue(){
        return getWeight()/getPrice();
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Package o) {
        if (findRealValue()>o.findRealValue()) return 1;
        else if (findRealValue()<o.findRealValue()) return -1;
        else return 0;
    }
}
