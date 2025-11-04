import java.util.*;

public class FuturePredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🔮 Welcome to the FUTURE PREDICTOR 🔮");
        System.out.print("\nEnter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your favorite number: ");
        int favNum = sc.nextInt();

        // Calculate a seed based on name characters and number
        int sum = 0;
        for (char c : name.toCharArray()) {
            sum += c;
        }
        int predictionIndex = (sum + favNum + random.nextInt(50)) % 7;
        String[] predictions = {
            "🌈 You will achieve something great this year!",
            "💖 Love and happiness are on their way to you.",
            "💰 Financial success is waiting for you — stay focused.",
            "🌍 You’ll travel to a new place that changes your perspective.",
            "⚡ A surprising opportunity will knock soon — be ready!",
            "🌻 Inner peace and confidence will guide you to success.",
            "🎯 A dream you had long ago will start becoming reality."
        };
        System.out.println("\n✨ Calculating your destiny...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("\n🔮 Prediction for " + name + ":");
        System.out.println(predictions[predictionIndex]);
        System.out.println("\n🧠 Tip: Your actions decide your real future — make it count!");
        sc.close();
    }
}
