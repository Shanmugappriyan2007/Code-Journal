import java.util.Scanner;
public class GoalProgressTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Goal Progress Tracker 🎯 ---");
        System.out.print("Enter your goal name: ");
        String goal = sc.nextLine();
        System.out.print("Enter your total goal target (e.g., pages to read, km to run, etc.): ");
        double target = sc.nextDouble();
        System.out.print("Enter progress achieved so far: ");
        double progress = sc.nextDouble();
        if (progress > target) {
            System.out.println("⚠️ Progress cannot exceed your target!");
        } else {
            double percent = (progress / target) * 100;
            System.out.printf("\nGoal: %s%n", goal);
            System.out.printf("Progress: %.2f / %.2f (%.2f%%)%n", progress, target, percent);
            if (percent >= 100) {
                System.out.println("🎉 Congratulations! You’ve achieved your goal!");
            } else if (percent >= 75) {
                System.out.println("💪 Almost there! Keep pushing!");
            } else if (percent >= 50) {
                System.out.println("🙂 Good progress! Stay consistent!");
            } else {
                System.out.println("🚀 You’ve started well, keep going strong!");
            }
        }
        sc.close();
    }
}
