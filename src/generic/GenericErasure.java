package generic;

import java.util.ArrayList;

/**
 * ���Ͳ���
 * 
 * �ڳ�������ʱ��List��String��Integer���������Ͷ��ᱻ���������ǵ�"ԭ��"���ͣ���List
 * 
 * ԭ��
 * ������Ϊ�˼���δʹ�÷��͵�Java���汾����Ϊ���Ͳ���Java����ʱ���е���ɲ��֣�����Java1.5�汾�Ժ�ų��ֵģ����Ϊ�˼���Java1.5֮ǰ�İ汾��
 * �Ͳ����˲����������еİ취��
 * 
 * �ڳ��������еķ������Ͷ������������滻Ϊ���ǵķǷ����Ͻ磬��List<T>����������ֱ�ӽ�������ΪList����δָ���߽�����ͱ�����������ΪObject 
 */
public class GenericErasure {

	
	public static void main(String[] args) {
		Class<?> c1 = new ArrayList<String>().getClass();
		Class<?> c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2);//˼���������洢�Ķ������Ͳ�ͬ��Ϊʲô���ص���true��?
	}
}
