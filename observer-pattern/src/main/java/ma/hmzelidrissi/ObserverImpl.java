package ma.hmzelidrissi;

public class ObserverImpl implements Observer {
  @Override
  public void update(String state) {
    System.out.println("====== I'm ObserverImpl1 ======");
    System.out.println("State updated to: " + state);
  }

  // the pull method
  public void updatePull(Observable observable) {
    if (observable instanceof ObservableImpl obs) { // this technique is called pattern matching for instanceof in Java 16, obs will be the casted object
      System.out.println("====== I'm ObserverImpl1 ======");
      System.out.println("State updated to: " + obs.getState());
    }
  }
}
