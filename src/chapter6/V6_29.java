/*(Twin primes) Twin primes are a pair of prime numbers that differ by 2. For example,
3 and 5 are twin primes, 5 and 7 are twin primes, and 11 and 13 are twin primes.
Write a program to find all twin primes less than 1,000. Display the output as follows:
(3, 5)
(5, 7)
...*/
package chapter6;

public class V6_29 {
    public static void main(String[] args) {
        System.out.println("Twin Primes:");
        long prime=3;
        while (prime<1000){
            long next=V6_26.findNextPrime(prime);
            if (next-prime==2) System.out.println("("+prime+", "+next+")");
            prime=next;
        }
    }
}
