package designpatterns.singleton;

/**
 * 单例模式之"饿汉式"
 */
// 单例模式：只有一个实例，提供私有的构造方法，和静态的获取实例的类
//应用场景：当一个类被全局使用，且被频繁的创建和销毁，那么可以使用单例模式。
public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
