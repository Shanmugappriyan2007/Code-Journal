import java.util.Scanner;

public class ContactBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter number of contacts to save: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] names = new String[n];
        String[] numbers = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name for contact " + (i + 1) + ": ");
            names[i] = sc.nextLine();

            System.out.print("Enter phone number for " + names[i] + ": ");
            numbers[i] = sc.nextLine();
        }
        System.out.print("\nEnter a name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("📞 " + names[i] + " : " + numbers[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("❌ Contact not found!");
        }
        sc.close();
    }
}
