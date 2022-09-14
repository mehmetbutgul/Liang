package Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static String readText(String text) {
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
    public static char readChar(String text) {
        while (true) {
            System.out.println(text);
            try {
                String c = new Scanner(System.in).nextLine();
                if (c.length()!=1) throw new RuntimeException();
                return c.charAt(0);
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
    public static int readInt(String text,int sublimit,int toplimit){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if(number<sublimit||number>toplimit) throw new RuntimeException("number must be between "+sublimit+" and "+toplimit);
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again\r\n"+e.getMessage());
            }
        }
    }
    public static String readNumbers(String str) {
        while (true) {
            System.out.println(str);
            try {
                return new Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
    public static double readDoubleGTZero(String text){
        while (true) {
            System.out.println(text);
            try {
                double number= new Scanner(System.in).nextDouble();
                if(number<=0) throw new RuntimeException("number must be greater than 0");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
    public static int readInt(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
    public static long readLongGTZero(String text){
        while (true) {
            System.out.println(text);
            try {
                long number= new Scanner(System.in).nextLong();
                if(number<=0) throw new RuntimeException("number must be greater than 0");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
    public static int readIntGTZero(String text){
        while (true) {
            System.out.println(text);
            try {
                int number= new Scanner(System.in).nextInt();
                if(number<=0) throw new RuntimeException("number must be greater than 0");
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
    public static double readDouble(String text){
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextDouble();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again ");
            }
        }
    }
    public static double readDouble(String text,int sublimit,int toplimit){
        while (true) {
            System.out.println(text);
            try {
                double number= new Scanner(System.in).nextDouble();
                if(number<sublimit||number>toplimit) throw new RuntimeException("number must be between "+sublimit+" and "+toplimit);
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again \r\n"+e.getMessage());
            }
        }
    }
}
