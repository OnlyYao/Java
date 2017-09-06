package thread.concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * JDK1.5֮��������һ���µ����������Ⱥ͹����̵߳�API��Executor��ܾ������е�һ������ʹ�����̳߳ػ��ƣ�ͨ���ÿ���������߳�������ִ�С����������˲�����̵Ĳ���
 * Executor ��ܰ������̳߳أ�Executor��Executors��ExecutorService��CompletionService��Future��Callable �ȡ�
 * 
 * ExecutorService���̳���Executor�ӿ�
 * ����һ��ʹ��ExecutorService��ʵ�ֺ͹�����߳�
 * ExecutorService ���������ڰ�������״̬�����С��رա���ֹ��
 * 
 * Executors �ṩ��һϵ�й����������ڴ����̳߳أ����ص��̳߳ض�ʵ���� ExecutorService �ӿڣ�
 * public static ExecutorService newFixedThreadPool(int nThreads)
 * �����̶���Ŀ�̵߳��̳߳ء�
 * 
 * public static ExecutorService newCachedThreadPool()
 * ����һ���ɻ�����̳߳أ�����execute��������ǰ������̣߳�����߳̿��ã�����������߳�û�п��õģ��򴴽�һ������ �̲���ӵ����С���ֹ���ӻ������Ƴ���Щ���� 60 ����δ��ʹ�õ��̡߳�
 * 
 * public static ExecutorService newSingleThreadExecutor()
 * ����һ�����̻߳���Executor��
 *
 * public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)
 * ����һ��֧�ֶ�ʱ�������Ե�����ִ�е��̳߳أ���������¿��������Timer�ࡣ
 * 
 * ����
 * ��ƽ����ÿ���߳���ռ����˳��Ϊ�Ⱥ����lock������˳�����λ�ȡ�����������ŶӳԷ���
 * �ǹ�ƽ����ÿ���߳���ռ����˳�������lock������˳���޹أ�������á�
 */
public class ConcurrentOne {

	public static void main(String[] args) {
		ExecutorService fixedExecutor = Executors.newFixedThreadPool(5);//��������5���̵߳��̳߳�
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
		 System.out.println(Thread.currentThread().getName() + "��������");
	 }
 }