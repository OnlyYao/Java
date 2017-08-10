package innerclass;

/**
 * @author Breeze
 * 
 * ���壺���Խ�һ����Ķ���ŵ���һ������ڲ���������ڲ��ࡣ
 * �ڲ��������Է�����Χ���������г�Ա��ӵ������Χ�������Ԫ�صķ���Ȩ�ޡ� 
 */
public class InnerClass {

	class Contents {
		private int i = 11;
		public int value() {
			return i;
		}
	}
	
	class Destination {
		private String label;
		public Destination(String labels) {
			this.label = labels;
		}
		public String readLabel() {
			return label;
		}
	}
	
	public void ship(String test) {
		Destination destination = new Destination(test);
		System.out.println(destination.label);
	}
	
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		ic.ship("this is test");
	}
}
