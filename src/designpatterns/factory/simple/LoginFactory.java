package designpatterns.factory.simple;

/*
 * 简单工厂模式是类的创建模式，又叫静态工厂方法模式。简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例（行为上跟策略模式有些类似）
 * 
 * 简单工厂模式在什么样的情况下使用呢?
 * 就拿登录功能来说，假如应用系统需要支持多种登录方式如：口令认证、域认证（口令认证通常是去数据库中验证用户，而域认证则是需要到微软的域中验证用户）。
 * 那么自然的做法就是建立一个各种登录方式都适用的接
 * 
 * 优点：
 * 该模式的核心是工厂类，这个类含有必要的逻辑，可以决定在什么时候创建哪种登录验证类的实例，而调用者可以免除直接创建责任。而这种做法也实现了对责任的分割，
 * 当引入新的调用方法时，也无需修改调用者
 * 
 * 缺点：
 * 这个类集中了所有创建实例的逻辑，当它不工作时，整个系统都会受到影响
 */

/**
 * 生产各种Login实例的工厂
 */
public class LoginFactory {

	public static Login factoty(String loginType) {
		if (loginType.equals("password")) {
			return new PasswordLogin();
		} else if (loginType.equals("domain")) {
			return new DomainLogin();
		} else {
			throw new RuntimeException("未找到相关的登录方式");
		}
	}
}
