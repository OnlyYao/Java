package designpatterns.decorator;

/*
 * Java JDK��IO��ʹ�õľ���װ����ģʽ��ͬʱ��Ҳ��Ϊʲôʹ��"��װ��"ʱֻ��Ҫ�ر����������close()�������ɡ�
 * 
 * ʹ��װ����ģʽ����Ҫ�̳�/ʵ��ͬһ��������/�ӿڡ�
 * �ڱ�װ��������Ҫ����װ���ߵ�����  
 * 
 */
public class ReaderTest {

	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new FileReader());
		br.close();
	}
}
