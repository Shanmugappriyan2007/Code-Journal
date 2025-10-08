import java.util.Scanner;

public class StudySessionTimer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Study Session Timer ---");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        int totalMinutes = 0;
        String choice;
        do {
            System.out.print("\nEnter study session duration in minutes: ");
            int minutes = sc.nextInt();
            totalMinutes += minutes;

            sc.nextLine(); // clear buffer
            System.out.print("Do you want to add another session? (yes/no): ");
            choice = sc.nextLine().toLowerCase();

        } while (choice.equals("yes"));
        int hours = totalMinutes / 60;
        int remainingMinutes = totalMinutes % 60;

        System.out.println("\n--- Study Summary ---");
        System.out.println("Name: " + name);
        System.out.println("Total Study Time: " + totalMinutes + " minutes");
        System.out.println("That’s approximately " + hours + " hour(s) and " + remainingMinutes + " minute(s)!");
        if (totalMinutes >= 300) {
            System.out.println("💪 Excellent dedication! Keep it up!");
        } else if (totalMinutes >= 120) {
            System.out.println("👍 Good job! You’re staying consistent!");
        } else {
            System.out.println("📚 Try studying a bit longer tomorrow!");
        }
        sc.close();
    }
}
