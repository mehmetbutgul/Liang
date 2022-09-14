/*(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)*/
package chapter7;

import java.util.Random;
import java.util.stream.Collectors;

public class V7_7 {
    public static void main(String[] args) {
        new Random().ints(100,0,10).boxed().collect(Collectors.groupingBy(Integer::intValue)).forEach((integer, integers) -> System.out.println(integer+" -> "+integers.size()));
    }
}
