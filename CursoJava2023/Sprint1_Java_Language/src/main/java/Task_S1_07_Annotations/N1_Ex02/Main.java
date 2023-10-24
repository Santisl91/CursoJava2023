package Task_S1_07_Annotations.N1_Ex02;

public class Main {
    public static void main(String[] args) {

        OnlineWorker onlineWorker2 = new OnlineWorker("Santiago", "Santos", 20.60);
        OnsiteWorker onsiteWorker2 = new OnsiteWorker("Mario", "Perez", 18.9);

        double onsiteHours = 324.7;
        double onlineHours = 254.6;

        double onlineSalary = onlineWorker2.calculateSalary(onlineHours);
        double onsiteSalary = onsiteWorker2.calculateSalary(onsiteHours);

        @SuppressWarnings("deprecation")
        double onlineSalaryExtra = onlineWorker2.calculateSalaryExtra(28.45);

        @SuppressWarnings("deprecation")
        double onsiteSalaryExtra = onsiteWorker2.calculateSalaryExtra(20.45);

        System.out.println("El salario del online worker " + onlineWorker2.getFirstName() + " " + onlineWorker2.getLastName() + " es: " + onsiteSalary + " euros");
        System.out.println("El salario del onsite worker " + onsiteWorker2.getFirstName() + " " + onsiteWorker2.getLastName() + " es: " + onlineSalary + " euros");

        System.out.println(onlineSalaryExtra);
    }
}
