package innerclass;

/**
 * @author Breeze
 * 
 * 定义：可以将一个类的定义放到另一个类的内部，这就是内部类。
 * 内部类对象可以访问外围类对象的所有成员。拥有其外围类的所有元素的访问权限。 
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
