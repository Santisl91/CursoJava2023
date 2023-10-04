package Task_S1_01_Inheritance_Polymorphism.N1_Ex01;

public class App {
    static {
        System.out.println("Demostrando Static{}");
    }
    public static void main(String[] args) {

        Viento flauta = new Viento ("Flauta",300 );
        Cuerda guitarra = new Cuerda("Guitarra", 1000);
        Percusion bateria = new Percusion("Bateria",3000);

        flauta.tocar();
        guitarra.tocar();
        bateria.tocar();

    }
}