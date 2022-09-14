/*
     (Game: pick a card)
     Write a program that simulates picking a card from a deck of 52 cards.
     Your program should display the suit (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen, King)
     and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 */
package chapter2;
import java.util.Random;

public class V3_24 {
    public static void main(String[] args) {
        Random random=new Random();
        int rankRandom=random.nextInt(1,14);
        int suitRandom=random.nextInt(1,5);
        System.out.println("The card you picked is "+Rank.of(rankRandom).toString()+" of "+Suit.of(suitRandom));
    }
}
enum Rank{
    Ace,Two,Three,Four,Five,Six,Seven,Eight,Nine,Ten,Jack,Queen,King;
    private static final Rank[] ENUMS = Rank.values();
    public static Rank of(int suit) {
        if (suit < 1 || suit > 13) {
            throw new IllegalArgumentException("Invalid value for Rank: " + suit);
        }
        return ENUMS[suit - 1];
    }
    public int getValue() {
        return ordinal() + 1;
    }
    @Override public String toString(){
        return switch (this){
            case Ace,Jack,Queen,King ->super.toString();
            default -> String.valueOf(getValue());
        };
    }
}
enum Suit{
    Clubs,Diamonds,Hearts,Spades;
    private static final Suit[] ENUMS = Suit.values();
    public static Suit of(int suit) {
        if (suit < 1 || suit > 4) {
            throw new IllegalArgumentException("Invalid value for Suit: " + suit);
        }
        return ENUMS[suit - 1];
    }
    public int getValue() {
        return ordinal() + 1;
    }

}

