/*(Average an array) Write two overloaded methods that return the average of an
array with the following headers:
public static int average(int[] array)
public static double average(double[] array)
Write a test program that prompts the user to enter ten double values, invokes this
method, and displays the average value.*/
package chapter7;

import java.util.Random;
import java.util.stream.*;

public class V7_8 {
    public static void main(String[] args) {
        System.out.println("average of 10 Integer numbers");
        System.out.println(average(IntStream.generate(() -> new Random().nextInt()).limit(10).toArray()));
        System.out.println("average of 10 Double numbers");
        System.out.println(average(Stream.generate(() ->new Random().nextDouble()).limit(10).mapToDouble(Double::doubleValue).toArray()));
    }
    public static double average(double[] array){
        return DoubleStream.of(array).average().getAsDouble();
    }
    public static double average(int[] array){
        return IntStream.of(array).average().getAsDouble();
    }
}
