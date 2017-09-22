package reflect;

import java.lang.reflect.Method;

/*
 * 反射(Reflection)是Java 程序开发语言的特征之一，它允许运行中的 Java 程序获取自身的信息，并且可以操作类或对象的内部属性
 * 反射的核心是JVM在运行时才动态加载类或调用方法/访问属性，它不需要事先（写代码的时候或编译期）知道运行对象是谁。
 * 反射最重要的用途是开发各种通用框架。
 * 
 * Java反射框架主要提供以下功能：
 * 1.在运行时判断任意一个对象所属的类；
 * 2.在运行时构造任意一个类的对象；
 * 3.在运行时判断任意一个类所具有的成员变量和方法（通过反射甚至可以调用private方法）；
 * 4.在运行时调用任意一个对象的方法
 * 
 * 反射的基本作用：
 * 1.获得Class对象
 * 2.判断是否为某个类的实例
 * 3.创建实例
 * 4.获取方法
 * 5.获取构造器信息
 * 6.获取成员变量信息
 * 7.调用方法
 * 
 * 获取某个Class对象的方法集合，主要有以下几个方法：
 * 1.getDeclaredMethods()方法返回类或接口声明的所有方法，包括公共、保护、默认（包）访问和私有方法，但不包括继承的方法。
 * 2.getMethods()方法返回某个类的所有公用（public）方法，包括其继承类的公用方法。
 * 3.getMethod方法返回一个特定的方法，其中第一个参数为方法名称，后面的参数为方法的参数对应Class的对象
 */
public class ReflectOne {
	public static void main(String[] args) throws Exception {
		//获取Class对象有三种方式
		Class<?> foo = Foo.class;
		
		Class<?> foo1 = Class.forName("reflect.Foo");
		
		Foo f = new Foo();
		Class<?> foo2 = f.getClass();
		
		//获取Foo类的实例
		Object instance = foo2.newInstance();
		//获取所有的方法
		Method[] declaredMethods = foo.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		System.out.println("--------------");
		//获取public方法
		Method[] methods = foo1.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("--------------");
		//获取特定的方法
		Method method = foo2.getMethod("print", int.class,int.class);
		System.out.println(method.getName());
		System.out.println("--------------");
		//使用invoke()方法调用方法
		method.invoke(instance, 1,2);
	}
}

