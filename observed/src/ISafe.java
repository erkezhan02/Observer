public interface ISafe {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver(String message);
}
