/*(Perfect number) A positive integer is called a perfect number if it is equal to the sum of all of its positive divisors,
excluding itself. For example, 6 is the first perfect number because 6 = 3 + 2 + 1.
The next is 28 = 14 + 7 + 4 + 2 + 1. There are four perfect numbers less than 10,000. Write a program to find all these four numbers.*/
package chapter5;

public class V5_33 {
    public static void main(String[] args) {
        System.out.println("Perfect Numbers less than 10000");
        for (int number=3;number<10000;number++){
            int totalOfDivisor=1;
            int divisor=2;
            for (;divisor*divisor<number;divisor++){
                if (number%divisor==0) totalOfDivisor+=divisor+number/divisor;
            }
            if (divisor*divisor==number) totalOfDivisor+=divisor;
            if (number==totalOfDivisor) System.out.println(number+"  ");
        }
    }
}
