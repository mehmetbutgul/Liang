/* (Statistics: compute mean and standard deviation)
In business applications, you are often asked to compute the mean and standard deviation of data.
The mean is simply the average of the numbers. The standard deviation is a statistic that tells you how tightly
all the various data are clustered around the mean in a set of data.
For example, what is the average age of the students in a class? How close are the ages?
 If all the students are the same age, the deviation is 0.
 Write a program that prompts the user to enter ten numbers, and displays the mean and standard deviations of these numbers
 using the following formula:
 */
package chapter5;

import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.IntStream;


public class V5_45 {
    public static void main(String[] args) {
        List<Integer> numbers=IntStream.generate(() -> new Random().nextInt(1,1000)).limit(10).collect(CopyOnWriteArrayList::new,CopyOnWriteArrayList::add,CopyOnWriteArrayList::addAll);
        numbers.forEach(x -> System.out.print(x+" "));
        System.out.println();
        System.out.println("Mean: "+numbers.stream().mapToInt(value ->value).average().getAsDouble());
        double deviation=Math.sqrt(numbers.stream().mapToDouble(value ->value).reduce(1,(x,y)->Math.pow(y-numbers.stream().mapToDouble(Integer::doubleValue).average().getAsDouble(),2)/(numbers.size()-1)+x));
        System.out.println("The standard deviation is "+deviation);
    }
}
