import java.util.Scanner;

public class StudentGradeAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        String[] subjects = new String[n];
        int[] marks = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter subject name: ");
            subjects[i] = sc.next();
            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }
        double average = total / (double)n;
        System.out.println("\n----- Grade Report -----");
        for (int i = 0; i < n; i++) {
            System.out.println(subjects[i] + " : " + marks[i]);
        }
        System.out.println("------------------------");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        char grade;
        String remark;
        if (average >= 90) {
            grade = 'A';
            remark = "Excellent 🌟";
        } else if (average >= 75) {
            grade = 'B';
            remark = "Good 👍";
        } else if (average >= 60) {
            grade = 'C';
            remark = "Satisfactory ✅";
        } else if (average >= 40) {
            grade = 'D';
            remark = "Needs Improvement ⚠️";
        } else {
            grade = 'F';
            remark = "Failed ❌";
        }
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remark);
        sc.close();
    }
}
