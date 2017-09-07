package thread;

/*
 * wait() notify() notifyAll()三个方法都是Object的方法
 * 主要作用是用于线程之间的通信
 */
public class WaitThread {

	public final static Object object = new Object();
	
	public static class A implements Runnable {
		@Override
		public void run() {
			synchronized (object) {
				System.out.println(Thread.currentThread().getName() + "开始执行了");
				try {
					System.out.println(Thread.currentThread().getName() + "开始进入等待状态");
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "任务结束");
			}
		}
	} 
	
	public static class B implements Runnable {
		@Override
		public void run() {
			synchronized (object) {
				System.out.println(Thread.currentThread().getName() + "也开始执行了");
				object.notify();
				System.out.println(Thread.currentThread().getName() + "任务结束");
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
