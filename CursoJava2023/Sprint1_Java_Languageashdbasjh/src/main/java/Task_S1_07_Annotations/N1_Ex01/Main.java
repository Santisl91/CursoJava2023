package Task_S1_07_Annotations.N1_Ex01;

public class Main {
    public static void main(String[] args) {

        OnlineWorker onlineWorker1 = new OnlineWorker("Santiago", "Santos", 20.60);
        OnsiteWorker onsiteWorker1 = new OnsiteWorker("Mario","Perez",18.9);

        double onsiteHours = 324.7;
        double onlineHours = 254.6;

        double onlineSalary = onlineWorker1.calculateSalary(onlineHours);
        double onsiteSalary = onsiteWorker1.calculateSalary(onsiteHours);

        System.out.println("El salario del online worker " + onlineWorker1.getFirstName() + " " + onlineWorker1.getLastName() + " es: " + onsiteSalary + " euros");
        System.out.println("El salario del onsite worker " + onsiteWorker1.getFirstName() + " " + onsiteWorker1.getLastName() + " es: " + onlineSalary + " euros");
        }
    }

