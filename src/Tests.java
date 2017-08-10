public class Tests {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<?> class1 = Test.class;
		ATest annotation = class1.getAnnotation(ATest.class);
		Test test = new Test();
		test.setTableName(annotation.name());
		test.setTableType(annotation.type());
		test.setTableVersion(annotation.version());
		System.out.println(test.toString());
	}
}
