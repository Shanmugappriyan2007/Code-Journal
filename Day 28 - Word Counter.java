import java.util.Scanner;
public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String[] words = sentence.trim().split("\\s+");
        System.out.println("Total words: " + words.length);
        scanner.close();
    }
}
