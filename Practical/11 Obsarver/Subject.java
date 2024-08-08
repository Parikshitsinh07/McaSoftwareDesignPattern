
public interface Subject {
	void registerObserver(Subscriber subscriber);
    void removeObserver(Subscriber subscriber);
    void notifyObservers();
}
