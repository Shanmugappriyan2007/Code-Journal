import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("🎲 Dice Roller Simulator");
        String choice;
        do {
            int dice = random.nextInt(6) + 1; // Random number between 1 and 6
            System.out.println("You rolled: " + dice);
            System.out.print("Roll again? (yes/no): ");
            choice = scanner.next().toLowerCase();
        } while (choice.equals("yes"));
        System.out.println("👋 Thanks for playing!");
        scanner.close();
    }
}
