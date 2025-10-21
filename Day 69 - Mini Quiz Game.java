import java.util.Scanner;

public class MiniQuizGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "1. What is the capital of India?\n a) Mumbai\n b) Delhi\n c) Kolkata\n d) Chennai",
            "2. Who developed Java?\n a) Bjarne Stroustrup\n b) James Gosling\n c) Guido van Rossum\n d) Elon Musk",
            "3. Which planet is known as the Red Planet?\n a) Earth\n b) Venus\n c) Mars\n d) Jupiter"
        };
        char[] answers = {'b', 'b', 'c'};
        int score = 0;
        System.out.println("📝 Welcome to the Mini Quiz Game!");
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Enter your answer (a/b/c/d): ");
            char userAnswer = sc.next().toLowerCase().charAt(0);
            if (userAnswer == answers[i]) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + answers[i]);
            }
        }
        System.out.println("\n🎉 Quiz Over! Your Score: " + score + "/" + questions.length);
        sc.close();
    }
}
