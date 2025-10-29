import java.util.*;

public class MoodJournal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> moodLog = new HashMap<>();
        int choice;
        System.out.println("🌈 Welcome to Your Daily Mood Journal 🌈");
        do {
            System.out.println("\n1️⃣ Log Today’s Mood");
            System.out.println("2️⃣ View Mood Summary");
            System.out.println("3️⃣ Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline
            switch (choice) {
                case 1:
                    System.out.print("How are you feeling today? (Happy, Sad, Excited, Angry, Calm, etc.): ");
                    String mood = sc.nextLine().trim().toLowerCase();
                    moodLog.put(mood, moodLog.getOrDefault(mood, 0) + 1);
                    System.out.println("✅ Mood logged successfully! Stay mindful 💖");
                    break;
                case 2:
                    if (moodLog.isEmpty()) {
                        System.out.println("⚠️ No moods logged yet!");
                    } else {
                        System.out.println("\n📊 Mood Summary:");
                        for (String m : moodLog.keySet()) {
                            System.out.println("• " + capitalize(m) + " → " + moodLog.get(m) + " day(s)");
                        }
                        String mostFrequentMood = Collections.max(moodLog.entrySet(), Map.Entry.comparingByValue()).getKey();
                        System.out.println("\n🌟 Most frequent mood: " + capitalize(mostFrequentMood));
                        System.out.println("📅 Total days logged: " + moodLog.values().stream().mapToInt(Integer::intValue).sum());
                    }
                    break;
                case 3:
                    System.out.println("\n🫶 Goodbye! Keep tracking your feelings.");
                    break;
                default:
                    System.out.println("❌ Invalid choice, try again!");
            }
        } while (choice != 3);
        sc.close();
    }
    static String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
