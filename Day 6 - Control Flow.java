import java.util.Scanner;

public class FlowControlDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
        System.out.print("Enter a limit for the for loop: ");
        int limit = sc.nextInt();

        System.out.println("Numbers from 1 to " + limit + " using for loop:");
        for (int i = 1; i <= limit; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Enter a number to start countdown: ");
        int count = sc.nextInt();

        System.out.println("Countdown using while loop:");
        while (count > 0) {
            System.out.print(count + " ");
            count--;
        }
        System.out.println();

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        System.out.print("Day " + day + " is: ");
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid Day");
        }
        sc.close();
    }
}
