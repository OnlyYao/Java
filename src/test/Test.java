package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>();
		for (int i = 0; i <= 10000000; i++) {
			integers.add(i);
		}
		
		long start = System.currentTimeMillis();
		for (Iterator<Integer> integer = integers.iterator(); integer.hasNext();) {
			System.out.println(integer.next());
		}
		System.out.println("----------");
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		long starts = System.currentTimeMillis();
		for (Integer integer : integers) {
			System.err.println(integer);
		}
		System.out.println("----------");
		long ends = System.currentTimeMillis();
		System.out.println(ends - starts);
	}
}
