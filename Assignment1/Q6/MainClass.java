package Assignment1.Q6;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quantity: ");
        int q = sc.nextInt();
        System.out.println("Total cost: " + DiscountClass.discountFunction(q));
    }
}
