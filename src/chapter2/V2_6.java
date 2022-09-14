
// sum the digits in an integer
/*   Write a program that reads an integer between 0 and 1000 and adds all the digits in the integer.
For example, if an integer is 932, the sum of all its digits is 14.
Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit.
For instance, 932 % 10 = 2 and 932 / 10 = 93.
 */
package chapter2;

import java.util.Scanner;

public class V2_6 {
    public static void main(String[] args) {
        int number= readNumber("Enter a number between 0 and 1000");
        int sumOfDigits=0;
        int numberOfTheNumber=String.valueOf(number).length();
        for (int counter=1; counter<=numberOfTheNumber; counter++){
            sumOfDigits+=number%10;
            number=number/10;
        }
        System.out.println("Sum of the digits is "+sumOfDigits);
    }
    private static int readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if(number<0 || number>10000) throw new RuntimeException("between 0 and 1000");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
