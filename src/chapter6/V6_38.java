/*(Generate random characters) Use the methods in RandomCharacter in Listing
6.10 to print 100 uppercase letters and then 100 single digits, printing ten per line.*/
package chapter6;

import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class V6_38 {
    public static void main(String[] args) {
        System.out.println("random characters");
        Stream.iterate(0,n->n+1).limit(10).forEach(s-> System.out.println( new Random().ints(10,65,91).mapToObj(Character::toString).collect(Collectors.joining(" "))));
        System.out.println("random numbers");
        Stream.iterate(0,n->n+1).limit(10).forEach(s-> System.out.println( new Random().ints(10,0,10).mapToObj(Objects::toString).collect(Collectors.joining(" "))));
    }
}
