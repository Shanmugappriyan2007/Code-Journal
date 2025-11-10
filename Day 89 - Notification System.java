import java.util.*;

abstract class Notification {
    String recipient;
    String message;

    Notification(String recipient, String message) {
        this.recipient = recipient;
        this.message = message;
    }
    abstract void send(); // abstract method
    void showDetails() {
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + message);
    }
}
class EmailNotification extends Notification {
    EmailNotification(String recipient, String message) {
        super(recipient, message);
    }
    @Override
    void send() {
        System.out.println("📧 Sending Email to " + recipient + "...");
        System.out.println("Email content: " + message);
        System.out.println("✅ Email sent successfully!");
    }
}

class SMSNotification extends Notification {
    SMSNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    void send() {
        System.out.println("📱 Sending SMS to " + recipient + "...");
        System.out.println("SMS content: " + message);
        System.out.println("✅ SMS sent successfully!");
    }
}

class PushNotification extends Notification {
    PushNotification(String recipient, String message) {
        super(recipient, message);
    }

    @Override
    void send() {
        System.out.println("💬 Sending Push Notification to " + recipient + "...");
        System.out.println("Notification content: " + message);
        System.out.println("✅ Push Notification delivered!");
    }
}

public class NotificationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🔔 Welcome to the Notification System");
        System.out.print("Enter recipient name: ");
        String name = sc.nextLine();

        System.out.print("Enter message to send: ");
        String msg = sc.nextLine();

        System.out.println("Choose notification type:");
        System.out.println("1️⃣ Email");
        System.out.println("2️⃣ SMS");
        System.out.println("3️⃣ Push Notification");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Notification notification;
        switch (choice) {
            case 1 -> notification = new EmailNotification(name, msg);
            case 2 -> notification = new SMSNotification(name, msg);
            case 3 -> notification = new PushNotification(name, msg);
            default -> {
                System.out.println("❌ Invalid choice!");
                sc.close();
                return;
            }
        }
        System.out.println("\n🔹 Notification Details:");
        notification.showDetails();
        System.out.println("\n🔹 Sending...");
        notification.send();
        sc.close();
    }
}
