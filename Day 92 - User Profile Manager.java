class UserProfile {
    private String name;
    private int age;
    private String email;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
    // Setter for email
    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email format!");
        }
    }
    // Getter for email
    public String getEmail() {
        return email;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {
        UserProfile user = new UserProfile();

        user.setName("Shanmuga Priyan");
        user.setAge(18);
        user.setEmail("priyan@example.com");
        System.out.println("User Profile Details:");
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());
        System.out.println("Email: " + user.getEmail());
    }
}
