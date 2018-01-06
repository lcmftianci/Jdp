package strategyPattern;
import jsrlog.JsrLog;

/*
 * ����ģʽ����һ������һ������
 * �ص㣺
 * ��������Ϊ�ֿ�
 * ������ټ̳�
 * ˵����
 * ����ģʽ�������㷨�壬�ֱ��װ������������֮����Ի����滻����ģʽ���㷨�ı仯������ʹ���㷨�Ŀͻ�
 * */

public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuacl() {
		quackBehavior.quack();
	}
	
	public void swim() {
		JsrLog.logout("All ducks float,  Event decoys!\n");
	}
	
	//��̬�趨������Ϊ
	public void setFlyBehavior(FlyBehavior fb){
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
	
}
