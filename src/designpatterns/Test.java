package designpatterns;

public class Test {

	public static void main(String[] args) {
		SubjImpl ss = new SubjImpl();
		ObserveImpl oo = new ObserveImpl("ÀîåĞÒ£");
		ObserveImpl oo1 = new ObserveImpl("Áé¶ù");
		
		ss.attach(oo);
		ss.attach(oo1);
		ss.notify("ÏÉ½£ÆæÏÀ´«");
	}
}
