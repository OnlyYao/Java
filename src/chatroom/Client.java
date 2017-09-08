package chatroom;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Scanner;

/*
 * 写，并能够获取服务端提供的其他客户端发送的消息
 */
public class Client {

	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8989));
			scanner = new Scanner(System.in);
			String str = scanner.nextLine();
			
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			buffer.put(("客户端：" + str).getBytes());
			buffer.flip();
			sChannel.write(buffer);
			sChannel.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
