package string;

/**
 * 正则表达式 
 * \\d表示一位数字
 * 表示一个或多个之前的表达式，使用+，如果是不是 可能有一个负号，后面跟着一位或多位数字 -?\\d+
 * Pattern、Matcher比较常用于正则表达式的语句中
 */
public class StringRex {

	public static void main(String[] args) {
		System.out.println("-13465".matches("-?\\d+"));
		System.out.println("5689".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
	}
	
}
