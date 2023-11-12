package Task_S1_05_Utils.N1_Ex04;

public class Main {
    public static void main(String[] args) {
        String directoryPath = ("copiar directorio aca");
        String outputFile = "DirectoryList.txt";
        String textFilePath = "DirectoryList.txt";

        DirectoryListerAndRead directoryLister = new DirectoryListerAndRead(directoryPath);
        directoryLister.listDirectoryTreeAndSaveToFile(outputFile);
        System.out.println("Directory Tree saved to '" + outputFile + "'.");

        System.out.println("\nContent of '" + textFilePath + "':");
        directoryLister.readAndPrintTextFile(textFilePath);
    }
}
