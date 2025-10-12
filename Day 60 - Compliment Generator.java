import java.util.Random;
public class RandomComplimentGenerator {
    public static void main(String[] args) {
        String[] compliments = {
            "You have an amazing smile 😊",
            "You’re doing great, keep it up!",
            "You’re smarter than you think 💡",
            "You bring positive energy everywhere!",
            "You are stronger than you believe 💪",
            "Your creativity is inspiring!",
            "You light up the room wherever you go 🌟",
            "You’re making progress every single day!",
            "You have a heart of gold ❤️",
            "You deserve all the good things in life!"
        };
        Random random = new Random();
        int index = random.nextInt(compliments.length);
        System.out.println("💬 Your Compliment of the Day:");
        System.out.println("--------------------------------");
        System.out.println(compliments[index]);
    }
}
