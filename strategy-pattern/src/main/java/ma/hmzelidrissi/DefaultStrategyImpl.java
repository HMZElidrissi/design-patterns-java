package ma.hmzelidrissi;

public class DefaultStrategyImpl implements Strategy {
    @Override
    public void performOperation() {
        System.out.println("Performing the operation using the default implementation of the strategy");
    }
}
