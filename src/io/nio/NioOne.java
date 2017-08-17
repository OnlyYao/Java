package io.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Java从JDK1.4开始引入NIO，目的是提高IO的性能。
 * 
 * NIO三个核心部分：
 * Channel、Buffer、Selector 
 * 
 * NIO中的Channel类似流，但是又有些不同：
 * 1、既可以从通道中读取数据，又可以写数据到通道。可是流的读写是单向的。
 * 2、IO是线程阻塞的，NIO是线程非阻塞的。
 * 
 * Buffer类似于内存块，既可以对他进行写的操作，也可以对其读取操作。
 * 
 * IO是面向流的操作，面向流意味着每次从流中读取一个或者多个字节，没有缓冲的地方，而且不能前后移动流中的数据。
 * NIO是面向缓冲的操作，它会将数据存储到缓冲中，然后操作该缓冲区
 * IO是阻塞流，当一个线程调用读或者写操作时，该线程被阻塞直到读或者写完成，在这期间该线程什么除了等待什么事情都做不了。
 * NIO是非阻塞流，当一个线程进行读或者写操作时，该线程有数据时就获取或者写，没有的话就可以去干其他的事情。
 */
public class NioOne {

	public static void main(String[] args) throws IOException {
		RandomAccessFile file = new RandomAccessFile("C:/text.txt", "rw");
		FileChannel fc = file.getChannel();
		ByteBuffer bb = ByteBuffer.allocate(48);//给容器分配48个字节的容量
		int byteRead = fc.read(bb);
		System.out.println(byteRead);//输出-1说明读取完毕
		System.out.println(bb);
		fc.close();
		file.close();
	}
}
