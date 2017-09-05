package designpatterns.factory.fone;

import java.util.ArrayList;
import java.util.List;

/**
 * ��ģʽ
 * ��������
 */
public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<>();
	
	/**
	 * ��ӹ۲���
	 * @param observer �۲���
	 */
	public void attch(Observer observer) {
		observers.add(observer);
		System.out.println("attch a new observer!");
	}
	
	/**
	 * ɾ���۲���
	 * @param observer �۲���
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * ֪ͨ����ע��Ĺ۲���
	 * @param newState ��״̬
	 */
	public void notify(String newState) {
		for (Observer observer : observers) {
			observer.update(newState);
		}
	}
}
