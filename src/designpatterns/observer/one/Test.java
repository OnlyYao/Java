package designpatterns.observer.one;

public class Test {
	
	public static void main(String[] args) {
		//创建主题对象
		ConcreteSubject cs = new ConcreteSubject();
		//创建观察者对象
		ContreteObserver co = new ContreteObserver();
		ConcreteObserver co1 = new ConcreteObserver();
		//注册观察者对象到主题对象上
		cs.attch(co);
		cs.attch(co1);
		//主题对象更新状态
		cs.notifyAll("通知：今天下午不上课！");
	}
}
