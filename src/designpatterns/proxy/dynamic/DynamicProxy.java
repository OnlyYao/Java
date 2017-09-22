package designpatterns.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/*
 * JDK¶¯Ì¬´úÀí
 */
public class DynamicProxy implements InvocationHandler {

	private Object object;
	
	public DynamicProxy(Object object) {
		this.object = object;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(34);
		Object result = method.invoke(object, args);
		System.out.println(123);
		return result;
	}
}
