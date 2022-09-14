/*(Business: check ISBN-13) ISBN-13 is a new standard for indentifying books. It
uses 13 digits d1d2d3d4d5d6d7d8d9d10d11d12d13. The last digit d13 is a checksum,
which is calculated from the other digits using the following formula:
10 - (d1 + 3d2 + d3 + 3d4 + d5 + 3d6 + d7 + 3d8 + d9 + 3d10 + d11 + 3d12)%10
If the checksum is 10, replace it with 0. Your program should read the input as a
string.
*/
package chapter5;

import java.util.Random;
import java.util.stream.IntStream;

public class V5_47 {
    public static void main(String[] args) {
        String isbn= IntStream.generate(()->new Random().nextInt(0,10)).limit(12).mapToObj(String::valueOf).reduce("",String::concat);
        System.out.println(isbn);
        int total = getTotal(isbn);
        int cheksum=10-total%10;
        cheksum=cheksum==10?0:cheksum;
        System.out.println("The ISBN-13 number is "+isbn+cheksum);
    }

    private static int getTotal(String isbn) {
        int total=0;
        for (int i = 0; i< isbn.length(); i++) {
            if (i%2==0)total+=Integer.valueOf(isbn.charAt(i));
            else total+=3*Integer.valueOf(isbn.charAt(i));
        }
        return total;
    }
}
