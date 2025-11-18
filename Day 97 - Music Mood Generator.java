import java.util.*;

public class MusicMoodGenerator {
    private static final Map<String, String[]> moodPlaylists = new HashMap<>();

    static {
        moodPlaylists.put("happy", new String[]{"Sunny Beats", "Joyful Vibes", "Dance Pop", "Feel Good"});
        moodPlaylists.put("sad", new String[]{"Rainy Jazz", "Melancholy Piano", "Blue Soul", "Slow Ballads"});
        moodPlaylists.put("focused", new String[]{"Lo-Fi Study", "Ambient Flow", "Coding Tracks", "Calm Strings"});
        moodPlaylists.put("energetic", new String[]{"Epic Workout", "Power Rock", "Fast EDM", "Pump Up"});
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your mood (happy/sad/focused/energetic): ");
        String mood = sc.nextLine().toLowerCase();

        if (moodPlaylists.containsKey(mood)) {
            System.out.println("\n🎵 Playlist for mood: " + mood);
            String[] themes = moodPlaylists.get(mood);
            Random rand = new Random();
            for (int i = 0; i < 5; i++) {
                String track = themes[rand.nextInt(themes.length)] + " Track " + (rand.nextInt(50) + 1);
                System.out.println("- " + track);
            }
            System.out.println("\n💡 Tip: Music can boost your day!");
        } else {
            System.out.println("Mood not recognized. Try happy, sad, focused, or energetic.");
        }
    }
}
