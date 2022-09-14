/*
     (Game: scissor, rock, paper)
     Write a program that plays the popular scissor-rockpaper game.
     (A scissor can cut a paper, a rock can knock a scissor, and a paper can wrap a rock.)
     The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper.
     The program prompts the user to enter a number 0, 1, or 2 and
     displays a message indicating whether the user or the computer wins, loses, or draws.
 */
package chapter3;

import java.util.*;

public class V3_17 {
    public static void main(String[] args) {
        while (true){
        int guess=readNumber("scissor (0), rock (1), paper (2):",0,2);
        int numberOfRandom=new Random().nextInt(0,3);
        ChainOfResponsibility chain=new SCISSOR().setNext(new ROCK()).setNext(new PAPER());

       switch (chain.check(numberOfRandom,guess)){
           case 0: System.out.println("The computer is "+chain.findName(numberOfRandom)+" You are "+chain.findName(guess)+" too. It is a draw");break;
           case 2: System.out.println("The computer is "+chain.findName(numberOfRandom)+". You are "+chain.findName(guess)+". You lost");break;
           case 1:System.out.println("The computer is "+chain.findName(numberOfRandom)+". You are "+chain.findName(guess)+". You won");break;
           default: System.out.println("ERROR");
       }}
    }
    private static int readNumber(String text,int sublimit,int toplimit){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if (number<sublimit||number>toplimit) throw new RuntimeException();
                return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
abstract class ChainOfResponsibility{
    static protected String resultName;
    protected static int counter;
    private int value;
    private String name;
    ChainOfResponsibility next;
    private static ChainOfResponsibility first;
    public ChainOfResponsibility(int value, String name) {
        this.value = value;
        this.name = name;
        counter=0;
    }

    public int getValue() {
        return value;
    }
    public ChainOfResponsibility goForward(){
        if (next == null) return first;
        else return next;
    }

    public String findName(int number) {
        if(number!=getValue()) goForward().findName(number);
        else resultName=getName();
        return resultName;
    }

    public String getName() {
        return name;
    }
    public void check2(int guess){
        if (getValue()!=guess){
            counter++;
            goForward().check2(guess);
        }
    }

    public ChainOfResponsibility setNext(ChainOfResponsibility next){
        this.next=next;
        return next;
    }
    public int check(int numberOfRandom, int guess){
        if (numberOfRandom!=getValue()) goForward().check(numberOfRandom, guess);
        else check2(guess);
        return counter;
    }

    public ChainOfResponsibility getFirst() {
        return first;
    }

    public void setFirst(ChainOfResponsibility first) {
        this.first = first;
    }
}
class SCISSOR extends ChainOfResponsibility{

    public SCISSOR() {
        super(0, "SCISSOR");
        if (getFirst() == null) super.setFirst(this);
    }
}
class ROCK extends ChainOfResponsibility{
    public ROCK() {
        super(1, "ROCK");
        if (getFirst() == null) super.setFirst(this);
    }
}
class PAPER extends ChainOfResponsibility{
    public PAPER() {
        super(2, "PAPER");
        if (getFirst() == null) super.setFirst(this);
    }
}
