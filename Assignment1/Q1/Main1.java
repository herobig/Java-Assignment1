package Assignment1.Q1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Enter the length of rectangle:");
        int length = new Scanner(System.in).nextInt();
        System.out.println("Enter the breadth of rectangle:");
        int breadth = new Scanner(System.in).nextInt();
        Rectangle rectangleA = new Rectangle();
        rectangleA.calculateArea(length,breadth);
    }
}
