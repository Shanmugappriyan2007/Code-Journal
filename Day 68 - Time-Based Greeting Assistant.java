import java.time.LocalTime;

public class TimeBasedGreeting {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        System.out.println("🕓 Current time: " + currentTime);
        if (hour >= 5 && hour < 12) {
            System.out.println("🌞 Good Morning! Have a fresh start to your day!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("☀️ Good Afternoon! Keep going strong!");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("🌇 Good Evening! Hope your day went well!");
        } else {
            System.out.println("🌙 Good Night! Time to rest and recharge!");
        }
    }
}
