/*(Convert milliseconds to hours, minutes, and seconds) Write a method that converts
milliseconds to hours, minutes, and seconds using the following header:
public static String convertMillis(long millis)
The method returns a string as hours:minutes:seconds. For example,
convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.*/
package chapter6;

public class V6_25 {
    public static void main(String[] args) {
        long millis=555550000;
        System.out.println(convertMillis(millis));
    }
    public static String convertMillis(long millis){
        int hour=0,minute=0,second=0;
        hour= (int) (millis/(60*60*1000));
        millis-=hour*60*60*1000;
        minute=(int) (millis/(60*1000));
        millis-=minute*60*1000;
        second=(int) (millis/1000);
        return hour+":"+minute+":"+second;
    }
}
