import java.text.SimpleDateFormat;
import java.util.*;

class Item {
    String name;
    int quantity;
    double price;

    Item(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    double total() {
        return quantity * price;
    }
}

public class InvoiceGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Item> items = new ArrayList<>();

        System.out.println("🧾 Welcome to Smart Invoice Generator\n");

        System.out.print("Enter Company Name: ");
        String company = sc.nextLine();
        System.out.print("Enter Client Name: ");
        String client = sc.nextLine();
        System.out.print("Enter Client Email: ");
        String email = sc.nextLine();

        System.out.println("\nAdd products/services (type 'done' to finish):");
        while (true) {
            System.out.print("\nItem Name: ");
            String name = sc.nextLine();
            if (name.equalsIgnoreCase("done")) break;

            System.out.print("Quantity: ");
            int qty = sc.nextInt();
            System.out.print("Price per unit: ₹");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline
            items.add(new Item(name, qty, price));
        }

        System.out.print("\nEnter tax rate (in %): ");
        double taxRate = sc.nextDouble();

        // Generate invoice
        double subtotal = items.stream().mapToDouble(Item::total).sum();
        double tax = (subtotal * taxRate) / 100;
        double total = subtotal + tax;

        String date = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(new Date());
        String invoiceId = "INV-" + (1000 + new Random().nextInt(9000));

        System.out.println("\n=================== INVOICE ===================");
        System.out.println("Company: " + company);
        System.out.println("Client: " + client + " (" + email + ")");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Date: " + date);
        System.out.println("------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s\n", "Item", "Qty", "Price", "Total");
        System.out.println("------------------------------------------------");
        for (Item item : items) {
            System.out.printf("%-20s %-10d ₹%-9.2f ₹%-9.2f\n", item.name, item.quantity, item.price, item.total());
        }
        System.out.println("------------------------------------------------");
        System.out.printf("Subtotal: ₹%.2f\n", subtotal);
        System.out.printf("Tax (%.1f%%): ₹%.2f\n", taxRate, tax);
        System.out.printf("TOTAL: ₹%.2f\n", total);
        System.out.println("================================================");
        System.out.println("💼 Thank you for your business!");
        System.out.println("🧾 Invoice generated successfully.");
        sc.close();
    }
}
