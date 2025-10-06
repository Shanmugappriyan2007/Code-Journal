import java.util.Scanner;

public class HabitTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your habit name: ");
        String habit = sc.nextLine();

        System.out.print("Enter number of days to track: ");
        int days = sc.nextInt();

        boolean[] completed = new boolean[days];
        int totalCompleted = 0;
        for (int i = 0; i < days; i++) {
            System.out.print("Day " + (i + 1) + ": Did you complete your habit? (yes/no): ");
            String answer = sc.next();
            if (answer.equalsIgnoreCase("yes")) {
                completed[i] = true;
                totalCompleted++;
            } else {
                completed[i] = false;
            }
        }
        double progress = ((double) totalCompleted / days) * 100;
        System.out.println("\n--- Habit Tracker Summary ---");
        System.out.println("Habit: " + habit);
        System.out.println("Days Tracked: " + days);
        System.out.println("Days Completed: " + totalCompleted);
        System.out.printf("Progress: %.2f%%\n", progress);
        if (progress == 100) {
            System.out.println("🏆 Excellent consistency! Keep it up!");
        } else if (progress >= 75) {
            System.out.println("👏 Great job! You’re building a strong habit!");
        } else if (progress >= 50) {
            System.out.println("💪 Good start! Stay focused!");
        } else {
            System.out.println("⚡ Keep trying — small steps every day!");
        }
        sc.close();
    }
}
