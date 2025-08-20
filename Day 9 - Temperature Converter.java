import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Temperature Converter =====");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Celsius to Kelvin");
        System.out.println("4. Kelvin to Celsius");
        System.out.println("5. Fahrenheit to Kelvin");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.print("Enter your choice (1-6): ");
        
        int choice = sc.nextInt();
        double inputTemp, convertedTemp;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = sc.nextDouble();
                convertedTemp = (inputTemp * 9/5) + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = sc.nextDouble();
                convertedTemp = (inputTemp - 32) * 5/9;
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;
            case 3:
                System.out.print("Enter temperature in Celsius: ");
                inputTemp = sc.nextDouble();
                convertedTemp = inputTemp + 273.15;
                System.out.println("Temperature in Kelvin: " + convertedTemp);
                break;
            case 4:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = sc.nextDouble();
                convertedTemp = inputTemp - 273.15;
                System.out.println("Temperature in Celsius: " + convertedTemp);
                break;
            case 5:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputTemp = sc.nextDouble();
                convertedTemp = (inputTemp - 32) * 5/9 + 273.15;
                System.out.println("Temperature in Kelvin: " + convertedTemp);
                break;
            case 6:
                System.out.print("Enter temperature in Kelvin: ");
                inputTemp = sc.nextDouble();
                convertedTemp = (inputTemp - 273.15) * 9/5 + 32;
                System.out.println("Temperature in Fahrenheit: " + convertedTemp);
                break;
            default:
                System.out.println("Invalid choice! Please run again.");
        }

        sc.close();
    }
}
