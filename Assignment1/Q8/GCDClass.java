package Assignment1.Q8;

public class GCDClass {
    static int gcd(int a, int b){
        if(a ==0)
            return b;
        else if(b==0)
            return a;
        else if(a==b){
            return a;
        }
        else if (a>b) {
            return gcd(a-b,b);
        }
        return gcd(a,b-a);
    }
}
