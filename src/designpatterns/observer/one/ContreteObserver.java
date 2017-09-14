package designpatterns.observer.one;

/*
 * ����۲���
 */
public class ContreteObserver implements Observer{

	//�۲��ߵ�״̬
	private String observerState;
	
	/**
	 * ���¹۲��ߵ�״̬��ʹ��������״̬����һ��
	 */
	@Override
	public void update(String state) {
		this.observerState = state;
		System.out.println("OBSERVER'S NEW STATE��" + observerState);
	}
}
