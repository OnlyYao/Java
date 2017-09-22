package reflect;

import java.lang.reflect.Method;

/*
 * ����(Reflection)��Java ���򿪷����Ե�����֮һ�������������е� Java �����ȡ�������Ϣ�����ҿ��Բ�����������ڲ�����
 * ����ĺ�����JVM������ʱ�Ŷ�̬���������÷���/�������ԣ�������Ҫ���ȣ�д�����ʱ�������ڣ�֪�����ж�����˭��
 * ��������Ҫ����;�ǿ�������ͨ�ÿ�ܡ�
 * 
 * Java��������Ҫ�ṩ���¹��ܣ�
 * 1.������ʱ�ж�����һ�������������ࣻ
 * 2.������ʱ��������һ����Ķ���
 * 3.������ʱ�ж�����һ���������еĳ�Ա�����ͷ�����ͨ�������������Ե���private��������
 * 4.������ʱ��������һ������ķ���
 * 
 * ����Ļ������ã�
 * 1.���Class����
 * 2.�ж��Ƿ�Ϊĳ�����ʵ��
 * 3.����ʵ��
 * 4.��ȡ����
 * 5.��ȡ��������Ϣ
 * 6.��ȡ��Ա������Ϣ
 * 7.���÷���
 * 
 * ��ȡĳ��Class����ķ������ϣ���Ҫ�����¼���������
 * 1.getDeclaredMethods()�����������ӿ����������з���������������������Ĭ�ϣ��������ʺ�˽�з��������������̳еķ�����
 * 2.getMethods()��������ĳ��������й��ã�public��������������̳���Ĺ��÷�����
 * 3.getMethod��������һ���ض��ķ��������е�һ������Ϊ�������ƣ�����Ĳ���Ϊ�����Ĳ�����ӦClass�Ķ���
 */
public class ReflectOne {
	public static void main(String[] args) throws Exception {
		//��ȡClass���������ַ�ʽ
		Class<?> foo = Foo.class;
		
		Class<?> foo1 = Class.forName("reflect.Foo");
		
		Foo f = new Foo();
		Class<?> foo2 = f.getClass();
		
		//��ȡFoo���ʵ��
		Object instance = foo2.newInstance();
		//��ȡ���еķ���
		Method[] declaredMethods = foo.getDeclaredMethods();
		for (Method method : declaredMethods) {
			System.out.println(method.getName());
		}
		System.out.println("--------------");
		//��ȡpublic����
		Method[] methods = foo1.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
		System.out.println("--------------");
		//��ȡ�ض��ķ���
		Method method = foo2.getMethod("print", int.class,int.class);
		System.out.println(method.getName());
		System.out.println("--------------");
		//ʹ��invoke()�������÷���
		method.invoke(instance, 1,2);
	}
}

