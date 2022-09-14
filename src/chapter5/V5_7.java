/* (Financial application: compute future tuition)
Suppose that the tuition for a university is $10,000 this year and increases 5% every year.
In one year, the tuition will be $10,500.
Write a program that computes the tuition in ten years and the total cost of four years’ worth of tuition after the tenth year.*/
package chapter5;

import java.math.BigDecimal;

public class V5_7 {
    public static void main(String[] args) {
        BigDecimal tuition=new BigDecimal(10000);
        for (int year=1;year<=10;year++){
            tuition= tuition.add(tuition.divide(BigDecimal.valueOf(100)).multiply(new BigDecimal(5)));
        }
        System.out.println("Tutions in ten year $"+tuition);
        BigDecimal totalInLastFourYears=new BigDecimal(0);
        for (int year=1;year<=4;year++){
            BigDecimal oneYear=tuition.divide(BigDecimal.valueOf(100)).multiply(new BigDecimal(5));
            tuition= tuition.add(oneYear);
            totalInLastFourYears=totalInLastFourYears.add(oneYear);
        }
        System.out.println("total cost in 14 years $"+tuition);
        System.out.println("in last 4 years $"+totalInLastFourYears);
    }
}
