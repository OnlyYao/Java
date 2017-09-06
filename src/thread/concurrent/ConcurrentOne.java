package thread.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK1.5之后，引入了一堆新的启动、调度和管理线程的API，Executor框架就是其中的一个，其使用了线程池机制，通过该框架来控制线程启动、执行、结束，简化了并发编程的操作
 * Executor 框架包括：线程池，Executor，Executors，ExecutorService，CompletionService，Future，Callable 等。
 * 
 * ExecutorService：继承于Executor接口
 * 我们一般使用ExecutorService来实现和管理多线程
 * ExecutorService 的生命周期包括三种状态：运行、关闭、终止。
 * 
 * Executors 提供了一系列工厂方法用于创先线程池，返回的线程池都实现了 ExecutorService 接口：
 * public static ExecutorService newFixedThreadPool(int nThreads)
 * 创建固定数目线程的线程池。
 * 
 * public static ExecutorService newCachedThreadPool()
 * 创建一个可缓存的线程池，调用execute将重用以前构造的线程（如果线程可用）。如果现有线程没有可用的，则创建一个新线 程并添加到池中。终止并从缓存中移除那些已有 60 秒钟未被使用的线程。
 * 
 * public static ExecutorService newSingleThreadExecutor()
 * 创建一个单线程化的Executor。
 *
 * public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)
 * 创建一个支持定时及周期性的任务执行的线程池，多数情况下可用来替代Timer类。
 * 
 * 锁：
 * 公平锁：每个线程抢占锁的顺序为先后调用lock方法的顺序依次获取锁，类似于排队吃饭。
 * 非公平锁：每个线程抢占锁的顺序跟调用lock方法的顺序无关，随机调用。
 */
public class ConcurrentOne {

	public static void main(String[] args) {
		ExecutorService fixedExecutor = Executors.newFixedThreadPool(5);//创建存有5个线程的线程池
//		ExecutorService cachedExecutor = Executors.newCachedThreadPool();
//		ExecutorService singleExecutor = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			fixedExecutor.execute(new Test());
			System.out.println(i);
		}
	}
}
 class Test implements Runnable {
	 @Override
	public void run() {
		 System.out.println(Thread.currentThread().getName() + "被调用啦");
	 }
 }