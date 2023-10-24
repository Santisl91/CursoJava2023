package Task_S1_07_Annotations.N1_Ex02;

public class Worker {

    String firstName;
    String lastName;
    double priceHour;

    public Worker() {
    }

    public Worker(String firstName, String lastName, double priceHour) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.priceHour = priceHour;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPriceHour() {
        return priceHour;
    }

    public void setPriceHour(double priceHour) {
        this.priceHour = priceHour;
    }

    protected double calculateSalary(double workedHours){
        return workedHours*priceHour;
    }
    protected double calculateSalaryExtra(double workedHoursExtra){
      return workedHoursExtra*priceHour;
    }
}


