package designpatterns.factory.ftwo;

public class Test {

	public static void main(String[] args) {
		//�����������
		ConcreteSubject cs = new ConcreteSubject();
		//�����۲��߶���
		ConcreteObserver co = new ConcreteObserver();
		//ע��۲���
		cs.attch(co);
		//֪ͨ
		cs.notifyAll("֪ͨ���������粻�Ͽ�!","����ʦ");
	}
}