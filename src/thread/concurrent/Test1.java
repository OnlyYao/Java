package thread.concurrent;

import java.util.ArrayList;
import java.util.Vector;

public class Test1 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();// 非线程安全容器
		Vector<Integer> vector = new Vector<>();// 线程安全容器 

		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);

		long start1 = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			vector.add(i);
		}
		long end1 = System.currentTimeMillis();
		System.out.println(end1 - start1);
	}
}
