/* (Count positive and negative numbers and compute the average of numbers)
Write a program that reads an unspecified number of integers,
determines how many positive and negative values have been read,
and computes the total and average of the input values (not counting zeros).
Your program ends with the input 0. Display the average as a floating-point number*/
package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class V5_1 {
    public static void main(String[] args) {
        String numbers=readNumbers("Enter an integer, the input ends if it is 0:");
        while (!numbers.equals("0")){
            try {
                    List<Integer> list = toList(numbers);
                    computeAndWrite(list);
            }catch (Exception e){
                    System.err.println("there is an invalid input");
            }
            numbers=readNumbers("Enter an integer, the input ends if it is 0:");
        }
    }
    public static void computeAndWrite(List<Integer> list){
        System.out.println("The number of positives is "+list.stream().filter(o ->o>0).count());
        System.out.println("The number of negatives is "+list.stream().filter(x->x<0).count());
        System.out.println("The total is "+list.stream().mapToInt(Integer::intValue).sum());
        System.out.println("The average is "+list.stream().mapToInt(x->x).average().getAsDouble());
    }
    private static List<Integer> toList(String numbers){
        StringTokenizer tokenizer=new StringTokenizer(numbers);
        List<Integer> list=new ArrayList<>();
        while (tokenizer.hasMoreTokens()){
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }
        return list;
    }
    private static String readNumbers(String str) {
        while (true) {
            System.out.println(str);
            try {
                return new Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
