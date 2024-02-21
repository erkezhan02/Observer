public class Main {
    public static void main(String[] args) {
        ConcreteSafe safe = new ConcreteSafe();

        IObserver security = new ConcreteObserver("Security");
        IObserver owner = new ConcreteObserver("Owner");

        safe.registerObserver(security);
        safe.registerObserver(owner);

        safe.notifyObserver(safe.getSafeCondition());
        safe.openSafe();
        safe.notifyObserver(safe.getSafeCondition());
    }
}
