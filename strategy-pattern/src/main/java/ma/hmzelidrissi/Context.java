package ma.hmzelidrissi;


public class Context {
  private Strategy strategy = new DefaultStrategyImpl(); // in order to have a default strategy

  public void performOperation() {
    System.out.println("--------- Starting the operation ---------");
    System.out.println("--------- Performing the operation ---------");
    strategy.performOperation();
    System.out.println("--------- Ending the operation ---------");
  }

  public void setStrategy(Strategy strategy) {
    this.strategy = strategy;
  }
}
