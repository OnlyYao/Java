package designpatterns.observer.one;

public class Test {
	
	public static void main(String[] args) {
		//�����������
		ConcreteSubject cs = new ConcreteSubject();
		//�����۲��߶���
		ContreteObserver co = new ContreteObserver();
		ConcreteObserver co1 = new ConcreteObserver();
		//ע��۲��߶������������
		cs.attch(co);
		cs.attch(co1);
		//����������״̬
		cs.notifyAll("֪ͨ���������粻�ϿΣ�");
	}
}
