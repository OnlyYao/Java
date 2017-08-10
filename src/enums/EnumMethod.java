package enums;

/**
 * 在枚举元素中可以自定义方法来重写枚举类中的方法。
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

	public static void main(String[] args) {
		for (EnumMethod method : EnumMethod.values()) {
			method.getInfo();
		}
	}
}
