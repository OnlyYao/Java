package generic;

import java.util.HashSet;
import java.util.Set;

public class GenericMethods3 {

	public static <T> Set<T> union(Set<T> a,Set<T> b) {
		Set<T> result = new HashSet<>(a);//初始化a到result中
		result.addAll(b);//将b添加到a中
		return result;
	}
}
