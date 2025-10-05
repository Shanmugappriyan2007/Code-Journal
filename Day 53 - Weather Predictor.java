import java.util.Random;
import java.util.Scanner;

public class WeatherReporter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        String[] conditions = {"Sunny", "Cloudy", "Rainy", "Stormy", "Windy", "Snowy", "Foggy"};
        int temperature = rand.nextInt(35) + 5; // Temperature between 5°C to 39°C
        String condition = conditions[rand.nextInt(conditions.length)];
        System.out.println("\n--- Weather Report ---");
        System.out.println("City: " + city);
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Condition: " + condition);
        System.out.println("----------------------");

        sc.close();
    }
}
