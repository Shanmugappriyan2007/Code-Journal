import java.util.*;

public class AINicknameGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("🤖 Welcome to the AI Nickname Generator!");
        System.out.print("\nEnter your full name: ");
        String name = sc.nextLine();

        System.out.print("Describe yourself in one word (e.g., brave, smart, creative): ");
        String trait = sc.nextLine().trim().toLowerCase();
        // Lists of creative word parts
        String[] prefixes = {"Cyber", "Neo", "Ultra", "Quantum", "Crimson", "Silent", "Alpha", "Shadow", "Mystic"};
        String[] suffixes = {"Nova", "Storm", "Mind", "Rider", "Blaze", "Knight", "Pulse", "Wave", "Phantom"};
        String[] titles = {"The Visionary", "The Maverick", "The Dreamer", "The Rebel", "The Creator", "The Coder", "The Enigma"};

        String firstName = name.split(" ")[0];
        String prefix = prefixes[random.nextInt(prefixes.length)];
        String suffix = suffixes[random.nextInt(suffixes.length)];
        String title = titles[random.nextInt(titles.length)];

        String aiName = prefix + suffix;
        System.out.println("\n✨ Generating your AI identity...");
        try { Thread.sleep(2000); } catch (InterruptedException e) {}
        System.out.println("\n🧠 Original Name: " + name);
        System.out.println("💎 Personality Trait: " + trait);
        System.out.println("🚀 Your AI Nickname: " + aiName + " " + firstName);
        System.out.println("🏆 Title: " + title);
        System.out.println("\n🔥 Keep evolving, " + aiName + "! The future belongs to the bold.");
        sc.close();
    }
}
