import java.util.Scanner;

public class SleepTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Sleep Tracker 😴 ---");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        double totalHours = 0;
        int days = 7;
        for (int i = 1; i <= days; i++) {
            System.out.print("Enter sleep hours for Day " + i + ": ");
            double hours = sc.nextDouble();
            totalHours += hours;
        }
        double averageSleep = totalHours / days;

        System.out.println("\n--- Weekly Sleep Report ---");
        System.out.println("Name: " + name);
        System.out.printf("Average Sleep: %.2f hours per day%n", averageSleep);
        if (averageSleep >= 8) {
            System.out.println("😴 Excellent! You’re getting plenty of rest!");
        } else if (averageSleep >= 6) {
            System.out.println("🙂 Not bad, but try sleeping a bit more.");
        } else {
            System.out.println("⚠️ You need more sleep! Prioritize your rest!");
        }
        sc.close();
    }
}
