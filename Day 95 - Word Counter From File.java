import java.io.*;

public class FileWordCounter {
    public static void main(String[] args) {
        try {
            File file = new File("sample.txt"); // Make sure file exists
            BufferedReader br = new BufferedReader(new FileReader(file));

            int wordCount = 0;
            int lineCount = 0;
            int charCount = 0;
            String line;
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    wordCount += words.length;
                }
            }
            br.close();
            System.out.println("📁 FILE ANALYSIS RESULT:");
            System.out.println("Total Lines: " + lineCount);
            System.out.println("Total Words: " + wordCount);
            System.out.println("Total Characters: " + charCount);
        } catch (IOException e) {
            System.out.println("⚠️ Error reading file!");
        }
    }
}
