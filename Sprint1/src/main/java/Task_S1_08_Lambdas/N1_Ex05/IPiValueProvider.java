package Task_S1_08_Lambdas.N1_Ex05;
@FunctionalInterface
public interface IPiValueProvider {

    double getPiValue();

    static IPiValueProvider of(double value) {
        return () -> value;
    }
}
