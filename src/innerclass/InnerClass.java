package innerclass;

/**
 * @author Breeze
 * 
 * 定义：将一个类的定义放到另一个类或者方法的内部，这就是内部类。
 * 
 * 广泛意义上的内部类包含这四种：成员内部类、局部内部类、匿名内部类、静态内部类 
 * 成员内部类：最为普通的一种内部类，他的定义位于另一个类的内部
 * 局部内部类：局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
 * 匿名内部类：是我们平时写代码用的最多的，在编写监听事件时使用匿名内部类不但方便而且代码更加容易维护。
 * 
 * 内部类对象可以访问外围类对象的所有成员，拥有其外围类的所有元素的访问权限。
 * 
 * 
 */
public class InnerClass {

	private int i = 11;//外部类的私有方法
	public static double j = 23; 

	class Contents {//成员内部类

		public void say() {
			System.out.println(i);
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		InnerClass.Contents contents = ic.new Contents();//创建内部类的方式
		contents.say();
	}
}
