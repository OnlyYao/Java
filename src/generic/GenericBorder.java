package generic;

/**
 * 边界
 * 
 * 边界使得你可以在用于泛型的参数类型上设置限制条件，尽管这使得你可以强制规定泛型可以应用的类型，但是其潜在的一个更重要的效果是你可以按照自己的边界类型
 * 来调用方法，因为擦除移除了类型信息，所以使用无边界的泛型参数只能调用Object的方法，而有界的泛型参数，可以调用其"父类"的方法。
 * 
 * List<? extends Number>说明List中包含的类型可能是其Number或其子类
 * List<? super Number>说明List中包含的类型可能是其Number或父类
 */
public class GenericBorder<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public static void main(String[] args) {

		GenericBorder<String> border = new GenericBorder<>();
		border.setObj("a");//对于set()类型的检查不是必须的，因为编译器会替你检查
		border.getObj();
	}
	
}
