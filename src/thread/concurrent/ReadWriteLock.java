package thread.concurrent;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/*
 * ReadWriteLock��д����������д������������Ч�ļ�������������������ܡ�
 * Ϊʲô��д������������������أ�
 * ������֪���������ǲ���Թ�����Դ������ȫ��в�ģ���ʱ��������������̣߳�A�߳̽��ж�ȡ��ʱ��B�߳�ֻ�ܵ��������ܻ�������ж�ȡ���������ֵȴ���Ȼ�ǲ�����ġ�
 * ����������£���д���������������߳�ͬʱ���Խ��ж�ȡ���������ǿ��ǵ�������Դ�İ�ȫ��дд������д��������Ȼ����Ҫǰһ�߳��ͷ�����һ���̲߳��ܽ��н��в�����
 * (���Ӻ�������)
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
