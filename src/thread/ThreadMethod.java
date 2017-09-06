package thread;

/*
 * JVM中存在两种线程：用户线程和守护线程
 * 守护线程：指的是用户程序在运行时后台提供的一种通用服务的线程，比如JVM的GC线程，守护线程会一直存在直到用户线程退出
 * 设置守护线程：setDaemon()
 * 
 * 线程中常用的方法
 * setPriority() sleep() wait() yield() join() run() start()
 * 
 * 线程的五种状态：
 * 创建：new关键字创建一个线程，此时只有仅有JVM为其分配内存和初始化成员变量
 * 就绪：当线程对象调用start()方法后，该线程就处于就绪状态，等待CPU的调用
 * 运行：当该线程获取CPU后，就会调用run()方法，执行run方法里面的方法体，此时线程处于运行状态
 * 阻塞：当处于运行状态的线程失去所占有的CPU资源后，该线程变进入了阻塞状态
 * 死亡：线程run()方法执行完毕，正常退出，或者发生异常或者错误，此时线程就死亡了，死亡的线程是不能被再次执行的
 * 
 * start(),启动一个线程，此时线程处于可运行状态，等待CPU的调用
 * run(),和普通的方法一样。可被重复调用
 * sleep(),使线程处于睡眠状态，当睡眠时间结束后，该线程就会重新处于可运行状态(RUNNABLE)，在睡眠期间，该线程不会释放对象锁，sleep()是Thread的静态方法
 * wait(),使当前线程暂停并释放出对象锁，需要使用notify()、notifyAll()方法使其变成重新可用状态。这三个方法用于协调多个线程对共享数据的存取，所以必须在synchronized语句块中使用(用于线程间的通信)
 * yield(),使当前线程让出占有的CPU，但是让出的时间不定。yield()方法只会将CPU占有权让给同级或者比它优先级高的线程也可能是还是它自己，因此在让出线程前会检测当前时候含有相同或者高优先级的线程，如果没有该线程会继续运行。该线程不会释放对象锁
 * join(),将指定线程加入到当前线程，可以将两个交互执行的线程变成顺序执行的线程，比如B线程调用A线程的join方法，那么B线程会一直阻塞到A线程执行完毕才会执行(哪个线程调用join方法哪个线程就会先执行完毕，然后再执行接下来的线程)
 * setPriority(),设置线程的优先级，范围1~10，MIN_PRIORITY、NORM_PROIORITY、MAX_PRIORITY
 */
public class ThreadMethod implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "：：：" + i);
//			try {
//				Thread.sleep(1000);//设置睡眠
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadMethod method = new ThreadMethod();
		Thread threadA = new Thread(method, "A线程");
		Thread threadB = new Thread(method, "B线程");
		threadA.start();
		threadA.join(1000);//设置join方法
		threadB.start();
		}
	}
