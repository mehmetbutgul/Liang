/* (Display the ASCII character table)
Write a program that prints the characters in the ASCII character table from ! to ~.
Display ten characters per line. The ASCII table is shown in Appendix B.
Characters are separated by exactly one space. */
package chapter5;

public class V5_15 {
    public static void main(String[] args) {
        int counter=1;
        for (char c='!';c<='~';c++){
            System.out.print(c+" ");
            if (counter%10==0) System.out.println();
            counter++;
        }
    }
}
