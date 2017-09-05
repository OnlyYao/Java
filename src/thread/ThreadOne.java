package thread;

/*
 * 每个线程可以并行执行不同的任务。
 * 
 * 每个线程都有单独的栈内存用来存储本地数据。
 * 
 * 线程：是进程中负责程序执行的执行单元。可以把线程比作是一个人，多个线程就是多个人。
 * 目的：使用多线程的目的是更充分的利用CPU的资源。
 * 多线程的实现方式：继承Thread类、实现Runnable接口(最常用)、实现Callable接口(一般不使用)。
 * 默认需要实现run()方法，里面定义要执行的任务，调用start()启动线程的创建。但是线程创建后并不一定会立即执行，它需要等待CPU的调度。
 * 线程的五种状态：创建、就绪、运行、阻塞、销毁
 * 
 * 获取到一个对象的锁就可以访问该对象，否则是无法访问该对象的。
 * 
 * 实现runnable接口比继承Thread类所具有的优势：
 * 1、更适合多个相同代码的线程去处理同一资源
 * 2、避免多线程的局限
 * 3、线程池中只能放入实现runnable接口和实现Callable接口类的线程，继承Thread类的线程不能放入到线程池中。
 * 至于具体该使用哪种方式要根据具体的应用场景来选择。
 * 
 * sleep()和wait()的区别：
 * sleep()是Thread类的方法，wait()方法是Object的方法
 * sleep()方法和wait()方法都是都是使当前的线程让出CPU，不同的是wait()需要别的线程调用notify()/notifyAll()方法唤醒，线程会释放持有的锁，
 * 而sleep()到达时间后会自动变成可运行状态，线程不会释放锁。
 * 
 * 注意：想要设计一个良好的并发程序，理解Java内存模型是非常重要的。因此需学习Java内存模型(JVM)
 */

public class ThreadOne implements Runnable {
	
	private String name;
	
	public ThreadOne(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(name + ":" + i);
		}
	}
	
	public static void main(String[] args) {
		ThreadOne thread = new ThreadOne("C");
		ThreadOne thread2 = new ThreadOne("D");
		
		Thread thread3 = new Thread(thread);
		Thread thread4 = new Thread(thread2);
		
		thread3.start();
		thread4.start();
	}
}
