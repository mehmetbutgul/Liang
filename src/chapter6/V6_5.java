/*Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(
double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.*/
package chapter6;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class V6_5 {
    public static void main(String[] args) {
        int[] numbers= IntStream.generate(() -> new Random().nextInt()).limit(3).toArray();
        IntStream.of(numbers).sorted().forEach(System.out::println);
    }
}
