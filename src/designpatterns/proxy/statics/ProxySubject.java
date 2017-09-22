package designpatterns.proxy.statics;

public class ProxySubject implements Subject {

	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		System.out.println("��������");
		subject.request();
		System.out.println("�������");
	}
}
