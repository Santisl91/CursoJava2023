package Task_S1_05_Utils.N1_Ex02;

import java.io.File;
import java.util.Arrays;
import java.text.SimpleDateFormat;

public class MainDirectoryLister {
    private String directoryPath;

    public MainDirectoryLister(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public void listDirectoryTree() {
        listDirectoryTree(new File(directoryPath), "");
    }

    private void listDirectoryTree(File directory, String indent) {
        if (directory.isDirectory()) {
            System.out.println(indent + "D " + directory.getName() + " (Last Modified: " + formatDate(directory.lastModified()) + ")");
            String[] contents = directory.list();
            Arrays.sort(contents);

            for (String item : contents) {
                listDirectoryTree(new File(directory, item), indent + "  ");
            }
        } else {
            System.out.println(indent + "F " + directory.getName() + " (Last Modified: " + formatDate(directory.lastModified()) + ")");
        }
    }

    private String formatDate(long lastModified) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return dateFormat.format(lastModified);
    }

    public static void main(String[] args) {
        String directoryPath = "/Users/santiagosantos/IdeaProjects";
        MainDirectoryLister directoryLister = new MainDirectoryLister(directoryPath);
        System.out.println("Directory Tree for '" + directoryPath + "':");
        directoryLister.listDirectoryTree();
    }
}
