import java.util.Random;
import java.util.Scanner;

public class DigitalFortuneCookie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] fortunes = {
            "🌟 Great things are coming your way soon!",
            "🍀 Luck favors those who stay consistent.",
            "🌈 You will soon achieve something you’ve been working on.",
            "🔥 Take the risk — the reward will be worth it.",
            "🌻 Someone will appreciate your kindness today.",
            "💡 A small idea of yours might change everything.",
            "🎯 Stay focused — success is closer than it seems.",
            "🌙 Take some rest; your mind needs peace to shine again.",
            "✨ The best version of you is yet to come.",
            "❤️ Happiness will find you when you least expect it."
        };
        System.out.println("🍪 Welcome to the Digital Fortune Cookie!");
        System.out.print("Would you like to open your fortune? (yes/no): ");
        String choice = sc.nextLine().toLowerCase();
        if (choice.equals("yes")) {
            int index = random.nextInt(fortunes.length);
            System.out.println("\n💬 Your Fortune: " + fortunes[index]);
        } else {
            System.out.println("🙂 Maybe next time. Have a great day!");
        }
        sc.close();
    }
}
