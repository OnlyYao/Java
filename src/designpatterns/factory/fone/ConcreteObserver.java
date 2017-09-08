package designpatterns.factory.fone;

public class ConcreteObserver implements Observer {

	@Override
	public void update(String state) {
		System.out.println("one:" + state);
	}
}
