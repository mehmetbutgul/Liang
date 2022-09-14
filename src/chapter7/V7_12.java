/*(Reverse an array) The reverse method in Section 7.7 reverses an array by
copying it to a new array. Rewrite the method that reverses the array passed in
the argument and returns this array. Write a test program that prompts the user to
enter ten numbers, invokes the method to reverse the numbers, and displays the
numbers.*/
package chapter7;

import java.util.Random;
import java.util.stream.DoubleStream;

public class V7_12 {
    public static void main(String[] args) {
        System.out.println("10 numbers are: ");
        double[] numbers= new Random().doubles(1,8000).limit(10).peek(value -> System.out.print(String.format("%10.2f",value))).toArray();
        System.out.println();
        System.out.println("10 reverse numbers");
        DoubleStream.of(reverse(numbers)).forEach(value -> System.out.print(String.format("%10.2f",value)));
    }
    public static double[] reverse(double[] array){
        double[] newArray=new double[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[array.length-i-1];
        }
        return newArray;
    }
}
