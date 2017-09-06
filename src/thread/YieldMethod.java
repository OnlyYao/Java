package thread;

/*
 * yield()������CPU��ռ��Ȩ�ó���ͬ���������ȼ��ߵ��̻߳�ȡ��CPUռ��Ȩ�ĸ��ʽϴ󣬵�������˵���ȼ��͵��̻߳�ȡ������ֻ�Ǹ��ʵ͵���ѡ�
 */
public class YieldMethod implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "������" + i);
			Thread.yield();//���þ�̬��yield����
		}
	}
	
	public static void main(String[] args) {
		YieldMethod yield = new YieldMethod();
		YieldMethod yield2 = new YieldMethod();
		Thread threadA = new Thread(yield, "�߳�A"); 
		Thread threadB = new Thread(yield2, "�߳�B"); 
		
		threadB.setPriority(8);//�������ȼ�
		threadA.start();
		threadB.start();
	}
}
