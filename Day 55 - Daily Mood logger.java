import java.util.Scanner;

public class DailyMoodLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] moods = new String[7];
        int happy = 0, sad = 0, tired = 0, relaxed = 0, excited = 0, others = 0;

        System.out.println("--- Daily Mood Logger ---");

        for (int i = 0; i < days.length; i++) {
            System.out.print("Enter your mood for " + days[i] + ": ");
            moods[i] = sc.nextLine().toLowerCase();

            switch (moods[i]) {
                case "happy":
                    happy++;
                    break;
                case "sad":
                    sad++;
                    break;
                case "tired":
                    tired++;
                    break;
                case "relaxed":
                    relaxed++;
                    break;
                case "excited":
                    excited++;
                    break;
                default:
                    others++;
            }
        }

        System.out.println("\n--- Weekly Mood Summary ---");
        System.out.println("Happy: " + happy + " times");
        System.out.println("Sad: " + sad + " times");
        System.out.println("Tired: " + tired + " times");
        System.out.println("Relaxed: " + relaxed + " times");
        System.out.println("Excited: " + excited + " times");
        System.out.println("Other moods: " + others + " times");
      
        String dominantMood = "None";
        int max = 0;

        if (happy > max) {
            max = happy;
            dominantMood = "Happy";
        }
        if (sad > max) {
            max = sad;
            dominantMood = "Sad";
        }
        if (tired > max) {
            max = tired;
            dominantMood = "Tired";
        }
        if (relaxed > max) {
            max = relaxed;
            dominantMood = "Relaxed";
        }
        if (excited > max) {
            max = excited;
            dominantMood = "Excited";
        }
        System.out.println("\nDominant Mood of the Week: " + dominantMood.toUpperCase() + " 😄");
        sc.close();
    }
}
