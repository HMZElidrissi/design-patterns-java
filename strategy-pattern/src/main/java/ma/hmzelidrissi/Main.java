package ma.hmzelidrissi;

public class Main {
  public static void main(String[] args) {
    Context context = new Context();
    context.performOperation();
    context.setStrategy(new StrategyImpl2());
    context.performOperation();
    context.setStrategy(new StrategyImpl3());
    context.performOperation();
  }
}
