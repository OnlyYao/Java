package collection.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> set = new HashSet<>();
		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 10000; i++) {
			set.add(random.nextInt(30));
		}
		System.out.println(set);
	}
}
