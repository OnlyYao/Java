package designpatterns.factory.fone;

public class ConcreteObserver1 implements Observer {

	@Override
	public void update(String state) {
		System.out.println("one:" + state);
	}
}
