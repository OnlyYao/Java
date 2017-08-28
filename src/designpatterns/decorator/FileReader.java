package designpatterns.decorator;

/**
 * 装饰者
 */
public class FileReader extends Reader {

	public void close() {
		System.out.println("装饰者的close方法");
	}
}
