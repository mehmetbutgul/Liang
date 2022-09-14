/*(Sum a series) Write a program to sum the following series:
1 3 +
3 5 +
5 7 +
7 9 +
9 11 +
11 13 + g +
95 97 +
97 99
*/
package chapter5;

import java.math.BigDecimal;

public class V5_24 {
    public static void main(String[] args) {
        BigDecimal decimal=new BigDecimal(0);
        for (int i=1;i<98;i++){
            decimal=decimal.add(new BigDecimal((double) i/(i+3)));
        }
        System.out.println("Sum of series: "+decimal);
    }
}
