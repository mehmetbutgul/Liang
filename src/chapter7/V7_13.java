/*(Random number chooser) Write a method that returns a random number between
1 and 54, excluding the numbers passed in the argument. The method header is
specified as follows:
public static int getRandom(int... numbers)*/
package chapter7;

import java.util.Random;

public class V7_13 {
    public static void main(String[] args) {
        System.out.println(getRandom(5,1,8,4,6,2,21,22,23,24,26,27,28,29,30,31,45,16,25,41,32,33,34,35,36,37,38,39));
    }
    public static int getRandom(int... numbers){
        Random random=new Random();
        int number=random.nextInt(1,55);
        while (anyMatch(number,numbers)){
            number=random.nextInt(1,55);
        }
        return number;
    }
    public static boolean anyMatch(int number,int... numbers){
        int i=0;
        while (numbers[i]!=i && i<numbers.length){
            i++;
        }
        return numbers[i]==i;
    }
}
