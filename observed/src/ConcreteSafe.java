import java.util.ArrayList;
import java.util.List;

public class ConcreteSafe implements ISafe{
    private List<IObserver> observers = new ArrayList<>();
    private String safeCondition = "Safe is closed.";

    @Override
    public void registerObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for (IObserver observer : observers) {
            observer.update(message);
        }
    }

    public void openSafe(){
        this.safeCondition = "!!! The safe was opened !!!";
    }

    public String getSafeCondition(){
        return this.safeCondition;
    }

}
