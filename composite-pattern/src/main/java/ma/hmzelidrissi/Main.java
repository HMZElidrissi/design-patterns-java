package ma.hmzelidrissi;

/**
 * Main class demonstrating the Composite pattern.
 * This example simulates a file system structure where files are leaves
 * and directories are composites that can contain other files and directories.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Composite Pattern Demo ===\n");
        
        // Create individual files (leaves)
        Component file1 = new Leaf("document.txt", 1024);
        Component file2 = new Leaf("image.jpg", 2048);
        Component file3 = new Leaf("video.mp4", 5120);
        Component file4 = new Leaf("readme.md", 512);
        Component file5 = new Leaf("config.json", 256);
        
        // Create directories (composites)
        Composite documents = new Composite("Documents");
        Composite pictures = new Composite("Pictures");
        Composite videos = new Composite("Videos");
        Composite root = new Composite("Root");
        
        // Build the hierarchy
        documents.add(file1);
        documents.add(file4);
        
        pictures.add(file2);
        
        videos.add(file3);
        
        root.add(documents);
        root.add(pictures);
        root.add(videos);
        root.add(file5);
        
        // Display the entire structure
        System.out.println("File System Structure:");
        System.out.println("======================");
        root.display();
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrate individual component operations
        System.out.println("\nIndividual Component Operations:");
        System.out.println("===============================");
        
        System.out.println("Documents folder contains " + documents.getChildCount() + " items");
        System.out.println("Documents folder total size: " + documents.getSize() + " bytes");
        
        System.out.println("\nPictures folder contains " + pictures.getChildCount() + " items");
        System.out.println("Pictures folder total size: " + pictures.getSize() + " bytes");
        
        System.out.println("\nVideos folder contains " + videos.getChildCount() + " items");
        System.out.println("Videos folder total size: " + videos.getSize() + " bytes");
        
        System.out.println("\nRoot folder contains " + root.getChildCount() + " items");
        System.out.println("Root folder total size: " + root.getSize() + " bytes");
        
        System.out.println("\n" + "=".repeat(50));
        
        // Demonstrate removing a component
        System.out.println("\nAfter removing config.json from root:");
        System.out.println("=====================================");
        root.remove(file5);
        root.display();
        
        System.out.println("\nRoot folder now contains " + root.getChildCount() + " items");
        System.out.println("Root folder total size: " + root.getSize() + " bytes");
    }
}