package Task_S1_05_Utils.N1_Ex01;


public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Uso: java App <ruta_del_directorio>");
            System.exit(1);
        }

        String directorio = args[0];
        ListarDirectorio.listarDirec(directorio);
    }
}






