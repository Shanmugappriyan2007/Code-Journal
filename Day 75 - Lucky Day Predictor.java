import java.util.*;

public class LuckyDayPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("🔮 Welcome to the Lucky Day Predictor!");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your birth date (1-31): ");
        int birthDate = sc.nextInt();

        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] messages = {
            "🌞 A bright opportunity will shine your way!",
            "💡 Today’s the perfect day to start something new.",
            "🔥 You’ll feel unstoppable — believe in your energy!",
            "🌈 Something beautiful will surprise you soon.",
            "💬 A small conversation might change your mood completely.",
            "💎 You’ll find clarity in something that’s been confusing.",
            "🎉 Expect something good before the day ends!"
        };
        int luckyIndex = (birthDate + name.length() + rand.nextInt(7)) % 7;
        System.out.println("\n✨ Calculating your lucky day...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Oops! The stars are taking too long to align!");
        }
        System.out.println("\n💫 Hey " + name + ", your lucky day is: " + days[luckyIndex]);
        System.out.println(messages[luckyIndex]);
        System.out.println("\n🌟 Tip: Make that day special every week!");       
        sc.close();
    }
}
