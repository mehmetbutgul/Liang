/* (Display prime numbers between 2 and 1,000)
Modify Listing 5.15 to display all the prime numbers between 2 and 1,000, inclusive.
Display eight prime numbers per line. Numbers are separated by exactly one space. */
package chapter5;
public class V5_20 {
    public static void main(String[] args) {
        System.out.println("prime numbers 2-1000");
        for (int eight = 0, number = 3; number < 1000; number += 2) {
            int counter = 3;
            while (number % counter != 0 && counter * counter < number) counter += 2;
            if (counter > Math.sqrt(number)) {
                System.out.print(number + " ");
                eight++;
                if (eight%8==0) System.out.println();
            }

        }
    }

}
