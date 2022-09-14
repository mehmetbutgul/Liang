/*(Print distinct numbers) Write a program that reads in ten numbers and displays
the number of distinct numbers and the distinct numbers separated by exactly one
space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
Read a number and store it to an array if it is new. If the number is already in the
array, ignore it.) After the input, the array contains the distinct numbers.*/
package chapter7;

import java.util.*;
import java.util.stream.Collectors;

public class V7_5 {
    public static void main(String[] args) {
        System.out.println("Enter ten numbers:");
        List<Integer> numbers = readNumbers();
        System.out.println("The number of distinct number is "+numbers.stream().distinct().count());
        System.out.print("The distinct numbers are: ");
        numbers.stream().distinct().forEach(i-> System.out.print(i+" "));
    }
    public static List<Integer> readNumbers(){
        List<Integer> numbers=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        for (int i = 0; i <10; i++) {
            try {
                number=scanner.nextInt();
                numbers.add(number);
            }catch (Exception e){
                System.err.println("please enter integer");
                i--;
            }
        }
        return numbers;
    }
}
