import java.util.Random;
import java.util.Scanner;

public class LuckyDraw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter number of participants: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        String[] participants = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name of participant " + (i + 1) + ": ");
            participants[i] = sc.nextLine();
        }
        int winnerIndex = rand.nextInt(n);
        System.out.println("\n--- Lucky Draw Result ---");
        System.out.println("🎉 Congratulations " + participants[winnerIndex] + "! You are the winner 🎉");
        sc.close();
    }
}
