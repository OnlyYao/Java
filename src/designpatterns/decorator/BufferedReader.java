package designpatterns.decorator;

/**
 * 被装饰者
 */
public class BufferedReader extends Reader {

	private Reader reader;
	
	public BufferedReader(Reader reader) {
		this.reader = reader;
	}
	
	public void close() {
		System.out.println("扩展close方法一");
		reader.close();
		System.out.println("扩展close方法二");
	}
}
