package thread.concurrent;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * ReadWriteLock读写分离锁，读写分离锁可以有效的减少锁竞争，以提高性能。
 * 为什么读写分离锁可以提高性能呢？
 * 答：我们知道读操作是不会对共享资源产生安全威胁的，此时如果有两个读的线程，A线程进行读取的时候B线程只能等其读完才能获得锁进行读取操作，这种等待显然是不合理的。
 * 在这种情况下，读写分离锁就允许多个线程同时可以进行读取操作，但是考虑到共享资源的安全，写写操作和写读操作仍然是需要前一线程释放锁下一个线程才能进行进行操作。
 * (例子好像不能用)
 */
public class ReadWriteLock {

	private static ReentrantReadWriteLock readWriteLock = new ReentrantReadWriteLock();
	private static Lock readLock = readWriteLock.readLock();
	private static Lock writeLock = readWriteLock.writeLock();
	private int value;

	public void handleRead(Lock locker) throws Exception {
		try {
			locker.lock();
			Thread.sleep(1000);
			System.out.println(value);
		} finally {
			locker.unlock();
		}
	}

	public void handleWrite(Lock locker, int index) throws Exception {
		try {
			locker.lock();
			Thread.sleep(1000);
			value = index;
		} finally {
			locker.unlock();
		}
	}

	public static void main(String[] args) {
		ReadWriteLock readWrite = new ReadWriteLock();
		Runnable readRunnable = new Runnable() {

			@Override
			public void run() {
				try {
					readWrite.handleRead(readLock);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};

		Runnable writeRunnable = new Runnable() {

			@Override
			public void run() {
				try {
					readWrite.handleWrite(writeLock, new Random().nextInt());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
	    
		for (int i = 0; i < 8; i++) {
			new Thread(readRunnable).start();;
		}
		
	    for (int i = 0; i < 10; i++) {
			new Thread(writeRunnable).start();
		}
	}
}
