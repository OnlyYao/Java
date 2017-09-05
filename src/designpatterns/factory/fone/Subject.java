package designpatterns.factory.fone;

import java.util.ArrayList;
import java.util.List;

/**
 * 推模式
 * 抽象主题
 */
public abstract class Subject {
	
	private List<Observer> observers = new ArrayList<>();
	
	/**
	 * 添加观察者
	 * @param observer 观察者
	 */
	public void attch(Observer observer) {
		observers.add(observer);
		System.out.println("attch a new observer!");
	}
	
	/**
	 * 删除观察者
	 * @param observer 观察者
	 */
	public void detach(Observer observer) {
		observers.remove(observer);
	}
	
	/**
	 * 通知所有注册的观察者
	 * @param newState 新状态
	 */
	public void notify(String newState) {
		for (Observer observer : observers) {
			observer.update(newState);
		}
	}
}
