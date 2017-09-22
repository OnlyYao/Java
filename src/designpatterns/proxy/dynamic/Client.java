package designpatterns.proxy.dynamic;

import java.lang.reflect.Proxy;

/**
 * JDK¶¯Ì¬´úÀí
 * @author ayao
 *
 */
public class Client {

	public static void main(String[] args) {
		Subject real = new RealSubject();
		DynamicProxy dynamic = new DynamicProxy(real);
		ClassLoader classLoader = real.getClass().getClassLoader();
		Subject subject = (Subject)Proxy.newProxyInstance(classLoader, new Class[]{Subject.class}, dynamic);
		subject.request();
	}
}
