/* (Find the factors of an integer)
Write a program that reads an integer and displays all its smallest factors in increasing order.
For example, if the input integer is 120, the output should be as follows: 2, 2, 2, 3, 5. */
package chapter5;

import java.util.Scanner;

public class V5_16 {
    public static void main(String[] args) {
        int number=readNumber("Enter positive number");
        System.out.println(findFactors(number));

    }

    public static StringBuffer findFactors(int number) {
        int factor=2;
        StringBuffer factors=new StringBuffer();
        while (number >1){
            while (number %factor==0){
                factors.append(factor+",");
                number /=factor;
            }
            factor++;
        }
        return factors.deleteCharAt(factors.length()-1);
    }
    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if (number<2) throw new RuntimeException();
                return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
