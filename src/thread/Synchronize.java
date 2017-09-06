package thread;

/*
 * synchronized���߳�ͬ�����ǹ�����ԴʱΪ�˱�֤������Դ�İ�ȫ�Զ���ȡ��һ����ʩ���߳�ͬ��һ����ָ���߳��е�ĳһЩ��������ͬ���Ϳ����ˣ����ȡ������Դ
 * �߳�ͬ������һ���߳̽�ͬ����������ͬ���������ȫִ����Ϻ󣬲�����һ���߳̽���ͬ����������ͬ�����������
 * 
 * Java��������߳�ͬ���أ�
 * 1������Ҫͬ���ķ���ǰ��synchronized�ؼ���
 * 2��ʹ��synchronized�ؼ��ֶ���Ҫͬ���Ĵ�������ͬ��
 * 3��ʹ��java.util.concurrent.lock���е�Lock����
 */
public class Synchronize implements Runnable{

	private Data data = new Data();
	
	/*ͬ������
	@Override
	public synchronized void run() {//���Խ�synchronized�ؼ���ע�͵��Ա�һ�����еĽ��
		//��Data�е�num���в���
		int temp = data.getData();//<--B��ȡ��dataҲΪ0
		++temp;//<--A��ȡ��data=0��B+1
		data.setNum(temp);//<--A��temp��+1������A��ȡ��ֵΪ1��set()������B��ֵ���ý�ȥ
		System.out.println(Thread.currentThread().getName() + "������" + data.getData());
	}*/
	
	//ͬ�������
	@Override
	public void run() {
		synchronized (this) {//����Ҫͬ���Ĵ�������ͬ��
			int temp = data.getData();
			++temp;
			data.setNum(temp);
			System.out.println(Thread.currentThread().getName() + "������" + data.getData());
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
