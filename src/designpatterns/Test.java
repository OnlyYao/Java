package designpatterns;

public class Test {

	public static void main(String[] args) {
		SubjImpl ss = new SubjImpl();
		ObserveImpl oo = new ObserveImpl("ÀîåĞÒ£");
		ObserveImpl oo1 = new ObserveImpl("Áé¶ù");
		ObserveImpl oo2 = new ObserveImpl("»ÆÒ¢");
		
		ss.attach(oo);
		ss.attach(oo1);
		ss.attach(oo2);
		ss.notify("ÏÉ½£ÆæÏÀ´«");
	}
}
