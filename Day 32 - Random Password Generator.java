import java.util.Random;
import java.util.Scanner;
public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        String digits = "0123456789";
        String symbols = "!@#$%^&*()-_=+<>?";
        String allChars = upper + lower + digits + symbols;

        System.out.print("Enter desired password length: ");
        int length = scanner.nextInt();
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allChars.length());
            password.append(allChars.charAt(index));
        }
        System.out.println("Generated Password: " + password.toString());
        scanner.close();
    }
}
