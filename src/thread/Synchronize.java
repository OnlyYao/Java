package thread;

/*
 * synchronized：线程同步，是共享资源时为了保证共享资源的安全性而采取的一个措施，线程同步一般是指让线程中的某一些操作进行同步就可以了，如读取共享资源
 * 线程同步是让一个线程将同步方法或者同步代码块完全执行完毕后，才让另一个线程进入同步方法或者同步代码块运行
 * 
 * Java如何做到线程同步呢？
 * 1、在需要同步的方法前加synchronized关键字
 * 2、使用synchronized关键字对需要同步的代码块进行同步
 * 3、使用java.util.concurrent.lock包中的Lock对象
 */
public class Synchronize implements Runnable{

	private Data data = new Data();
	
	/*同步方法
	@Override
	public synchronized void run() {//可以将synchronized关键字注释掉对比一下运行的结果
		//对Data中的num进行操作
		int temp = data.getData();//<--B获取的data也为0
		++temp;//<--A获取的data=0。B+1
		data.setNum(temp);//<--A在temp上+1，所以A获取的值为1，set()方法将B的值设置进去
		System.out.println(Thread.currentThread().getName() + "：：：" + data.getData());
	}*/
	
	//同步代码块
	@Override
	public void run() {
		synchronized (this) {//对需要同步的代码块进行同步
			int temp = data.getData();
			++temp;
			data.setNum(temp);
			System.out.println(Thread.currentThread().getName() + "：：：" + data.getData());
		}
	}
	
	public static void main(String[] args) {
		Synchronize syn = new Synchronize();
		for (int i = 0; i < 5; i++) {
			Thread thread = new Thread(syn);
			thread.start();
		}
	}
}

class Data {
	private int num = 0;
	
	public int getData() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
}
