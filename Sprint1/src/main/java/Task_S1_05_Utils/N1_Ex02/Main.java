package Task_S1_05_Utils.N1_Ex02;

public class Main {
    public static void main(String[] args) {
        String directoryPath = ("copiar directorio aca");
        MainDirectoryLister directoryLister = new MainDirectoryLister(directoryPath);
        System.out.println("Directory Tree for '" + directoryPath + "':");
        directoryLister.listDirectoryTree();
    }
}

