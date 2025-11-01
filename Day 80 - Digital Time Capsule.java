import java.util.*;

public class DigitalTimeCapsule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = "";
        int unlockYear = 0;
        boolean sealed = false;

        System.out.println("⏳ Welcome to the Digital Time Capsule ⏳");

        while (true) {
            System.out.println("\n1️⃣ Create a New Time Capsule");
            System.out.println("2️⃣ Try to Open the Capsule");
            System.out.println("3️⃣ Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("📜 Write a message to your future self: ");
                    message = sc.nextLine();
                    System.out.print("📅 Enter the year to unlock (e.g., 2030): ");
                    unlockYear = sc.nextInt();
                    sc.nextLine();
                    sealed = true;
                    System.out.println("🔒 Your message has been sealed until " + unlockYear + "!");
                    break;
                case 2:
                    if (!sealed) {
                        System.out.println("⚠️ You haven’t created any time capsule yet!");
                        break;
                    }
                    System.out.print("Enter the current year: ");
                    int currentYear = sc.nextInt();
                    sc.nextLine();
                    if (currentYear >= unlockYear) {
                        System.out.println("\n📬 Opening your Time Capsule...");
                        System.out.println("💌 Your Message: " + message);
                        System.out.println("✨ Hope you've become who you wanted to be!");
                        sealed = false; // reset after opening
                    } else {
                        System.out.println("🚫 It’s too early! Come back in " + (unlockYear - currentYear) + " year(s).");
                    }
                    break;
                case 3:
                    System.out.println("👋 Goodbye, future dreamer!");
                    sc.close();
                    return;
                default:
                    System.out.println("❌ Invalid choice, try again!");
            }
        }
    }
}
