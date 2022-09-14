package chapter1;

import java.util.StringTokenizer;

public class Numbers {
    private double a,b,c,d,e,f;
    public Numbers(String equation1, String equation2) {
        StringTokenizer tokenizer= new StringTokenizer(equation1,"+=");
        while (tokenizer.hasMoreTokens()){
            String token=tokenizer.nextToken();
            if(token.contains("x")) a=Double.parseDouble(token.replaceAll("x","").trim());
            else if(token.contains("y")) b=Double.parseDouble(token.replaceAll("y","").trim());
            else e=Double.parseDouble(token.trim());
        }
        StringTokenizer tokenizer2= new StringTokenizer(equation2,"+=");
        while (tokenizer2.hasMoreTokens()){
            String token=tokenizer2.nextToken();
            if(token.contains("x")) c=Double.parseDouble(token.replaceAll("x","").trim());
            else if(token.contains("y")) d=Double.parseDouble(token.replaceAll("y","").trim());
            else f=Double.parseDouble(token.trim());
        }
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getD() {
        return d;
    }
    public double getE() {
        return e;
    }
    public double getF() {
        return f;
    }
}
