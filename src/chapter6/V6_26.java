/*(Palindromic prime) A palindromic prime is a prime number and also palindromic.
For example, 131 is a prime and also a palindromic prime, as are 313 and
757. Write a program that displays the first 100 palindromic prime numbers. Display
10 numbers per line, separated by exactly one space, as follows:
2 3 5 7 11 101 131 151 181 191
313 353 373 383 727 757 787 797 919 929*/
package chapter6;

import java.util.ArrayList;
import java.util.List;

public class V6_26 {
    public static void main(String[] args) {
        System.out.println("100 palindromic prime numbers ");
        List<Long> primes=findPalindromicPrimeUntilLimit(100);
        displayNumbers(primes);
    }

    public static void displayNumbers(List<Long> primes) {
        for (int i = 0; i < primes.size() ; i++) {
            System.out.print(primes.get(i) + " ");
            if (i%10==9) System.out.println();
        }
    }

    public static List<Long> findPalindromicPrimeUntilLimit(int limit){
        List<Long> primes=new ArrayList<>(limit);
        long prime=2;
        while(primes.size()<limit) {
            if (V6_3.isPalindrome(prime,V6_3.reverse(prime))) primes.add(prime);
            prime=findNextPrime(prime);
        }
        return primes;
    }
    public static long findNextPrime(long previous){
        if (previous==2) return 3;
        long next = previous+2;
       while (!isPrime(next)) next+=2;
       return next;
    }
    public static boolean isPrime(long number){
        if (number==2)return true;
        if (number%2==0)return false;
        long counter=3;
        while (number % counter != 0 && counter * counter < number) counter += 2;
        if (counter > Math.sqrt(number)) return true;
        return false;
    }
}
