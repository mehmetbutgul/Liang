/* (Generate vehicle plate numbers)
Assume a vehicle plate number consists of three uppercase letters followed by four digits.
Write a program to generate a plate number.*/
package chapter4;

import java.util.Random;

public class V4_26 {
    public static void main(String[] args) {
        StringBuffer plate=new StringBuffer();
        Random random=new Random();
        for (int counter=0;counter<3;counter++) {
            plate.append((char)random.nextInt(65, 91));
        }
        for (int counter=0;counter<4;counter++){
            plate.append(random.nextInt(0,10));
        }
        System.out.println(plate);
    }
}
