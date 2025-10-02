import java.util.Scanner;

public class AttendanceTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        String[] names = new String[n];
        int[] totalClasses = new int[n];
        int[] attendedClasses = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            names[i] = sc.nextLine();
            System.out.print("Enter total classes held for " + names[i] + ": ");
            totalClasses[i] = sc.nextInt();
            System.out.print("Enter classes attended by " + names[i] + ": ");
            attendedClasses[i] = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("\n--- Attendance Report ---");
        for (int i = 0; i < n; i++) {
            double percentage = ((double) attendedClasses[i] / totalClasses[i]) * 100;
            System.out.printf("%s: %.2f%% attendance\n", names[i], percentage);
        }
        sc.close();
    }
}
