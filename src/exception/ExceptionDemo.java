package exception;

public class ExceptionDemo {
	public void f() throws MyException {
		System.out.println("this is my exception");
	}
	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		try {
			ed.f();
		} catch (MyException e) {
			System.out.println("catch it");
		}
	}
}
