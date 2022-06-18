package Assignment1.Q5;

import java.util.Scanner;

public class JavaProgram {
    public static void printFunction() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name1 = sc.nextLine();
        System.out.println("Enter Roll number: ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter field of interest: ");
        String field1 = sc.nextLine();


        System.out.println("Hey, my name is " + name1 + " and my roll number is " + rollno + ". My field of interest are " + field1 +".");
    }

}
