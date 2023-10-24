package Task_S1_07_Annotations.N1_Ex02;

public class OnsiteWorker extends Worker {
    private static double flatInternetRate = 100.0;

    public OnsiteWorker() {
    }

    public OnsiteWorker(String firstName, String lastName, double priceHour) {
        super(firstName, lastName, priceHour);
    }

    @Override
    protected double calculateSalary(double workedHours) {
        return super.calculateSalary(workedHours) + flatInternetRate;
    }

    @Deprecated
    protected double calculateSalaryExtra(double workedHoursExtra) {
        return super.calculateSalaryExtra(workedHoursExtra);
    }
}
