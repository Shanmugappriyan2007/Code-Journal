import java.util.Scanner;

public class SquareRootCalculator {
    static double calculateSquareRoot(int number) throws Exception {
        if (number < 0) {
            throw new Exception("❌ Cannot calculate square root of a negative number!");
        }
        return Math.sqrt(number);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            double result = calculateSquareRoot(num);
            System.out.println("✅ Square root of " + num + " is: " + result);
        } catch (Exception e) {
            System.out.println("⚠️ Exception: " + e.getMessage());
        } finally {
            System.out.println("👋 Program finished.");
            scanner.close();
        }
    }
}
