package observerPattern;

/*
 * �۲���ģʽ��һ��һ�Զ��������ϵ������˵Button��ע���¼�
 * */

public interface Subject {
	public void registerObserver(WeObserver osv);
	public void removeObserver(WeObserver osv);
	public void notifyObserver();
}
