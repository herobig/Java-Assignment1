package Assignment1.Q7;

public class GradingClass {
    static void checkGrade(int marks){
        if(marks > 80){
            System.out.println("A");
        }
        else if(marks>60 && marks <=80){
            System.out.println("B");
        }
        else if (marks >50 && marks <=60 ) {
            System.out.println("C");
        }
        else if (marks >45 && marks <=50 ) {
            System.out.println("D");
        }
        else if (marks >25 && marks <=45 ) {
            System.out.println("E");
        }
        else if (marks >0 && marks <=25 ) {
            System.out.println("C");
        }
        else {
            System.out.println("Enter the marks in range of 100");
        }
    }
}
