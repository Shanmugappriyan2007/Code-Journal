import java.util.*;

abstract class Document {
    String fileName;

    Document(String fileName) {
        this.fileName = fileName;
    }
    abstract void loadDocument();
    abstract void displayContent();

    void showInfo() {
        System.out.println("📁 File Name: " + fileName);
    }
}
class TextDocument extends Document {
    TextDocument(String fileName) {
        super(fileName);
    }
    @Override
    void loadDocument() {
        System.out.println("📄 Loading text file: " + fileName);
    }
    @Override
    void displayContent() {
        System.out.println("📝 Displaying plain text content...");
        System.out.println("Hello, this is a sample text document!");
    }
}
class PDFDocument extends Document {
    PDFDocument(String fileName) {
        super(fileName);
    }
    @Override
    void loadDocument() {
        System.out.println("📚 Loading PDF file: " + fileName);
    }
    @Override
    void displayContent() {
        System.out.println("🔍 Rendering PDF content...");
        System.out.println("[PDF] QueueLess Report 2025 - Confidential Data");
    }
}
class WordDocument extends Document {
    WordDocument(String fileName) {
        super(fileName);
    }
    @Override
    void loadDocument() {
        System.out.println("📘 Loading Word document: " + fileName);
    }
    @Override
    void displayContent() {
        System.out.println("🧾 Showing Word document structure and formatting...");
        System.out.println("Report Title: Blockchain-Based Ticketing");
    }
}
public class DocumentProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("📄 Welcome to the Document Processing System");
        System.out.print("Enter file name (e.g., report.pdf): ");
        String file = sc.nextLine();

        System.out.println("Choose document type:");
        System.out.println("1️⃣ Text (.txt)");
        System.out.println("2️⃣ PDF (.pdf)");
        System.out.println("3️⃣ Word (.docx)");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        Document doc;
        switch (choice) {
            case 1 -> doc = new TextDocument(file);
            case 2 -> doc = new PDFDocument(file);
            case 3 -> doc = new WordDocument(file);
            default -> {
                System.out.println("❌ Invalid option!");
                sc.close();
                return;
            }
        }
        System.out.println("\n🔹 Document Info:");
        doc.showInfo();
        System.out.println("\n🔹 Processing Document...");
        doc.loadDocument();
        doc.displayContent();
        sc.close();
    }
}
