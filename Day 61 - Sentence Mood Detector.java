import java.util.Scanner;

public class SentenceMoodDetector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🤖 Mood Detector Bot");
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        if (sentence.contains("happy") || sentence.contains("great") || sentence.contains("awesome") || sentence.contains("joy")) {
            System.out.println("😊 Mood detected: Happy!");
        } else if (sentence.contains("sad") || sentence.contains("bad") || sentence.contains("unhappy") || sentence.contains("depressed")) {
            System.out.println("😔 Mood detected: Sad!");
        } else if (sentence.contains("angry") || sentence.contains("mad") || sentence.contains("furious") || sentence.contains("irritated")) {
            System.out.println("😡 Mood detected: Angry!");
        } else {
            System.out.println("😐 Mood detected: Neutral or Undefined.");
        }
        System.out.println("✨ Keep expressing yourself!");
        sc.close();
    }
}
