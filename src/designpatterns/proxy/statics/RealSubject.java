package designpatterns.proxy.statics;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("��������������Ķ��������ҵ�Request����...");
	}
}
