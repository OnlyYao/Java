package generic;

/**
 * 泛型方法：将泛型参数置于返回值之前，这种操作同泛型类，只是一种语法格式，不必纠结其为什么要这样放置。
 */
public class GenericMethods {

	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}

	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f(1);
		gm.f("aaa");
		gm.f(1L);
	}
}
