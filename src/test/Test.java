package test;

public enum Test {

	SPRING(1, "spring"),

	SUMMER(2, "hot");
	
	private int id;

	private String name;

	private Test(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public static void getInfo() {
		System.out.println("do something!");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		String x = Test.SPRING.getName();
		System.out.println(x + " " + Test.SUMMER.getId());
		Test.getInfo();
	}
}
