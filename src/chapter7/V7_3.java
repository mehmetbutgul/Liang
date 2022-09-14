/*(Count occurrence of numbers) Write a program that reads the integers between 1
and 100 and counts the occurrences of each. Assume the input ends with 0.*/
package chapter7;

import java.util.*;
import java.util.stream.Collectors;

public class V7_3 {
    public static void main(String[] args) {
        List<Integer> numbers = readNumbers();
        SortedMap<Integer,List<Integer>> map=numbers.stream().collect(Collectors.groupingBy(Integer::intValue,TreeMap::new, Collectors.toList()));
        for (int key:map.keySet()) {
            System.out.println(key+" occurs "+map.get(key).size()+" time"+(map.get(key).size()>1?"s":""));
        }
    }
    public static List<Integer> readNumbers(){
        System.out.println("Enter the integers between 1 and 100:");
        List<Integer> numbers=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int number=5;
        do {
            try {
                do {
                    number=scanner.nextInt();
                    if (number > 1 && number < 101) numbers.add(number);
                } while (number > 1 && number < 101);
            }catch (Exception e){
                System.err.println("please enter integer");
            }
            if (number != 0) System.out.println("Enter the integers between 1 and 100:");
        } while (number != 0);
        return numbers;
    }
}
