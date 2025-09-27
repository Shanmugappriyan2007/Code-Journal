import java.util.Scanner;

public class CurrencyNoteCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};
        System.out.print("Enter amount: ");
        int amount = scanner.nextInt();
        System.out.println("\nCurrency breakdown for " + amount + ":");

        for (int note : notes) {
            if (amount >= note) {
                int count = amount / note;
                amount = amount % note;
                System.out.println(note + " x " + count);
            }
        }
        scanner.close();
    }
}
