package designpatterns.factory.fone;

public class Test {
	
	public static void main(String[] args) {
		//�����������
		ConcreteSubject cs = new ConcreteSubject();
		//�����۲��߶���
		ContreteObserver co = new ContreteObserver();
		ConcreteObserver1 co1 = new ConcreteObserver1();
		//ע��۲��߶������������
		cs.attch(co);
		cs.attch(co1);
		//����������״̬
		cs.notifyAll("֪ͨ���������粻�ϿΣ�");
	}
}
