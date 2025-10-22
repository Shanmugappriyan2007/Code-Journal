import java.util.Scanner;

public class DailyExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many expenses you want to record: ");
        int n = sc.nextInt();
        String[] items = new String[n];
        double[] costs = new double[n];
        double total = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter item name: ");
            items[i] = sc.next();

            System.out.print("Enter amount spent on " + items[i] + ": ₹");
            costs[i] = sc.nextDouble();
            total += costs[i];
        }
        System.out.println("\n----- Expense Summary -----");
        for (int i = 0; i < n; i++) {
            System.out.println(items[i] + " - ₹" + costs[i]);
        }
        System.out.println("------------------------------");
        System.out.println("Total Spent: ₹" + total);
        sc.close();
    }
}
