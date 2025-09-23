import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
public class AgeValidator {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("❌ Age must be 18 or above to register!");
        } else {
            System.out.println("✅ Registration successful. Age is valid.");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("⚠️ Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("⚠️ General Error: " + e.getMessage());
        } finally {
            System.out.println("👋 Program finished.");
            scanner.close();
        }
    }
}
