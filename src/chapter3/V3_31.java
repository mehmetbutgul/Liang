
/*
(Financials: currency exchange)
Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Chinese RMB.
Prompt the user to enter 0 to convert from U.S. dollars to Chinese RMB and 1 to convert from Chinese RMB and U.S. dollars.
 Prompt the user to enter the amount in U.S. dollars or Chinese RMB to convert it to Chinese RMB or U.S. dollars, respectively.
* */
package chapter3;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class V3_31 {
    public static void main(String[] args) {
        try {
            double currency = readNumber("Enter the exchange rate from dollars to RMB:");
            double converter = readNumber("Enter 0 to convert dollars to RMB and 1 vice versa:");
            double amountOfDollar = readNumber("Enter the "+(converter==0?"dollar":"RMB")+" amount:");
            CurrencyCenter.getInstance().add(0, (x, y) -> x * y).add(1, (left, right) -> left / right);
            double amount = CurrencyCenter.getInstance().execute((int) converter, amountOfDollar, currency);
            if (converter==0)System.out.println("$"+amountOfDollar+" is "+amount+" yuan");
            else System.out.println(amountOfDollar+" yuan is $"+amount);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                double weight=Double.parseDouble(new Scanner(System.in).next());
                if (weight<0) throw new RuntimeException();
                return weight;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
}
class CurrencyCenter{
    private static CurrencyCenter currencyCenter;
    private final Map<Integer, DoubleBinaryOperator> map=new HashMap<>();
    private CurrencyCenter(){

    }
    public CurrencyCenter add(int choice,DoubleBinaryOperator operator){
        map.putIfAbsent(choice,operator);
        return this;
    }

    public static CurrencyCenter getInstance() {
        if (currencyCenter == null) {
            synchronized (CurrencyCenter.class){
                if (currencyCenter == null) {
                    currencyCenter=new CurrencyCenter();
                }
            }
        }
        return currencyCenter;
    }
    public double execute(int choice,double amount,double currency){
        return Optional.ofNullable(map.get(choice)).orElseThrow(()->new RuntimeException("No such a operator")).applyAsDouble(amount,currency);
    }
}
