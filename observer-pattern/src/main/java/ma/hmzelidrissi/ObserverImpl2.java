package ma.hmzelidrissi;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
  private List<String> history = new ArrayList<>();

  @Override
  public void update(String state) {
    System.out.println("====== I'm ObserverImpl2 ======");
    history.add(state);
    System.out.println("History: " + history);
    System.out.println("State updated to: " + state);
  }
}
