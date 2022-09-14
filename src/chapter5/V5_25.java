/* (Compute p) You can approximate p by using the following series:
 p = 4¢1 - 1 3 + 1 5 1 7 + 1 9 1 11 + g + (-1)i+1 2i - 1≤
 Write a program that displays the p value for i = 10000, 20000, …, and 100000*/
package chapter5;

public class V5_25 {
    public static void main(String[] args) {
        for (int i=10000;i<=100000;i+=10000){
            double pi=4*findSeries(i);
            System.out.println(i+"  -->  "+pi);
        }
    }
    private static double findSeries(int i){
        double sum=0;
        for (;2*i-1>=1;i--){
            sum+=Math.pow(-1,i+1)/(2*i-1);
        }
        return sum;
    }
}
