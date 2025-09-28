import java.util.Scanner;

public class ReportCardGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of subjects: ");
        int subjects = scanner.nextInt();

        int[] marks = new int[subjects];
        int total = 0;
        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
            total += marks[i];
        }
        double average = (double) total / subjects;
        double percentage = ((double) total / (subjects * 100)) * 100;

        char grade;
        if (percentage >= 90) grade = 'A';
        else if (percentage >= 75) grade = 'B';
        else if (percentage >= 50) grade = 'C';
        else grade = 'F';
        System.out.println("\n--- Student Report Card ---");
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + total + "/" + (subjects * 100));
        System.out.println("Average: " + average);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}
