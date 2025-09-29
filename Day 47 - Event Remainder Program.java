import java.util.Scanner;

public class EventReminder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter event name: ");
        String event = sc.nextLine();
        System.out.print("Enter event date (DD/MM/YYYY): ");
        String date = sc.nextLine();
        System.out.print("Enter event time (HH:MM): ");
        String time = sc.nextLine();

        System.out.println("\n--- Event Reminder ---");
        System.out.println("📌 Event: " + event);
        System.out.println("📅 Date : " + date);
        System.out.println("⏰ Time : " + time);
        System.out.println("✅ Don't forget your event!");        
        sc.close();
    }
}
