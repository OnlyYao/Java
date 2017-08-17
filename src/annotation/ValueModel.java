package annotation;

public class ValueModel {

	@AnnoationValue(values=12)
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
