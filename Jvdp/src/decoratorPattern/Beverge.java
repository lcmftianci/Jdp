package decoratorPattern;

/*
 * װ����ģʽ����̬�Ľ����θ��ӵ������ϣ���Ҫ��չ���ܣ�װ�����ṩ�˱ȼ̳и��е��Ե��������
 * */

public abstract class Beverge {
	String description = "Unknow Beverage";
	
	public String getDescription(){
		return description;
	}
	
	public abstract double cost();
}
