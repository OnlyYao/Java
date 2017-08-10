package enums;

/**
 * 枚举类中的构造方法是不能用public和protected修饰，只能用private或者friendly修饰。 
 * 
 * ordinal()方法返回一个int值，这是每一个enum实例在声明时的次序，从0开始。
 * valueOf()方法根据给定的名称返回相应的enum实例，如果不存会抛出异常。enum类中并不存在该方法，它是由编译器添加的静态方法。
 * 
 * 枚举除了不能继承外，我们基本上可以将它看做一个普通的常规的类，它甚至可以有main方法.
 * 为什么不能继承了呢？
 * 因为枚举类默认继承了Enum类，由于Java不支持多继承，所以就不能继承只能实现啦。
 */
public enum EnumOne {

//	ONE,//这是一个enum的实例，使用values()方法可以遍历enum的实例。
//	TWO,
//	THREE,
	
	/**
	 * 一般来说我们希望每个枚举实例能够返回对自身的描述，而不仅仅只是默认的toString()实现，这只能返回枚举实例的名称，
	 * 为此，你可以提供一个构造器，专门负责处理这个额外的信息，然后添加一个方法，返回这个描述信息。
	 * 
	 * 枚举类的实例默认是static类型。
	 * 
	 * java 要求必须先定义enum实例，再定义方法和属性。
	 */
	Spring(1,"this is spring,beautiful!"),
	SUMMER(2,"this is summer,hot!"),
	FALL(3,"this is fall,beautiful!"),
	WINTER(4,"this is winter,cold!");
	
	private int nums;
	
	private String description;
	
	private EnumOne(int nums,String description) {
		this.nums = nums;
		this.description = description;
	}
	
	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static void main(String[] args) {
		for (EnumOne enumOne : EnumOne.values()) {
			System.out.print(enumOne.getDescription());
			System.out.println(enumOne.getNums());
		}
	}
}
