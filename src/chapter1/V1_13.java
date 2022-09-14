package chapter1;
//Algebra  2x2 linear equations
/*
    ) You can use Cramer’s rule to solve the following 2 * 2 system of linear equation:
    ax + by = e
    cx + dy = f
    x = ed - bf ad - bc
    y = af - ec ad - bc
    Write a program that solves the following equation and displays the value for x and y:
     3.4x + 50.2y = 44.5 2.1x + .55y = 5.9
 */

public class V1_13 {
    public static void main(String[] args) {
        String equation1= "3.4x + 50.2y = 44.5"; // ax+by=e
        String equation2= "2.1x + 55y = 5.9";    // cx+dy=f
        Numbers numbers= new Numbers(equation1,equation2);
        double denominator=calculate(numbers.getA(),numbers.getB(),numbers.getC(),numbers.getD());
        double x=(numbers.getE()*numbers.getD()-numbers.getB()*numbers.getF())/denominator; //x=(e*d-b*f)/(a*d-b*c)
        double y=(numbers.getA()*numbers.getF()-numbers.getE()*numbers.getC())/denominator; //y=(a*f-e*c)/(a*d-b*c)
        System.out.println(" x= "+x+"\r\n y= "+y);
    }
    private static double calculate(double a, double b, double c, double d){
        return (a*d-b*c);
    }

}
