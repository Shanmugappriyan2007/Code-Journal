import java.util.Scanner;

public class DreamMeaningAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🌙 Welcome to the Dream Meaning Analyzer!");
        System.out.print("Enter one main symbol or object from your dream: ");
        String dream = sc.nextLine().toLowerCase();

        System.out.println("\n🔮 Interpreting your dream...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("✨ The dream world glitched!");
        }
        System.out.println("\n💭 Dream Interpretation:");
        switch (dream) {
            case "water":
                System.out.println("💧 Water represents emotions and renewal. You might be cleansing old feelings.");
                break;
            case "snake":
                System.out.println("🐍 Snake often symbolizes transformation or hidden fears.");
                break;
            case "flight":
            case "flying":
                System.out.println("🕊️ Flying means freedom — you’re ready to rise above challenges.");
                break;
            case "fire":
                System.out.println("🔥 Fire can mean passion, energy, or a desire for change.");
                break;
            case "teeth":
                System.out.println("🦷 Losing teeth often shows anxiety or fear of losing control.");
                break;
            case "falling":
                System.out.println("💫 Falling might reflect insecurities or feeling out of balance in life.");
                break;
            case "road":
                System.out.println("🛣️ Roads symbolize your life path — you may be choosing a new direction.");
                break;
            case "mirror":
                System.out.println("🪞 Mirrors reflect self-awareness. You may be discovering something new about yourself.");
                break;
            default:
                System.out.println("✨ That’s an interesting dream symbol! It represents something deeply personal.");
        }
        System.out.println("\n💤 Remember: every dream is a message from your subconscious mind.");
        sc.close();
    }
}
