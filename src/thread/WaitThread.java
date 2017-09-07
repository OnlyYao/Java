package thread;

/*
 * wait() notify() notifyAll()������������Object�ķ���
 * ��Ҫ�����������߳�֮���ͨ��
 */
public class WaitThread {

	public final static Object object = new Object();
	
	public static class A implements Runnable {
		@Override
		public void run() {
			synchronized (object) {
				System.out.println(Thread.currentThread().getName() + "��ʼִ����");
				try {
					System.out.println(Thread.currentThread().getName() + "��ʼ����ȴ�״̬");
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "�������");
			}
		}
	} 
	
	public static class B implements Runnable {
		@Override
		public void run() {
			synchronized (object) {
				System.out.println(Thread.currentThread().getName() + "Ҳ��ʼִ����");
				object.notify();
				System.out.println(Thread.currentThread().getName() + "�������");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		Thread threadA = new Thread(a);
		Thread threadB = new Thread(b);
		threadA.start();
		threadB.start();
	}
}
