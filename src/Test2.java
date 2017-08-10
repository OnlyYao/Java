
public class Test2 {

	public static final String A = "aaa";

	public static final String B = "bbb";
	
	public static void main(String[] args) {
		System.setProperty("a", A);
		System.setProperty("b", B);
		System.out.println(System.getProperty("a"));
		System.out.println(System.getProperty("b"));
	}
	
}
