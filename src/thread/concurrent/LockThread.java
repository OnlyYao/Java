package thread.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
 * ReentrantLock：可重用锁
 * lock()
 * lockInterruptibly()
 * tryLock()
 * unLock()
 * 
 * ReentrantLock构造方法中有一个Condition参数，Condition与synchronized中的wait()方法、notify()方法类似，它提供以下方法：
 * await()
 * signal()
 * signalAll()
 * awaitUninterruptibly() 
 */
public class LockThread implements Runnable{

	private Data data = new Data();
	Lock locker = new ReentrantLock();// 非公平锁，在构造器内加个true即为公平锁

	// 使用Lock锁来实现同步操作，需要手动的上锁和解锁
	public void run() {
		locker.lock();
		try {
			int temp = data.getData();
			++temp;
			data.setData(temp);
			System.out.println(Thread.currentThread().getName() + ":::" + data.getData());
		} finally {
			locker.unlock();
		}
	}

	public static void main(String[] args) {
		LockThread lockThread = new LockThread();
		for (int i = 0; i < 5; i++) {// 创建5个线程
			Thread thread = new Thread(lockThread);
			thread.start();
		}
	}
}

class Data {
	private int data;
	
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
}
