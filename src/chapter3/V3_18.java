/*
     (Cost of shipping)
     A shipping company uses the following function to calculate the cost (in dollars) of shipping based on the weight of the package (in pounds).
      c(w) =d3.5, if 0 6 w 6= 1
            5.5, if 1 6 w 6= 3
            8.5, if 3 6 w 6= 10
            10.5, if 10 6 w 6= 20
     Write a program that prompts the user to enter the weight of the package and display the shipping cost.
     If the weight is greater than 50, display a message “the package cannot be shipped.”
 */
package chapter3;
import java.util.*;

public class V3_18 {
    public static void main(String[] args) {
        double weight=readNumber("Enter your package weight");
        double money=calculate(weight);
        if (money<0) System.out.println("the package cannot be shipped.");
        else System.out.println("The shipping cost is "+money);
    }
    private static double readNumber(String text){
        while (true) {
            System.out.println(text);
            try {
                double weight=Double.parseDouble(new Scanner(System.in).next());
                if (weight<=0) throw new RuntimeException();
                return weight;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
    private static double calculate(double weight){
        if (weight>50) return -1;
        Deque<Tariff> tariffs=getTariffs();
        double total=0;
        while (weight>=tariffs.peek().getToplimit()){
            weight-=tariffs.peek().getToplimit();
            total+=tariffs.peek().getMoney();
        }
        while (weight>0){
            Tariff tariff=tariffs.pop();
            if (weight>tariff.getSublimit() && weight<=tariff.getToplimit()){
                total+=tariff.getMoney();
                weight-=tariff.getToplimit();
            }
        }
        return total;
    }
    private static Deque<Tariff> getTariffs(){
        Deque<Tariff> tariffs=new ArrayDeque<>(4);
        tariffs.push(new Tariff(0,1,3.5));
        tariffs.push(new Tariff(1,3,5.5));
        tariffs.push(new Tariff(3,10,8.5));
        tariffs.push(new Tariff(10,20,10.5));
        return tariffs;
    }
}
class Tariff implements Comparable<Tariff>{
    private double sublimit;
    private double toplimit;
    private double money;

    @Override
    public int compareTo(Tariff o) {
        if (this.money>o.getMoney()) return 1;
        else if (this.money<o.getMoney()) return -1;
        else return 0;
    }

    public Tariff(double sublimit, double toplimit, double money) {
        this.sublimit = sublimit;
        this.toplimit = toplimit;
        this.money = money;
    }

    public double getSublimit() {
        return sublimit;
    }

    public void setSublimit(double sublimit) {
        this.sublimit = sublimit;
    }

    public double getToplimit() {
        return toplimit;
    }

    public void setToplimit(double toplimit) {
        this.toplimit = toplimit;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}