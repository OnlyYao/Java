package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {
		Map<Integer, Map<String, String>> map = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();
		map2.put("a", "a");
		map2.put("ab", "b");
		// map2.clear();
		map.put(1, map2);
		for (Integer s : map.keySet()) {
			for (String i : map.get(s).keySet()) {
				System.out.println(i + ":" + map.get(s).get(i));
			}
		}
		List<Map<String, String>> list = new ArrayList<>();
		list.add(map2);
		for (Map<String, String> map3 : list) {
			for (String key : map3.keySet()) {
				System.out.println(key + ":" + map3.get(key));
			}
		}
		//Ç¶Ì×Java¼¯ºÏ
		List<Integer> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(1);
		list2.add(1);
		list2.add(1);
		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(3);
		list3.add(3);
		list3.add(3);
		list3.add(3);
		list3.add(3, 44);
		list2.addAll(list3);
		System.out.println(list2);
		Set<Integer> set = new HashSet<>();
		set.add(6);
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		System.out.println(set);
		
	}
}
