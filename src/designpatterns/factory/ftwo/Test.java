package designpatterns.factory.ftwo;

public class Test {

	public static void main(String[] args) {
		//创建主题对象
		ConcreteSubject cs = new ConcreteSubject();
		//创建观察者对象
		ConcreteObserver co = new ConcreteObserver();
		//注册观察者
		cs.attch(co);
		//通知
		cs.notifyAll("通知：今天下午不上课!","黄老师");
	}
}