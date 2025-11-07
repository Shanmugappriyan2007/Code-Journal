import java.io.*;
import java.nio.file.*;
import java.util.*;

public class SmartFileOrganizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("🗂️ Smart File Organizer");
        System.out.print("Enter folder path to organize: ");
        String folderPath = sc.nextLine();
        File folder = new File(folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("❌ Invalid folder path!");
            return;
        }
        // Define file type categories
        Map<String, String> fileCategories = new HashMap<>();
        fileCategories.put("jpg", "Images");
        fileCategories.put("png", "Images");
        fileCategories.put("jpeg", "Images");
        fileCategories.put("gif", "Images");

        fileCategories.put("mp3", "Music");
        fileCategories.put("wav", "Music");
        fileCategories.put("m4a", "Music");

        fileCategories.put("mp4", "Videos");
        fileCategories.put("mkv", "Videos");
        fileCategories.put("mov", "Videos");

        fileCategories.put("pdf", "Documents");
        fileCategories.put("docx", "Documents");
        fileCategories.put("txt", "Documents");
        fileCategories.put("xlsx", "Documents");

        fileCategories.put("zip", "Archives");
        fileCategories.put("rar", "Archives");

        fileCategories.put("exe", "Applications");
        int organizedCount = 0;
        // Organize files
        File[] files = folder.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("📂 The folder is empty!");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                String fileName = file.getName();
                int dotIndex = fileName.lastIndexOf('.');
                if (dotIndex != -1) {
                    String extension = fileName.substring(dotIndex + 1).toLowerCase();
                    String category = fileCategories.getOrDefault(extension, "Others");
                    File newDir = new File(folderPath + File.separator + category);
                    if (!newDir.exists()) newDir.mkdir();
                    Path source = file.toPath();
                    Path target = Paths.get(newDir.getPath() + File.separator + file.getName());
                    try {
                        Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
                        organizedCount++;
                    } catch (IOException e) {
                        System.out.println("⚠️ Could not move: " + fileName);
                    }
                }
            }
        }
        System.out.println("\n✅ Organized " + organizedCount + " files successfully!");
        System.out.println("📁 Files sorted into categorized folders inside: " + folderPath);
    }
}
