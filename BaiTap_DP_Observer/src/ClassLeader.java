import java.util.ArrayList;
import java.util.List;

public class ClassLeader implements Subject{
    private List<Observer> observers;
    private String message;

    public ClassLeader() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    public void notifyObservers(String message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
