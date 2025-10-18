import java.util.Scanner;

public class SecretCodeEncryptor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔐 Welcome to Secret Code Encryptor!");
        System.out.print("Enter a message to encrypt: ");
        String message = sc.nextLine();
        System.out.print("Enter shift key (1–25): ");
        int key = sc.nextInt();
        String encrypted = encryptMessage(message, key);
        System.out.println("\n🔒 Encrypted Message: " + encrypted);
        sc.close();
    }
    public static String encryptMessage(String text, int key) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                char base = Character.isLowerCase(ch) ? 'a' : 'A';
                ch = (char) ((ch - base + key) % 26 + base);
            }
            result.append(ch);
        }
        return result.toString();
    }
}
