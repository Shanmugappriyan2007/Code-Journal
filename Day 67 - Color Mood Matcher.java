import java.util.Scanner;

public class ColorMoodMatcher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🎨 Welcome to the Color Mood Matcher!");
        System.out.print("Enter your favorite color: ");
        String color = sc.nextLine().toLowerCase();
        String mood;
        switch (color) {
            case "red":
                mood = "❤️ You are bold, passionate, and full of energy!";
                break;
            case "blue":
                mood = "💙 You are calm, trustworthy, and value peace.";
                break;
            case "green":
                mood = "💚 You are balanced, nature-loving, and kind-hearted.";
                break;
            case "yellow":
                mood = "💛 You are cheerful, optimistic, and full of joy!";
                break;
            case "black":
                mood = "🖤 You are strong, mysterious, and independent.";
                break;
            case "white":
                mood = "🤍 You are pure, honest, and peaceful.";
                break;
            case "purple":
                mood = "💜 You are creative, wise, and imaginative.";
                break;
            case "orange":
                mood = "🧡 You are energetic, adventurous, and social.";
                break;
            case "pink":
                mood = "💖 You are loving, caring, and compassionate.";
                break;
            default:
                mood = "✨ That’s a rare color choice! You have a unique personality!";
        }
        System.out.println("\nYour mood description: " + mood);
        System.out.println("🌈 Keep shining your true colors!");
        sc.close();
    }
}
