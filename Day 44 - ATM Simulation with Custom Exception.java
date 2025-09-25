import java.util.Scanner;

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
public class ATMSimulator {
    private static double balance = 5000;

    public static void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Withdrawal failed! Insufficient funds.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
    public static void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! Current balance: " + balance);
    }
    public static void checkBalance() {
        System.out.println("Current balance: " + balance);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            try {
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        deposit(depositAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        withdraw(withdrawAmount);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM!");
                        break;
                    default:
                        System.out.println("Invalid choice! Try again.");
                }
            } catch (InsufficientFundsException e) {
                System.out.println("Exception: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error: Invalid input!");
                scanner.nextLine(); // clear buffer
            }
        } while (choice != 4);
        scanner.close();
    }
}
