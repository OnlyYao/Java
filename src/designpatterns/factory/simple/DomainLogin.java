package designpatterns.factory.simple;

public class DomainLogin implements Login{

	@Override
	public boolean verify(String name, String password) {
		System.out.println("DomainLogin login success!");
		return true;
	}
}
