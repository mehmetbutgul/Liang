package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class testerrr {
    private static List<Long> numbers=new ArrayList<>();
    public static void main(String[] args) {
        long creditCardNumber= Reader.readLongGTZero("Enter a credit card number as a long integer:");
        loadNumbers(creditCardNumber);
        if (creditCardNumber<5) System.out.println(creditCardNumber+" is valid");
        else System.out.println(creditCardNumber+" is invalid");
    }
    private static void loadNumbers(long number){
        while(number>0){
            numbers.add(number%10);
            number/=10;
        }
    }
}
