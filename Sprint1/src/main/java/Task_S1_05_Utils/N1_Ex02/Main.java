package Task_S1_05_Utils.N1_Ex02;

public class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Por favor, ingresa la ruta del directorio como argumento al ejecutar el programa.");
            return;
        }

        String directoryPath = args[0];
        MainDirectoryLister directoryLister = new MainDirectoryLister(directoryPath);
        System.out.println("Directory Tree for '" + directoryPath + "':");
        directoryLister.listDirectoryTree();
    }
}
