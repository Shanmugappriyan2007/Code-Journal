import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SimpleFileReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter filename to read: ");
        String fileName = scanner.nextLine();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            System.out.println("📂 File Content:");
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                System.out.println(line);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("⚠️ Error: File not found! Please check the filename.");
        } catch (Exception e) {
            System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("✅ Program finished.");
            scanner.close();
        }
    }
}
