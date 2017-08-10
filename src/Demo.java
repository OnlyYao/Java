import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {

	
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		if (list != null) {
			for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
				System.out.println(iterator.next());
			}
		}

		String a = "abc";
		String b = String.format("this is %s!", a);
		System.out.println(b);
		
		Map<String, String> m = new HashMap<>();
		m.put("11", "一一");
		m.put("22", "二二");
		Map<Integer, Map<String, String>> map = new HashMap<>();
		map.put(1, m);
		for (Integer integer : map.keySet()) {
			for (String string : map.get(integer).keySet()) {
				System.out.println(string + ":" + m.get(string));
			}
		}

		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "a");
		map2.put(2, "b");
		map2.put(3, "c");
		List<Map<Integer, String>> list2 = new ArrayList<>();
		list2.add(map2);
		for (Map<Integer, String> map3 : list2) {
			String aa = map3.get(1); 
			String bb = map3.get(2); 
			String cc = map3.get(3); 
			System.out.println(aa + bb + cc);
		}
		
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(4);
		set.add(2);
		System.out.println(set);
		
		
	}

	public static <T> T getInstance(Class<T> clazz) throws InstantiationException, IllegalAccessException {
		return clazz.newInstance();
	}
}
