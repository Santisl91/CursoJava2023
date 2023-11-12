package Task_S1_05_Utils.N1_Ex03;

import java.io.File;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Arrays;

public class DirectoryListerTxt {
    private String directoryPath;

    public DirectoryListerTxt(String directoryPath) {
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

}

