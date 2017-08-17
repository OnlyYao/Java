package innerclass;

/**
 * @author Breeze
 * 
 * ���壺��һ����Ķ���ŵ���һ������߷������ڲ���������ڲ��ࡣ
 * 
 * �㷺�����ϵ��ڲ�����������֣���Ա�ڲ��ࡢ�ֲ��ڲ��ࡢ�����ڲ��ࡢ��̬�ڲ��� 
 * ��Ա�ڲ��ࣺ��Ϊ��ͨ��һ���ڲ��࣬���Ķ���λ����һ������ڲ�
 * �ֲ��ڲ��ࣺ�ֲ��ڲ����Ƕ�����һ����������һ��������������࣬���ͳ�Ա�ڲ�����������ھֲ��ڲ���ķ��ʽ����ڷ����ڻ��߸��������ڡ�
 * �����ڲ��ࣺ������ƽʱд�����õ����ģ��ڱ�д�����¼�ʱʹ�������ڲ��಻��������Ҵ����������ά����
 * 
 * �ڲ��������Է�����Χ���������г�Ա��ӵ������Χ�������Ԫ�صķ���Ȩ�ޡ�
 * 
 * 
 */
public class InnerClass {

	private int i = 11;//�ⲿ���˽�з���
	public static double j = 23; 

	class Contents {//��Ա�ڲ���

		public void say() {
			System.out.println(i);
			System.out.println(j);
		}
	}
	public static void main(String[] args) {
		InnerClass ic = new InnerClass();
		InnerClass.Contents contents = ic.new Contents();//�����ڲ���ķ�ʽ
		contents.say();
	}
}
