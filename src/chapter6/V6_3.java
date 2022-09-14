/*(Palindrome integer) Write the methods with the following headers
// Return the reversal of an integer, i.e., reverse(456) returns 654
public static int reverse(int number)
// Return true if number is a palindrome
public static boolean isPalindrome(int number)
Use the reverse method to implement isPalindrome. A number is a palindrome
if its reversal is the same as itself. Write a test program that prompts the
user to enter an integer and reports whether the integer is a palindrome.*/
package chapter6;

import Util.Reader;

import java.math.MathContext;

public class V6_3 {
    public static void main(String[] args) {
        int number= Reader.readIntGTZero("Enter an integer");
        long reverse=reverse(number);
        if (isPalindrome(number,reverse)) System.out.println("They are palindrome");
        else System.out.println("They are not palindrome");
    }
    public static long reverse(long number){
        long reverse=0;
        while (number>0){
            reverse=reverse*10+(number%10);
            number/=10;
        }
        return reverse;
    }
    public static boolean isPalindrome(long first,long second){
        return first==second;
    }
}
