import java.util.Scanner;

public class BillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("💰 Simple Bill Calculator");

        System.out.print("Enter the total amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter discount percentage: ");
        double discount = scanner.nextDouble();
        System.out.print("Enter tax percentage: ");
        double tax = scanner.nextDouble();
        double discountedAmount = amount - (amount * discount / 100);
        double finalAmount = discountedAmount + (discountedAmount * tax / 100);

        System.out.println("Amount after discount: " + discountedAmount);
        System.out.println("Final amount after tax: " + finalAmount);
        scanner.close();
    }
}
