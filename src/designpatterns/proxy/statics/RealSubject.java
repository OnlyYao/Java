package designpatterns.proxy.statics;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("我是真正被请求的对象，这是我的Request方法...");
	}
}
