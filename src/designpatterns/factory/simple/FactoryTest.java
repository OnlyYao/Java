package designpatterns.factory.simple;


public class FactoryTest {

	public static void main(String[] args) {
		String loginType = null;
//		loginType = "password";
	    loginType = "domain";
		String name = "name";
		String password = "password";
		
		Login login = LoginFactory.factoty(loginType);
		boolean result = login.verify(name, password);
		if (result) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}
