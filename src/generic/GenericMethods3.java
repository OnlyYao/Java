package generic;

import java.util.HashSet;
import java.util.Set;

public class GenericMethods3 {

	public static <T> Set<T> union(Set<T> a,Set<T> b) {
		Set<T> result = new HashSet<>(a);//��ʼ��a��result��
		result.addAll(b);//��b��ӵ�a��
		return result;
	}
}
