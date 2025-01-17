package ma.hmzelidrissi;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl implements Observable {
    private List<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){
            o.update(this.state);
        }
    }

    public void setState(String state){
        this.state = state;
        notifyObservers();
    }

    public String getState(){
        return state;
    }
}
