import java.util.*;

abstract class Payment {
    double amount;

    Payment(double amount) {
        this.amount = amount;
    }

    abstract void processPayment();
    abstract void showPaymentDetails();

    void paymentSuccess() {
        System.out.println("✅ Payment of ₹" + amount + " completed successfully!");
    }
}

class CreditCardPayment extends Payment {
    String cardNumber;

    CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        System.out.println("💳 Processing credit card payment...");
        System.out.println("Verifying card number ****" + cardNumber.substring(cardNumber.length() - 4));
        paymentSuccess();
    }

    @Override
    void showPaymentDetails() {
        System.out.println("Payment Type: Credit Card");
        System.out.println("Card Number: ****" + cardNumber.substring(cardNumber.length() - 4));
        System.out.println("Amount: ₹" + amount);
    }
}

class UPIPayment extends Payment {
    String upiId;

    UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        System.out.println("📱 Processing UPI payment via " + upiId + "...");
        System.out.println("Authenticating...");
        paymentSuccess();
    }

    @Override
    void showPaymentDetails() {
        System.out.println("Payment Type: UPI");
        System.out.println("UPI ID: " + upiId);
        System.out.println("Amount: ₹" + amount);
    }
}

public class OnlinePaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("💳 Welcome to the Online Payment System");

        System.out.print("Enter payment amount: ₹");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Choose payment method:");
        System.out.println("1️⃣ Credit Card");
        System.out.println("2️⃣ UPI");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        Payment payment;
        switch (choice) {
            case 1 -> {
                System.out.print("Enter your credit card number: ");
                String card = sc.nextLine();
                payment = new CreditCardPayment(amount, card);
            }
            case 2 -> {
                System.out.print("Enter your UPI ID: ");
                String upi = sc.nextLine();
                payment = new UPIPayment(amount, upi);
            }
            default -> {
                System.out.println("❌ Invalid choice!");
                sc.close();
                return;
            }
        }

        System.out.println("\n🔹 Payment Details:");
        payment.showPaymentDetails();

        System.out.println("\n🔹 Processing...");
        payment.processPayment();
        sc.close();
    }
}
