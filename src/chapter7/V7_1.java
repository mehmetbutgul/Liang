/**7.1 (Assign grades) Write a program that reads student scores, gets the best score,
 and then assigns grades based on the following scheme:
 Grade is A if score is Ú best - 10
 Grade is B if score is Ú best - 20;
 Grade is C if score is Ú best - 30;
 Grade is D if score is Ú best - 40;
 Grade is F otherwise.
 The program prompts the user to enter the total number of students, then prompts
 the user to enter all of the scores, and concludes by displaying the grades.*/
package chapter7;

import Util.Reader;

import java.util.stream.IntStream;

public class V7_1 {
    public static void main(String[] args) {
        int numberOfStudents= Reader.readIntGTZero("Enter the number of students:");
        int [] scores=new int[numberOfStudents];
        readScores(scores);
        displayScoreAndGrade(scores);
    }
    private static void readScores(int [] scores){
        for (int i = 0; i < scores.length; i++) {
            scores[i]=Reader.readInt("Enter "+(i+1)+". student score:",0,100);
        }
    }
    private static void displayScoreAndGrade(int[] scores){
        int best= IntStream.of(scores).max().getAsInt();
        for (int i = 0; i < scores.length; i++) {
            System.out.print("Student "+(i+1)+" score is "+scores[i]+" and grade is ");
            if (scores[i]>=best-10) System.out.println("A");
            else if (scores[i]>=best-20) System.out.println("B");
            else if (scores[i]>=best-30) System.out.println("C");
            else if (scores[i]>=best-40) System.out.println("D");
            else System.out.println("F");
        }
    }
}
