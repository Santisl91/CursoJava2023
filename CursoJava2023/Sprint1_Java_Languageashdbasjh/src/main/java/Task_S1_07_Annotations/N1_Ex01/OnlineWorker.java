package Task_S1_07_Annotations.N1_Ex01;

public class OnlineWorker extends Worker {

    private static double gasoline = 50.0;

    public OnlineWorker() {
    }
    public OnlineWorker(String firstName, String lastName, double priceHour) {
        super(firstName, lastName, priceHour);
    }

    @Override
    protected double calculateSalary(double workedHours) {
        return super.calculateSalary(workedHours) + gasoline;
    }
}
