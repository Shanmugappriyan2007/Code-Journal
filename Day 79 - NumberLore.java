import java.util.*;

public class NumberLore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🔢 Welcome to NumberLore! Enter a number:");

        int num = sc.nextInt();
        tellStory(num);
    }
    static void tellStory(int n) {
        if (n == 0) {
            System.out.println("🌀 Zero: the void, the origin, the paradox.");
        } else if (n == 1) {
            System.out.println("🥇 One: the leader, the lone wolf, the spark.");
        } else if (n == 7) {
            System.out.println("🎲 Seven: lucky, mystical, prime and proud.");
        } else if (n == 13) {
            System.out.println("👻 Thirteen: feared by buildings, loved by rebels.");
        } else if (isPrime(n)) {
            System.out.println("🔐 " + n + " is prime — indivisible, untouchable.");
        } else if (n % 2 == 0) {
            System.out.println("⚖️ " + n + " is even — balanced and predictable.");
        } else {
            System.out.println("🌪️ " + n + " is odd — quirky and unpredictable.");
        }
    }
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0) return false;
        return true;
    }
}
