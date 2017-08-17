package enums;

/**
 * ��ö��Ԫ���п����Զ��巽������дö�����еķ�����
 * 
 * ö����Ҫ��������Զ���ķ��������뽫�÷�������Ϊstatic����
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
		System.out.println("�������Լ��ķ������ٺ�...");
	}
	public static void main(String[] args) {
		for (EnumMethod method : EnumMethod.values()) {
			method.getInfo();
		}
		EnumMethod.getMethod();
	}
}
