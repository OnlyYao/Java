package thread;

/*
 * ÿ���߳̿��Բ���ִ�в�ͬ������
 * 
 * ÿ���̶߳��е�����ջ�ڴ������洢�������ݡ�
 * 
 * �̣߳��ǽ����и������ִ�е�ִ�е�Ԫ�����԰��̱߳�����һ���ˣ�����߳̾��Ƕ���ˡ�
 * Ŀ�ģ�ʹ�ö��̵߳�Ŀ���Ǹ���ֵ�����CPU����Դ��
 * ���̵߳�ʵ�ַ�ʽ���̳�Thread�ࡢʵ��Runnable�ӿ�(���)��ʵ��Callable�ӿ�(һ�㲻ʹ��)��
 * Ĭ����Ҫʵ��run()���������涨��Ҫִ�е����񣬵���start()�����̵߳Ĵ����������̴߳����󲢲�һ��������ִ�У�����Ҫ�ȴ�CPU�ĵ��ȡ�
 * �̵߳�����״̬�����������������С�����������
 * 
 * ��ȡ��һ����������Ϳ��Է��ʸö��󣬷������޷����ʸö���ġ�
 * 
 * ʵ��runnable�ӿڱȼ̳�Thread�������е����ƣ�
 * 1�����ʺ϶����ͬ������߳�ȥ����ͬһ��Դ
 * 2��������̵߳ľ���
 * 3���̳߳���ֻ�ܷ���ʵ��runnable�ӿں�ʵ��Callable�ӿ�����̣߳��̳�Thread����̲߳��ܷ��뵽�̳߳��С�
 * ���ھ����ʹ�����ַ�ʽҪ���ݾ����Ӧ�ó�����ѡ��
 * 
 * sleep()��wait()������
 * sleep()��Thread��ķ�����wait()������Object�ķ���
 * sleep()������wait()�������Ƕ���ʹ��ǰ���߳��ó�CPU����ͬ����wait()��Ҫ����̵߳���notify()/notifyAll()�������ѣ��̻߳��ͷų��е�����
 * ��sleep()����ʱ�����Զ���ɿ�����״̬���̲߳����ͷ�����
 * 
 * ע�⣺��Ҫ���һ�����õĲ����������Java�ڴ�ģ���Ƿǳ���Ҫ�ġ������ѧϰJava�ڴ�ģ��(JVM)
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
