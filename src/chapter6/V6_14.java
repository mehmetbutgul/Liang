/*(Estimate p) p can be computed using the following series:
*/
package chapter6;

import Util.Reader;

import java.util.regex.Pattern;

public class V6_14 {
    public static void main(String[] args) {
        System.out.println("i                       m(i)");
        System.out.println("----------------------------------");
        for (int j = 1; j <1000 ; j+=100) {
            System.out.println(String.format("%3d %25.4f",j,computePI(j)));
        }
    }
    private static double computePI(int i){
        double total=0;
        for (int counter = 1; counter <=2*i-1 ; counter++) {
            total+= Math.pow(-1,counter+1)/(2*counter-1);
        }
        return 4*total;
    }
}
