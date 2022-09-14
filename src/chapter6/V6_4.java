/*(Display an integer reversed) Write a method with the following header to display
an integer in reverse order:
public static void reverse(int number)
For example, reverse(3456) displays 6543. Write a test program that prompts
the user to enter an integer and displays its reversal.*/
package chapter6;

import Util.Reader;

public class V6_4 {
    public static void main(String[] args) {
        int number= Reader.readIntGTZero("Enter an integer");
        System.out.println(V6_3.reverse(number));
    }
}
