/*(Mersenne prime) A prime number is called a Mersenne prime if it can be written
in the form 2p - 1 for some positive integer p. Write a program that finds all
Mersenne primes with p … 31 and displays the output as follows:
p 2^p –1
2 3
3 7
5 31*/
package chapter6;

import java.util.ArrayList;
import java.util.List;

public class V6_28 {
    public static void main(String[] args) {
        System.out.println("p                    2^p-1");
        System.out.println("--------------------------");
        List<Long> mersennePrimes=findMersennePrimes(31);
        for (int i = 0; i < mersennePrimes.size(); i++) {
            System.out.println(String.format("%2d                 %d",mersennePrimes.get(i),findTwoPMinusOne(mersennePrimes.get(i))));
        }
    }
    private static long findTwoPMinusOne(long p){
        return (long) (Math.pow(2,p)-1);
    }
    public static List<Long> findMersennePrimes(int limit){
        List<Long> primes=new ArrayList<>();
        for (long p = 2; p<=limit ; p++) {
            if (V6_26.isPrime(p) && V6_26.isPrime(findTwoPMinusOne(p)) ) primes.add(p);
        }
        return primes;
    }
}
