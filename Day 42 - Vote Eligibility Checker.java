import java.util.Scanner;

public class VoteEligibility {
    static void checkEligibility(int age) {
        if (age < 18) {
            throw new ArithmeticException("❌ Not eligible to vote. Age must be 18 or above.");
        } else {
            System.out.println("✅ You are eligible to vote!");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkEligibility(age);
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        } finally {
            System.out.println("👋 Program finished.");
            scanner.close();
        }
    }
}
