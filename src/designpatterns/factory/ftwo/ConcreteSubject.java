package designpatterns.factory.ftwo;

public class ConcreteSubject extends Subject{

	private String state;
	
	private String name;
	
	public String getName() {
		return name;
	}
	
	public String getState() {
		return state;
	}
	
	public void notifyAll(String newState, String name) {
		this.state = newState;
		this.name = name;
		System.out.println("主题状态为：" + state + "  " + "名字为：" + name);
		this.notifyObserver();
	}
}
