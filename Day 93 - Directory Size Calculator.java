import java.io.File;

public class DirectorySizeCalculator {

    // Recursive method
    public static long getFolderSize(File folder) {
        long totalSize = 0;

        File[] files = folder.listFiles();
        if (files == null) return 0;

        for (File file : files) {
            if (file.isFile()) {
                totalSize += file.length(); // size in bytes
            } else {
                totalSize += getFolderSize(file); // recursive call
            }
        }
        return totalSize;
    }
    public static void main(String[] args) {
        File folder = new File("C:/Users/YourName/Documents"); // change path
        if (!folder.exists()) {
            System.out.println("❌ Folder not found!");
            return;
        }
        long size = getFolderSize(folder);
        System.out.println("📁 Total Folder Size: " + size + " bytes");
    }
}
