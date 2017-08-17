package io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Java��JDK1.4��ʼ����NIO��Ŀ�������IO�����ܡ�
 * 
 * NIO�������Ĳ��֣�
 * Channel��Buffer��Selector 
 * 
 * NIO�е�Channel����������������Щ��ͬ��
 * 1���ȿ��Դ�ͨ���ж�ȡ���ݣ��ֿ���д���ݵ�ͨ�����������Ķ�д�ǵ���ġ�
 * 2��IO���߳������ģ�NIO���̷߳������ġ�
 * 
 * Buffer�������ڴ�飬�ȿ��Զ�������д�Ĳ�����Ҳ���Զ����ȡ������
 * 
 * IO���������Ĳ�������������ζ��ÿ�δ����ж�ȡһ�����߶���ֽڣ�û�л���ĵط������Ҳ���ǰ���ƶ����е����ݡ�
 * NIO�����򻺳�Ĳ��������Ὣ���ݴ洢�������У�Ȼ������û�����
 * IO������������һ���̵߳��ö�����д����ʱ�����̱߳�����ֱ��������д��ɣ������ڼ���߳�ʲô���˵ȴ�ʲô���鶼�����ˡ�
 * NIO�Ƿ�����������һ���߳̽��ж�����д����ʱ�����߳�������ʱ�ͻ�ȡ����д��û�еĻ��Ϳ���ȥ�����������顣
 */
public class NioOne {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("C:/text.txt", "rw");
		FileChannel fc = file.getChannel();
		ByteBuffer bb = ByteBuffer.allocate(48);//����������48���ֽڵ�����
		int byteRead = fc.read(bb);
		System.out.println(byteRead);//���-1˵����ȡ���
		System.out.println(bb);
		fc.close();
		file.close();
	}
}
