import java.util.Random;

public class MotivationQuote {
    public static void main(String[] args) {
        String[] quotes = {
            "Believe in yourself and all that you are.",
            "Push harder than yesterday if you want a different tomorrow.",
            "Don’t watch the clock; do what it does. Keep going.",
            "Dream it. Wish it. Do it.",
            "Success is the sum of small efforts repeated day in and day out.",
            "The harder you work for something, the greater you’ll feel when you achieve it.",
            "Great things never come from comfort zones.",
            "Stay positive, work hard, make it happen."
        };
        Random rand = new Random();
        int index = rand.nextInt(quotes.length);
        System.out.println("\n💬 Your Daily Motivation:");
        System.out.println("----------------------------------");
        System.out.println("✨ " + quotes[index]);
        System.out.println("----------------------------------");
    }
}
