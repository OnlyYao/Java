package thread.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

/*
 * ��������
 */
public class BlockQueue {
	
	public static void main(String[] args) throws Exception {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(20);//����һ������Ϊ20�Ķ���
		for (int i = 1; i < 30; i++) {
			queue.put("��Ԫ�ر�ţ�" + i);
			System.out.println("�������������¼�Ԫ�أ�" + i);
			if (i > 19) {
				System.out.println("�������������Ƴ�Ԫ�أ�" + queue.take());
			}
		}
		System.out.println("���н���");
	}
}
