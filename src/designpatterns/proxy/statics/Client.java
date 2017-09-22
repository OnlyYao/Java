package designpatterns.proxy.statics;

public class Client {

	public static void main(String[] args) {
		RealSubject rs = new RealSubject();
		ProxySubject proxy = new ProxySubject(rs);
		proxy.request();
	}
}
