package Assignment1.Q9;

public class FactorialClass {
    static int factorial(int n){
        if (n==0)
            return 1;
        else return (n*factorial(n-1));
    }
}
