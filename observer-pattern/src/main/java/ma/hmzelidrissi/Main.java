package ma.hmzelidrissi;

public class Main {
  public static void main(String[] args) {
    ObservableImpl observable = new ObservableImpl();
    Observer observer1 = new ObserverImpl();
    Observer observer2 = new ObserverImpl2();
    observable.subscribe(observer1);
    observable.subscribe(observer2);
    observable.setState("Hello");
    observable.unsubscribe(observer1);
    observable.setState("World");
  }
}
