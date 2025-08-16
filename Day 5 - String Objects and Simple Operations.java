import java.util.Scanner;

class StringExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        System.out.println("\n--- Results ---");
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Length of your name: " + name.length());
        System.out.println("Your name in uppercase: " + name.toUpperCase());
        sc.close();
    }
}
