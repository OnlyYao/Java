package designpatterns.decorator;

/*
 * Java JDK中IO流使用的就是装饰者模式，同时这也是为什么使用"包装流"时只需要关闭最外层流的close()方法即可。
 * 
 * 使用装饰者模式必须要继承/实现同一个抽象类/接口。
 * 在被装饰者中需要引入装饰者的引用  
 * 
 */
public class ReaderTest {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new FileReader());
		br.close();
	}
}
