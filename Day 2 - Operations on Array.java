import java.util.Scanner;

public class Day2_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array input
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // 1. Sum of elements
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of elements: " + sum);

        // 2. Smallest and largest
        int smallest = arr[0], largest = arr[0];
        for (int num : arr) {
            if (num < smallest) smallest = num;
            if (num > largest) largest = num;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);

        // 3. Reverse array
        System.out.print("Reversed array: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 4. Count even & odd
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);

        // 5. Search for a number
        System.out.print("Enter number to search: ");
        int search = sc.nextInt();
        boolean found = false;
        for (int num : arr) {
            if (num == search) {
                found = true;
                break;
            }
        }
        if (found) System.out.println(search + " found in array.");
        else System.out.println(search + " not found in array.");

        sc.close();
    }
}
}
