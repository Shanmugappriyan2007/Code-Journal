import java.util.Scanner;

public class PersonalityColorPredictor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        System.out.println("🎨 Welcome to the Personality Color Predictor!");
        System.out.println("Answer these quick questions to find your color aura!\n");
        System.out.print("1️⃣ Do you enjoy meeting new people? (yes/no): ");
        String q1 = sc.next().toLowerCase();
        if (q1.equals("yes")) score += 2; else score += 1;

        System.out.print("2️⃣ Do you prefer planning or going with the flow? (plan/flow): ");
        String q2 = sc.next().toLowerCase();
        if (q2.equals("plan")) score += 1; else score += 2;

        System.out.print("3️⃣ Do you work best in silence or with music? (silence/music): ");
        String q3 = sc.next().toLowerCase();
        if (q3.equals("music")) score += 2; else score += 1;

        System.out.print("4️⃣ Do you act on logic or emotion? (logic/emotion): ");
        String q4 = sc.next().toLowerCase();
        if (q4.equals("emotion")) score += 2; else score += 1;

        System.out.print("5️⃣ Would you rather lead or support? (lead/support): ");
        String q5 = sc.next().toLowerCase();
        if (q5.equals("lead")) score += 2; else score += 1;

        System.out.println("\n✨ Analyzing your vibe...");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("🌀 The universe glitched for a moment!");
        }

        System.out.println("\nYour Personality Color is: ");
        if (score <= 5)
            System.out.println("💙 Blue — Calm, wise, and dependable.");
        else if (score <= 7)
            System.out.println("💚 Green — Balanced, empathetic, and thoughtful.");
        else if (score <= 9)
            System.out.println("💛 Yellow — Cheerful, creative, and full of energy!");
        else
            System.out.println("❤️ Red — Bold, passionate, and born to lead!");

        sc.close();
    }
}
