import java.util.Scanner;

public class PasswordStrengthAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔐 Welcome to Password Strength Analyzer!");
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        int score = 0;
        if (password.length() >= 8) score += 2;
        else if (password.length() >= 5) score += 1;

        if (password.matches(".*[A-Z].*")) score += 2;
        if (password.matches(".*[a-z].*")) score += 2;
        if (password.matches(".*[0-9].*")) score += 2;
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) score += 2;
        System.out.println("\nAnalyzing your password...\n");

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
        System.out.println("Password Score: " + score + "/10");
        if (score <= 3)
            System.out.println("⚠️ Weak Password — Try adding numbers, symbols, and uppercase letters.");
        else if (score <= 6)
            System.out.println("🛠️ Medium Strength — Good start, but could be stronger.");
        else if (score <= 8)
            System.out.println("✅ Strong Password — Nice job!");
        else
            System.out.println("💪 Excellent! Your password is very strong.");

        sc.close();
    }
}
