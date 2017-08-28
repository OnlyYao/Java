package designpatterns.singleton;

/**
 * ����ģʽ֮"����ʽ"
 */
// ����ģʽ��ֻ��һ��ʵ�����ṩ˽�еĹ��췽�����;�̬�Ļ�ȡʵ������
//Ӧ�ó�������һ���౻ȫ��ʹ�ã��ұ�Ƶ���Ĵ��������٣���ô����ʹ�õ���ģʽ��
public class Singleton {

	private static Singleton singleton = new Singleton();
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		return singleton;
	}
}
