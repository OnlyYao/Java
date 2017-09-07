package thread.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


/*
 * ReentrantLock����������
 * lock()
 * lockInterruptibly()
 * tryLock()
 * unLock()
 * 
 * ReentrantLock���췽������һ��Condition������Condition��synchronized�е�wait()������notify()�������ƣ����ṩ���·�����
 * await()
 * signal()
 * signalAll()
 * awaitUninterruptibly() 
 */
public class LockThread implements Runnable{

	private Data data = new Data();
	Lock locker = new ReentrantLock();// �ǹ�ƽ�����ڹ������ڼӸ�true��Ϊ��ƽ��

	// ʹ��Lock����ʵ��ͬ����������Ҫ�ֶ��������ͽ���
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
		for (int i = 0; i < 5; i++) {// ����5���߳�
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
