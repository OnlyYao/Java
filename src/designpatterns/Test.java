package designpatterns;

public class Test {

	public static void main(String[] args) {
		SubjImpl ss = new SubjImpl();
		ObserveImpl oo = new ObserveImpl("����ң");
		ObserveImpl oo1 = new ObserveImpl("���");
		ObserveImpl oo2 = new ObserveImpl("��Ң");
		
		ss.attach(oo);
		ss.attach(oo1);
		ss.attach(oo2);
		ss.notify("�ɽ�������");
	}
}
