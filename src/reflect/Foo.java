package reflect;

class Foo {
	
	private String name;
	private int age;
	
	public void print(int a, int b) {
		System.out.println(a + b);
	}

	public String getName() {
		return name;
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
