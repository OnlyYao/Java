package generic;

import java.util.ArrayList;

/**
 * 泛型擦除
 * 
 * 在程序运行时，List的String和Integer这两种类型都会被擦除成它们的"原生"类型，即List
 * 
 * 原因：
 * 擦除是为了兼容未使用泛型的Java类库版本，因为泛型不是Java出现时就有的组成部分，它是Java1.5版本以后才出现的，因此为了兼容Java1.5之前的版本，
 * 就采用了擦除这种折中的办法。
 * 
 * 在程序中所有的泛型类型都将被擦除，替换为他们的非泛型上界，即List<T>这样的类型直接将被擦除为List，而未指定边界的类型变量将被擦除为Object 
 */
public class GenericErasure {

	
	public static void main(String[] args) {
		Class<?> c1 = new ArrayList<String>().getClass();
		Class<?> c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);//思考：明明存储的对象类型不同，为什么返回的是true呢?
	}
}
