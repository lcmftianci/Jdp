package observerPattern;

/*
 * 观察者模式是一个一对多的依赖关系，比如说Button的注册事件
 * */

public interface Subject {
	public void registerObserver(WeObserver osv);
	public void removeObserver(WeObserver osv);
	public void notifyObserver();
}
