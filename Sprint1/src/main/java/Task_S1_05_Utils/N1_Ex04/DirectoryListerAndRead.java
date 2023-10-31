package Task_S1_05_Utils.N1_Ex04;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Scanner;

public class DirectoryListerAndRead {
    private String directoryPath;

    public DirectoryListerAndRead(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public void listDirectoryTreeAndSaveToFile(String outputFile) {
        try (PrintWriter writer = new PrintWriter(outputFile)) {
            listDirectoryTree(new File(directoryPath), "", writer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void listDirectoryTree(File directory, String indent, PrintWriter writer) {
        if (directory.isDirectory()) {
            writer.println(indent + "D " + directory.getName() + " (Last Modified: " + formatDate(directory.lastModified()) + ")");
            String[] contents = directory.list();
            Arrays.sort(contents);

            for (String item : contents) {
                listDirectoryTree(new File(directory, item), indent + "  ", writer);
            }
        } else {
            writer.println(indent + "F " + directory.getName() + " (Last Modified: " + formatDate(directory.lastModified()) + ")");
        }
    }

    private String formatDate(long lastModified) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(lastModified);
    }

    public void readAndPrintTextFile(String filePath) {
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String directoryPath = "/Users/santiagosantos/IdeaProjects";
        String outputFile = "DirectoryList.txt";
        String textFilePath = "DirectoryList.txt";

        DirectoryListerAndRead directoryLister = new DirectoryListerAndRead(directoryPath);
        directoryLister.listDirectoryTreeAndSaveToFile(outputFile);
        System.out.println("Directory Tree saved to '" + outputFile + "'.");

        System.out.println("\nContent of '" + textFilePath + "':");
        directoryLister.readAndPrintTextFile(textFilePath);
    }
}