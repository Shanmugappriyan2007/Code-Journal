import java.util.*;

public class FocusTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int completedSessions = 0;
        System.out.println("⏱️  Welcome to the Command-Line Focus Timer");
        System.out.println("This app helps you focus using the Pomodoro technique (25 min focus, 5 min break).");

        while (true) {
            System.out.println("\n1️⃣ Start Focus Session");
            System.out.println("2️⃣ View Completed Sessions");
            System.out.println("3️⃣ Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("\n🚀 Focus session started. Stay productive for 25 minutes!");
                    countdown(5); // simulate shorter time for demo
                    System.out.println("\n✅ Session complete! Take a 5-minute break.");
                    countdown(2); // simulate break
                    completedSessions++;
                    System.out.println("👏 Great job! You've finished " + completedSessions + " focus session(s).");
                }
                case 2 -> System.out.println("📊 Total sessions completed: " + completedSessions);
                case 3 -> {
                    System.out.println("👋 Stay consistent. Productivity is built, not found.");
                    sc.close();
                    return;
                }
                default -> System.out.println("⚠️ Invalid choice, try again!");
            }
        }
    }
    static void countdown(int seconds) {
        try {
            for (int i = seconds; i > 0; i--) {
                System.out.print("⏳ " + i + " seconds remaining...\r");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Timer interrupted!");
        }
    }
}
