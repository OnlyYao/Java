package annotation;

public class AnnotationUser {

	@AnnotationModel
	private String name;

	@AnnotationModel(age = 11)
	private int age;

	@AnnotationModel(name="jack",age=18)
	private String address;

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
