package Assignment1.Q6;

public class DiscountClass {
    static float total;
    public static float discountFunction(int quantity){

        if (quantity >= 10){
            float totalAmount = (quantity * 100);
            total = totalAmount - (totalAmount * 10/100);
        }
        else total = quantity * 100;
        return total;
    }
}
