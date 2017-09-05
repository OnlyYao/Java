package designpatterns.factory.ftwo;

public class ConcreteObserver implements Observer {

	private String observerState;
//	private String name;
	
	@Override
	public void update(Subject subject) {
//		this.name = ((ConcreteSubject) subject).getName(); 
		this.observerState = ((ConcreteSubject) subject).getState(); 
		System.out.println(observerState);
	}
}
