package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 通配符 
 * 
 * List<T> 主要用来定义泛型类或者泛型方法
 * 
 * List<?> 主要用来使用定义好的泛型类或者泛型方法。
 * 
 * List<?>和List<Object>是不同的，因为List<?>类型是未知的，而List<Object>确定了类型就是Object，那么List中就可以放Object及其子类。
 * 另外，由于类型未知，所以就不能通过new ArrayList<?>来创建一个对象，因为编译器并不知道具体的类型是什么。
 * 
 */

public class GenericWildCard {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<? extends Number> fruits = new ArrayList<Integer>();
//		fruits.add(1);//为什么不能添加元素(除null)？因为编译器会捕获一个具体的String类型，但是编译器不叫它String，而是起了一个临时的代号。
	}
}
