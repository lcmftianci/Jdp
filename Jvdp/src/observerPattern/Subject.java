package observerPattern;

public interface Subject {
	public void registerObserver(WeObserver osv);
	public void removeObserver(WeObserver osv);
	public void notifyObserver();
}
