import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int choice;
        System.out.println("📝 Welcome to To-Do List Manager!");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter a new task: ");
                    String task = scanner.nextLine();
                    tasks.add(task);
                    System.out.println("✅ Task added!");
                    break;
                case 2:
                    System.out.println("\n📋 Your Tasks:");
                    if (tasks.isEmpty()) {
                        System.out.println("No tasks added yet!");
                    } else {
                        for (int i = 0; i < tasks.size(); i++) {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    if (taskNumber > 0 && taskNumber <= tasks.size()) {
                        System.out.println("❌ Removed: " + tasks.remove(taskNumber - 1));
                    } else {
                        System.out.println("Invalid task number!");
                    }
                    break;
                case 4:
                    System.out.println("👋 Exiting... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        } while (choice != 4);
        scanner.close();
    }
}
