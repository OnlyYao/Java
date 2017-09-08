package chatroom;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/*
 * 提供服务
 * 功能：
 * 1、上线提示
 * 2、下线提示
 * 3、每个客户端在各自的窗口都能看到彼此发送的消息
 * 
 * 1.0：服务端仅能接收到一个客户端的消息，且不能进行回复
 * 
 */
public class Server {
	
	public static void main(String[] args) {
		try {
			ServerSocketChannel ssChannel = ServerSocketChannel.open();
			Selector selector = Selector.open();
			
			ssChannel.socket().bind(new InetSocketAddress(8989));
			ssChannel.configureBlocking(false);
			
			ssChannel.register(selector, SelectionKey.OP_ACCEPT);
			Iterator<SelectionKey> keys = selector.selectedKeys().iterator();
			while (keys.hasNext()) {
				SelectionKey key = keys.next();
				if (key.isAcceptable()) {
					SocketChannel sChannel = ssChannel.accept();
					sChannel.configureBlocking(false);
					sChannel.register(selector, SelectionKey.OP_READ);
				} else if (key.isReadable()) {
					SocketChannel readChannel = (SocketChannel)key.channel();
					ByteBuffer buffer = ByteBuffer.allocate(1024);
					int temp = 0;
					while ((temp = readChannel.read(buffer)) != -1) {
						System.out.println(new String(buffer.array(), 0, temp));
					}
				}
				keys.remove();
			}
			
			selector.close();
			ssChannel.close();
			
			
			
			
//			SocketChannel sChannel = sChannel;
//			
//			ByteBuffer buffer = ByteBuffer.allocate(1024);
//			int temp = 0;
//			while ((temp = sChannel.read(buffer)) != -1) {
//				System.out.println(new String(buffer.array(), 0, temp));
//			}
//			sChannel.close();
//			ssChannel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
