/* (Find the two highest scores)
Write a program that prompts the user to enter the number of students and each student’s name and score,
and finally displays the student with the highest score and the student with the second-highest score. */
package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class V5_9 {
    public static void main(String[] args) {
        int numberOfStudents=readNumber("Enter number of students",1,1000);
        List<Student> students=new ArrayList<>(numberOfStudents);
        for (int i=1;i<=numberOfStudents;i++){
            students.add(new Student(readText("Enter student's name"),readNumber("Enter student's score",0,100)));
        }
        students.stream().sorted().limit(2).forEach(System.out::println);
    }
    private static int readNumber(String text,int sublimit,int toplimit) {
        while (true) {
            System.out.println(text);
            try {
                int number = new Scanner(System.in).nextInt();
                if (number < sublimit || number > toplimit)
                    throw new RuntimeException("number must be between " + sublimit + " and " + toplimit);
                else return number;
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }
    private static String readText(String text) {
        while (true) {
            System.out.println(text);
            try {
                return new Scanner(System.in).nextLine();
            } catch (Exception e) {
                System.err.println("Error!\r\nPlease try again "+e.getMessage());
            }
        }
    }

}
class Student implements Comparable<Student>{
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        return (int)(o.getScore()-this.score);
    }

    @Override
    public String toString() {
        return "Name :" +this.name+" Score : "+this.score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
