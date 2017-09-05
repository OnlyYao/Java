package designpatterns.factory.fone;

/**
 * ��������
 */
public class ConcreteSubject extends Subject{

	private String state;
	
	public String getState() {
		return state;
	}
	
	public void notifyAll(String newState) {
		this.state = newState;
		System.out.println("subject state:" + state);
		this.notify(state);
	}
}
