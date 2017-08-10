package collection.list;

import java.util.Collection;
import java.util.HashSet;

//Á·Ï°2
public class SimpleCollection {
 
	public static void main(String[] args) {
		Collection<Integer> c = new HashSet<>();
		for(int i=0;i<10;i++) {
			c.add(i);
		}
		for (Integer integer : c) {
			System.out.println(integer);
		}
	}
}
