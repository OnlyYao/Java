package string;

/**
 * String 对象是不可变的，查看源码可以看到踏实别声明为final的类
 * 由String的方法可以看出，当改变字符串的内容时，String都会返回一个新的对象，如果没有改变，String方法只是指向原对象的引用而已
 * java中有一个专门处理格式化的类：Formatter
 * String中也有专门处理格式化的类，format().不过该方法的内部实现使用的也是Formatter类
 */
public class Immutable {

	public static String upCase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String q = "abc";
		System.out.println(q);
		String qq = upCase(q);
		System.out.println(qq);
		System.out.println(q);
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("dfgh");
		System.out.println(sBuilder.reverse());
		
		//格式化输出
		int x = 5;
		double y = 23.3;
		System.out.println("Row 1: [" + x +" " + y + "]");
		System.out.format("Row 1: [%d %f]\n",x, y);
		System.out.printf("Row 1: [%d %f]\n",x, y);
		
		//String的format方法
		int sx = 23;
		int sy = 54;
		String name = "tom";
		String s = String.format("%s spend $%d,and now he has $%d", name,sx,sy);
		System.out.println(s);
	}
}
