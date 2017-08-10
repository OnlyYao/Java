package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型方法能够和可变参数列表很好的共存
 */
public class GenericMethods2 {

	@SuppressWarnings("unchecked")
	public static <T> List<T> makeList(T... t) {
		List<T> list = new ArrayList<>();
		for (T args : t) {
			list.add(args);
		}
		return list;
	}
	
	public static void main(String[] args) {
		List<String> list = makeList("A");
		System.out.println(list);
		list = makeList("a","b","c");
		System.out.println(list);
		List<Integer> list2 = makeList(1,2,3,4);
		System.out.println(list2);
	}
}
