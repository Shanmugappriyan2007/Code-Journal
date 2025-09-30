import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double totalExpense = 0;
        System.out.print("Enter number of expenses: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter expense " + i + " description: ");
            String desc = sc.nextLine();
            System.out.print("Enter amount for " + desc + ": ");
            double amount = sc.nextDouble();
            sc.nextLine(); 
            totalExpense += amount;
        }
        System.out.println("\n--- Expense Summary ---");
        System.out.println("Total Expenses: ₹" + totalExpense);
        System.out.println("Average Expense: ₹" + (totalExpense / n));
        System.out.println("✅ Track your spending wisely!");
        sc.close();
    }
}
