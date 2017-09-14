package designpatterns.observer.one;

/*
 * 具体观察者
 */
public class ContreteObserver implements Observer{

	//观察者的状态
	private String observerState;
	
	/**
	 * 更新观察者的状态，使其与主题状态保持一致
	 */
	@Override
	public void update(String state) {
		this.observerState = state;
		System.out.println("OBSERVER'S NEW STATE：" + observerState);
	}
}
