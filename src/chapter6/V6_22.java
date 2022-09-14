/*(Math: approximate the square root) There are several techniques for implementing
the sqrt method in the Math class. One such technique is known as the
Babylonian method. It approximates the square root of a number, n, by repeatedly
performing a calculation using the following formula:
nextGuess = (lastGuess + n / lastGuess) / 2
When nextGuess and lastGuess are almost identical, nextGuess is the
approximated square root. The initial guess can be any positive value (e.g., 1).
This value will be the starting value for lastGuess. If the difference between
nextGuess and lastGuess is less than a very small number, such as 0.0001,
you can claim that nextGuess is the approximated square root of n. If not, next-
Guess becomes lastGuess and the approximation process continues. Implement
the following method that returns the square root of n.*/
package chapter6;

import Util.Reader;

public class V6_22 {
    public static void main(String[] args) {
        double number= Reader.readDoubleGTZero("Enter your number");
        double sqrt=sqrt(number);
        System.out.println(sqrt);
    }
    public static double sqrt(double number){
        double lastGuess=10;
        double nextGuess=(lastGuess+number/lastGuess)/2;
        while (nextGuess-lastGuess>0.00001){
            lastGuess=nextGuess;
            nextGuess=(lastGuess+number/lastGuess)/2;
        }
        lastGuess=nextGuess;
        return (lastGuess+number/lastGuess)/2;
    }
}
