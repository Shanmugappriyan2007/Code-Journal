import java.util.Scanner;

public class Day1Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Print array
        System.out.print("Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Sum of elements
        int sum = 0, max = arr[0];
        for (int num : arr) {
            sum += num;
            if (num > max) max = num;
        }
        
        System.out.println("\nSum: " + sum);
        System.out.println("Max: " + max);
    }
} 
