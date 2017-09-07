package thread.concurrent;

import java.util.concurrent.ArrayBlockingQueue;

/*
 * 阻塞队列
 */
public class BlockQueue {
	
	public static void main(String[] args) throws Exception {
		ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(20);//创建一个容量为20的队列
		for (int i = 1; i < 30; i++) {
			queue.put("新元素编号：" + i);
			System.out.println("向阻塞队列中新加元素：" + i);
			if (i > 19) {
				System.out.println("从阻塞队列中移除元素：" + queue.take());
			}
		}
		System.out.println("运行结束");
	}
}
