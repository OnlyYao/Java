package generic;

/**
 * 泛型，参数化类型。即，将类型参数化. 
 * 使用泛型的目的：1、用来指定容器要持有什么类型的对象。 2、编写更通用的代码
 * 
 * 泛型的局限性：1、基本类型无法作为参数，只能使用其包装类型。
 * 
 * 
 * static方法无法访问一个泛型类的类型参数，所以如果想让static方法使用泛型，那就必须将其变成泛型方法。
 * 
 * 在使用泛型类创建对象时，我们需要在创建对象时就指出参数类型的具体值，而使用泛型方法不需要指明参数类型，因为编译器会帮我们推断出具体的类型。类型推断只对赋值操作有效。
 */


// 泛型类
public class GenericOne<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GenericOne(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericOne<String> g = new GenericOne<String>(new String());
		g.getT();
	}

	/*
	 * 未使用泛型时 ，存储不同类型的对象，Object就充当了 "参数化的类型T"，因为每个类都是Object的子类
	  private Object o;
	  
	  public GenericOne(Object o) { this.o = o; }
	  
	  public Object getO() { return o; }
	  
	  public void setO(Object o) { this.o = o; }
	  
	  public static void main(String[] args) { 
	      GenericOne one = new GenericOne(new String()); 
	      String s = (String) one.getO(); 
	      one.setO("oooo"); 
	      Integer i = (Integer) one.getO(); 
	      
	   }   
	 */
}
