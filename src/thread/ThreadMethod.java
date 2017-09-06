package thread;

/*
 * JVM�д��������̣߳��û��̺߳��ػ��߳�
 * �ػ��̣߳�ָ�����û�����������ʱ��̨�ṩ��һ��ͨ�÷�����̣߳�����JVM��GC�̣߳��ػ��̻߳�һֱ����ֱ���û��߳��˳�
 * �����ػ��̣߳�setDaemon()
 * 
 * �߳��г��õķ���
 * setPriority() sleep() wait() yield() join() run() start()
 * 
 * �̵߳�����״̬��
 * ������new�ؼ��ִ���һ���̣߳���ʱֻ�н���JVMΪ������ڴ�ͳ�ʼ����Ա����
 * ���������̶߳������start()�����󣬸��߳̾ʹ��ھ���״̬���ȴ�CPU�ĵ���
 * ���У������̻߳�ȡCPU�󣬾ͻ����run()������ִ��run��������ķ����壬��ʱ�̴߳�������״̬
 * ����������������״̬���߳�ʧȥ��ռ�е�CPU��Դ�󣬸��̱߳����������״̬
 * �������߳�run()����ִ����ϣ������˳������߷����쳣���ߴ��󣬴�ʱ�߳̾������ˣ��������߳��ǲ��ܱ��ٴ�ִ�е�
 * 
 * start(),����һ���̣߳���ʱ�̴߳��ڿ�����״̬���ȴ�CPU�ĵ���
 * run(),����ͨ�ķ���һ�����ɱ��ظ�����
 * sleep(),ʹ�̴߳���˯��״̬����˯��ʱ������󣬸��߳̾ͻ����´��ڿ�����״̬(RUNNABLE)����˯���ڼ䣬���̲߳����ͷŶ�������sleep()��Thread�ľ�̬����
 * wait(),ʹ��ǰ�߳���ͣ���ͷų�����������Ҫʹ��notify()��notifyAll()����ʹ�������¿���״̬����������������Э������̶߳Թ������ݵĴ�ȡ�����Ա�����synchronized������ʹ��(�����̼߳��ͨ��)
 * yield(),ʹ��ǰ�߳��ó�ռ�е�CPU�������ó���ʱ�䲻����yield()����ֻ�ὫCPUռ��Ȩ�ø�ͬ�����߱������ȼ��ߵ��߳�Ҳ�����ǻ������Լ���������ó��߳�ǰ���⵱ǰʱ������ͬ���߸����ȼ����̣߳����û�и��̻߳�������С����̲߳����ͷŶ�����
 * join(),��ָ���̼߳��뵽��ǰ�̣߳����Խ���������ִ�е��̱߳��˳��ִ�е��̣߳�����B�̵߳���A�̵߳�join��������ôB�̻߳�һֱ������A�߳�ִ����ϲŻ�ִ��(�ĸ��̵߳���join�����ĸ��߳̾ͻ���ִ����ϣ�Ȼ����ִ�н��������߳�)
 * setPriority(),�����̵߳����ȼ�����Χ1~10��MIN_PRIORITY��NORM_PROIORITY��MAX_PRIORITY
 */
public class ThreadMethod implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + "������" + i);
//			try {
//				Thread.sleep(1000);//����˯��
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadMethod method = new ThreadMethod();
		Thread threadA = new Thread(method, "A�߳�");
		Thread threadB = new Thread(method, "B�߳�");
		threadA.start();
		threadA.join(1000);//����join����
		threadB.start();
		}
	}
