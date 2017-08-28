package designpatterns.decorator;

/**
 * ��װ����
 */
public class BufferedReader extends Reader {

	private Reader reader;
	
	public BufferedReader(Reader reader) {
		this.reader = reader;
	}
	
	public void close() {
		System.out.println("��չclose����һ");
		reader.close();
		System.out.println("��չclose������");
	}
}
