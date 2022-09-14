/*(Emirp) An emirp (prime spelled backward) is a nonpalindromic prime number
whose reversal is also a prime. For example, 17 is a prime and 71 is a prime, so 17
and 71 are emirps. Write a program that displays the first 100 emirps. Display 10
numbers per line, separated by exactly one space, as follows:
13 17 31 37 71 73 79 97 107 113
149 157 167 179 199 311 337 347 359 389*/
package chapter6;

import java.util.TreeSet;

public class V6_27 {
    public static void main(String[] args) {
        System.out.println(" first 100 emirps ");
        TreeSet<Long> emirps=findEmirpsUntil(100);
        V6_26.displayNumbers(emirps.stream().toList());
    }
    public static TreeSet<Long> findEmirpsUntil(int limit){
        TreeSet<Long> emirps=new TreeSet<>();
        long prime=2;
        while(emirps.size()<limit) {
            if (V6_26.isPrime(V6_3.reverse(prime)) && !V6_3.isPalindrome(prime,V6_3.reverse(prime))) emirps.add(prime);
            prime=V6_26.findNextPrime(prime);
        }
        return emirps;
    }
}
