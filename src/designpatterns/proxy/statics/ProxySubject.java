package designpatterns.proxy.statics;

public class ProxySubject implements Subject {

	private Subject subject;
	
	public ProxySubject(Subject subject) {
		this.subject = subject;
	}
	
	@Override
	public void request() {
		System.out.println("过滤请求");
		subject.request();
		System.out.println("完成请求");
	}
}
