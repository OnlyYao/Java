package generic;

public class InterfaceImpl implements GenericInterface<Integer> {

	private int count = 0;

	@Override
	public Integer next() {
		return fib(count++);
	}
	
	public int fib(int n) {
		if (n < 2) {
			return 1;
		}
		return fib(n - 2) + fib(n - 1);
	}
	
	public static void main(String[] args) {
		InterfaceImpl ii = new InterfaceImpl();
		for (int i = 0; i < 18; i++) {
			System.out.println(ii.next());
		}
	}
}
