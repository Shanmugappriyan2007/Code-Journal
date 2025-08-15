import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers (type -1 to stop):");

        while (true) {
            int num = sc.nextInt();
            if (num == -1) break;
            numbers.add(num);
        }
        System.out.println("\nYou entered: " + numbers);
        sc.close();
    }
}
