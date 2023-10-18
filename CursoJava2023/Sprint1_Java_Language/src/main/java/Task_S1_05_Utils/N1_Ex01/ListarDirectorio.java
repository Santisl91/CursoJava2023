package Task_S1_05_Utils.N1_Ex01;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class ListarDirectorio {
    public static void listarDirec(String rutaDirectorio) {
        File carpeta = new File(rutaDirectorio);

        if (carpeta.exists() && carpeta.isDirectory()) {
            File[] archivos = carpeta.listFiles(new FileFilter() {
                @Override
                public boolean accept(File archivo) {
                    return archivo.isFile();
                }
            });

            if (archivos != null) {
                Arrays.sort(archivos);

                System.out.println("Contenido del directorio " + rutaDirectorio + ":");
                for (File archivo : archivos) {
                    System.out.println(archivo.getName());
                }
            } else {
                System.out.println("El directorio está vacío.");
            }
        } else {
            System.out.println("El directorio especificado no existe o no es un directorio válido.");
        }
    }
}