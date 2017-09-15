package designpatterns.factory.simple;

public class PasswordLogin implements Login {

	@Override
	public boolean verify(String name, String password) {
		System.out.println("PasswordLogin login success");
		return true;
	}
}
