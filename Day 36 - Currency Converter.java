import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usdToInr = 83.2;
        double eurToInr = 90.1;
        double gbpToInr = 105.3;

        System.out.println("💱 Currency Converter (to INR)");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.println("3. GBP to INR");
        System.out.print("Choose conversion type: ");
        int choice = scanner.nextInt();
        System.out.print("Enter amount: ");
        double amount = scanner.nextDouble();

        double result;
        switch (choice) {
            case 1:
                result = amount * usdToInr;
                System.out.println(amount + " USD = " + result + " INR");
                break;
            case 2:
                result = amount * eurToInr;
                System.out.println(amount + " EUR = " + result + " INR");
                break;
            case 3:
                result = amount * gbpToInr;
                System.out.println(amount + " GBP = " + result + " INR");
                break;
            default:
                System.out.println("Invalid choice!");
        }
       scanner.close();
    }
}
