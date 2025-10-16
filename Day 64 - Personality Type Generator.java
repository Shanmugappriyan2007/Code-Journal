import java.util.Scanner;

public class PersonalityTypeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🧩 Welcome to the Personality Type Generator!");
        System.out.print("What is your favorite color? ");
        String color = sc.nextLine().toLowerCase();
        System.out.print("What is your favorite season? (summer/winter/rainy/spring): ");
        String season = sc.nextLine().toLowerCase();

        System.out.print("What do you prefer doing in free time? (reading/traveling/sleeping/working out): ");
        String activity = sc.nextLine().toLowerCase();
        String personality = "";
        if (activity.equals("reading") && season.equals("winter")) {
            personality = "🌙 The Calm Thinker — You love peace, introspection, and deep thoughts.";
        } 
        else if (activity.equals("traveling") && season.equals("summer")) {
            personality = "🌞 The Adventurer — You’re curious, outgoing, and love exploring new things.";
        } 
        else if (activity.equals("sleeping") && season.equals("rainy")) {
            personality = "☁️ The Dreamer — You value comfort, imagination, and emotional depth.";
        } 
        else if (activity.equals("working out") && season.equals("spring")) {
            personality = "🔥 The Go-Getter — You’re motivated, energetic, and goal-oriented.";
        } 
        else {
            personality = "✨ The Unique Soul — You don’t fit in a box, and that’s your greatest strength!";
        }
        System.out.println("\n🔍 Personality Analysis Result:");
        System.out.println(personality);
        sc.close();
    }
}
