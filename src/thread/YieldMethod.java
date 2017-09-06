package thread;

/*
 * yield()方法，CPU的占有权让出，同级或者优先级高的线程获取的CPU占有权的概率较大，但并不是说优先级低的线程获取不到，只是概率低点而已。
 */
public class YieldMethod implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "：：：" + i);
			Thread.yield();//调用静态的yield方法
		}
	}
	
	public static void main(String[] args) {
		YieldMethod yield = new YieldMethod();
		YieldMethod yield2 = new YieldMethod();
		Thread threadA = new Thread(yield, "线程A"); 
		Thread threadB = new Thread(yield2, "线程B"); 
		
		threadB.setPriority(8);//设置优先级
		threadA.start();
		threadB.start();
	}
}
