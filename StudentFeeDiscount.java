import java.util.Scanner;

public class StudentFeeDiscount {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        // Take fee input
        System.out.print("Enter student fee: ");
        double fee = input.nextDouble();

        // Take discount percent input
        System.out.print("Enter discount percent: ");
        double discountPercent = input.nextDouble();

        // Calculate discount amount
        double discount = (fee * discountPercent) / 100;

        // Calculate final fee
        double finalFee = fee - discount;

        // Output
        System.out.println("The discount amount is INR " + discount +
                           " and final discounted fee is INR " + finalFee);
    }
}