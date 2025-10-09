import java.util.Scanner;

public class ExpenseSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Expense Splitter ---");
        System.out.print("Enter total bill amount: ₹");
        double totalAmount = sc.nextDouble();

        System.out.print("Enter number of people sharing the bill: ");
        int people = sc.nextInt();
        if (people <= 0) {
            System.out.println("❌ Invalid number of people!");
        } else {
            double amountPerPerson = totalAmount / people;
            System.out.printf("\nEach person should pay: ₹%.2f%n", amountPerPerson);

            System.out.println("\n--- Summary ---");
            System.out.println("Total Bill: ₹" + totalAmount);
            System.out.println("Number of People: " + people);
            System.out.printf("Amount per Person: ₹%.2f%n", amountPerPerson);
            if (amountPerPerson > 1000) {
                System.out.println("💸 That’s a pricey outing!");
            } else {
                System.out.println("😊 Fair and affordable split!");
            }
        }
        sc.close();
    }
}
