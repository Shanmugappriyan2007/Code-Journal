import java.util.*;

public class WordShuffleGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = {"java", "coding", "smart", "future", "keyboard", "computer", "college"};
        Random random = new Random();
        String originalWord = words[random.nextInt(words.length)];
        String shuffledWord = shuffleWord(originalWord);

        System.out.println("🔠 Welcome to the Word Shuffle Game!");
        System.out.println("Unscramble this word: " + shuffledWord);
        System.out.print("Your guess: ");
        String guess = sc.nextLine();

        if (guess.equalsIgnoreCase(originalWord)) {
            System.out.println("🎉 Correct! You guessed it right!");
        } else {
            System.out.println("❌ Oops! The correct word was: " + originalWord);
        }
        System.out.println("✨ Thanks for playing!");
        sc.close();
    }
    public static String shuffleWord(String word) {
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray()) {
            letters.add(c);
        }
        Collections.shuffle(letters);
        StringBuilder shuffled = new StringBuilder();
        for (char c : letters) {
            shuffled.append(c);
        }
        return shuffled.toString();
    }
}
