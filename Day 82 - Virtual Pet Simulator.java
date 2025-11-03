import java.util.*;

class Pet {
    String name;
    int hunger;
    int happiness;
    int energy;

    Pet(String name) {
        this.name = name;
        this.hunger = 50;
        this.happiness = 50;
        this.energy = 50;
    }
    void feed() {
        hunger -= 10;
        happiness += 5;
        System.out.println("🍖 You fed " + name + "! Hunger decreased, happiness increased!");
    }
    void play() {
        if (energy >= 10) {
            happiness += 10;
            energy -= 10;
            hunger += 5;
            System.out.println("🎾 You played with " + name + "! Happiness increased, energy decreased!");
        } else {
            System.out.println("😴 " + name + " is too tired to play. Try resting.");
        }
    }
    void rest() {
        energy += 15;
        hunger += 5;
        System.out.println("💤 " + name + " took a nap and regained energy!");
    }
    void status() {
        System.out.println("\n=========================");
        System.out.println("🐾 Pet Name: " + name);
        System.out.println("🍗 Hunger: " + hunger + "/100");
        System.out.println("😊 Happiness: " + happiness + "/100");
        System.out.println("⚡ Energy: " + energy + "/100");
        System.out.println("=========================\n");
    }
    boolean isUnhappy() {
        return hunger >= 100 || happiness <= 0 || energy <= 0;
    }
}
public class VirtualPetSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🐶 Welcome to the Virtual Pet Simulator!");
        System.out.print("Enter your pet's name: ");
        String petName = sc.nextLine();
        Pet pet = new Pet(petName);
        int choice;
        do {
            System.out.println("\nWhat do you want to do with " + petName + "?");
            System.out.println("1️⃣ Feed 🍖");
            System.out.println("2️⃣ Play 🎾");
            System.out.println("3️⃣ Rest 💤");
            System.out.println("4️⃣ Check Status 📊");
            System.out.println("5️⃣ Exit 🚪");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> pet.feed();
                case 2 -> pet.play();
                case 3 -> pet.rest();
                case 4 -> pet.status();
                case 5 -> System.out.println("👋 Goodbye! " + petName + " will miss you!");
                default -> System.out.println("❌ Invalid choice!");
            }
            if (pet.isUnhappy()) {
                System.out.println("\n😢 Oh no! " + petName + " got sick due to bad care. Game Over!");
                break;
            }
        } while (choice != 5);
        sc.close();
    }
}
