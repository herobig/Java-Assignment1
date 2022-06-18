package Assignment1.Q7;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int a = sc.nextInt();
        GradingClass.checkGrade(a);
    }
}
