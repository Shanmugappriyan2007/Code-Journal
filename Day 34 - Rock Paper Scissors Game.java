import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] options = {"rock", "paper", "scissors"};

        System.out.println("🎮 Rock, Paper, Scissors Game!");
        System.out.print("Enter your choice (rock, paper, scissors): ");
        String userChoice = scanner.next().toLowerCase();

        String computerChoice = options[random.nextInt(3)];
        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a draw!");
        } else if ((userChoice.equals("rock") && computerChoice.equals("scissors")) ||
                   (userChoice.equals("paper") && computerChoice.equals("rock")) ||
                   (userChoice.equals("scissors") && computerChoice.equals("paper"))) {
            System.out.println("🎉 You win!");
        } else if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
            System.out.println("💻 Computer wins!");
        } else {
            System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
        }
        scanner.close();
    }
}
