/*(Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player.*/
package chapter6;

import java.util.Random;
import java.util.stream.IntStream;

public class V6_30 {
    public static void main(String[] args) {
        int point=rollTwoDice();
        int controller=select(point);
        if (isWinOrLose(controller)) printResult(controller);
        else carryOn(controller);
    }
    public static int rollTwoDice(){
        System.out.print("You rolled ");
        return IntStream.generate(() -> new Random().nextInt(1,7)).limit(2).peek(value -> System.out.print(value+" ")).sum();
    }
    private static int select(int point){
        return switch (point){
            case 7,11 ->1;
            case 2,3,12 ->-1;
            default -> point;
        };
    }
    private static boolean isWinOrLose(int controller){
        return controller==1 || controller==-1;
    }
    private static void printResult(int controller){
        System.out.println();
        if (controller==1) System.out.println("You win");
        else if (controller==-1) System.out.println("You lose");
    }
    private static void carryOn(int point){
        System.out.println("Point is "+point);
        int result=rollTwoDice();
        while (result!=point && result!=7){
            result=rollTwoDice();
        }
        if (result==7) printResult(-1);
        else printResult(1);
    }
}
