package enums;

/**
 * ��ö��Ԫ���п����Զ��巽������дö�����еķ�����
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
