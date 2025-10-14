import java.util.Scanner;

public class LuckyBirthdayFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎂 Welcome to Lucky Birthday Finder!");
        System.out.print("Enter your birth date (DDMMYYYY): ");
        String dob = sc.nextLine();
        int sum = 0;
        for (char c : dob.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            }
        }
        while (sum > 9) {
            int temp = 0;
            while (sum > 0) {
                temp += sum % 10;
                sum /= 10;
            }
            sum = temp;
        }
        System.out.println("🍀 Your Lucky Number is: " + sum);
        System.out.println("✨ Have a lucky day!");
        sc.close();
    }
}
