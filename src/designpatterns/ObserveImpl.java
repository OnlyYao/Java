package designpatterns;

public class ObserveImpl implements Observe {

	private String name;
	
	public ObserveImpl(String name) {
		this.name = name;
	}
	@Override
	public void update(String message) {
		System.out.println(name + "-" + message);
	}
}
