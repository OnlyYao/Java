package enums;

/**
 * 在枚举元素中可以自定义方法来重写枚举类中的方法。
 * 
 * 枚举类要想调用它自定义的方法，必须将该方法定义为static方法
 */
public enum EnumMethod {

	GREEN {
		@Override
		public void getInfo() {
			System.out.println("green");
		}
	},
	RED {
		@Override
		public void getInfo() {
			System.out.println("red");
			
		}
	};

	public void getInfo() {}

	public static void getMethod() {
		System.out.println("这是我自己的方法，嘿嘿...");
	}
	public static void main(String[] args) {
		for (EnumMethod method : EnumMethod.values()) {
			method.getInfo();
		}
		EnumMethod.getMethod();
	}
}
