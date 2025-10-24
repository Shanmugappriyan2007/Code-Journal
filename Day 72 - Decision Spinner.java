import java.util.*;

public class LifeDecisionSpinner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("🎯 Welcome to the Life Decision Spinner!");
        System.out.print("Enter the number of options you can’t decide between: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] options = new String[n];
        System.out.println("\nEnter your options one by one:");
        for (int i = 0; i < n; i++) {
            System.out.print("Option " + (i + 1) + ": ");
            options[i] = sc.nextLine();
        }
        System.out.println("\nSpinning the wheel of destiny... 🎡");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println("Spin interrupted!");
        }
        int choice = random.nextInt(n);
        System.out.println("\n💡 The Spinner Says: \"" + options[choice] + "\" 🎉");
        sc.close();
    }
}
