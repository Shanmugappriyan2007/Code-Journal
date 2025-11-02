import java.util.*;

class Resume {
    String name, email, phone, education, experience;
    ArrayList<String> skills = new ArrayList<>();

    void buildResume() {
        Scanner sc = new Scanner(System.in);

        System.out.println("🎓 Welcome to the Virtual Resume Builder 💼");
        System.out.print("\nEnter your full name: ");
        name = sc.nextLine();

        System.out.print("Enter your email address: ");
        email = sc.nextLine();

        System.out.print("Enter your phone number: ");
        phone = sc.nextLine();

        System.out.print("Enter your highest education qualification: ");
        education = sc.nextLine();

        System.out.print("Enter your work experience (or type 'Fresher'): ");
        experience = sc.nextLine();

        System.out.println("Enter your top 3 skills:");
        for (int i = 1; i <= 3; i++) {
            System.out.print("Skill " + i + ": ");
            skills.add(sc.nextLine());
        }

        System.out.println("\n✅ Resume Created Successfully!\n");
    }

    void displayResume() {
        System.out.println("====================================================");
        System.out.println("                 🧾 DIGITAL RESUME");
        System.out.println("====================================================");
        System.out.println("👤 Name: " + name);
        System.out.println("📧 Email: " + email);
        System.out.println("📞 Phone: " + phone);
        System.out.println("----------------------------------------------------");
        System.out.println("🎓 Education: " + education);
        System.out.println("💼 Experience: " + experience);
        System.out.println("----------------------------------------------------");
        System.out.println("🛠️ Skills:");
        for (String s : skills) {
            System.out.println("   - " + s);
        }
        System.out.println("----------------------------------------------------");
        System.out.println("✨ Generated using Virtual Resume Builder");
        System.out.println("====================================================");
    }
}

public class VirtualResumeBuilder {
    public static void main(String[] args) {
        Resume resume = new Resume();
        resume.buildResume();
        resume.displayResume();
    }
}
