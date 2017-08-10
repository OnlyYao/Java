package enums;

public class TestEnum {

	public static void main(String[] args) {
		EnumOne[] values = EnumOne.values();
		for (EnumOne enumOne : values) {
			System.out.println(enumOne);
		}
	}
}
