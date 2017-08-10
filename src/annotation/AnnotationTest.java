package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {

	/**
	 * 1������һ��ע�⡣
	 * 2����ָ�����ֶΡ���������������ʹ�ø�ע�⣨����ʹ�����ֶ��ϣ���
	 * 3��ͨ������ķ�ʽ��ȡ��ע�����Ե�ֵ ��
	 * 4������ȡ��������ֵ���õ�ʵ��������С�
	 * 5���������������ݿ��еı�һһ��Ӧ�Ļ�����ô���������ֵ�Ϳ������õ����ݿ�ı�������
	 */
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<?> au = AnnotationUser.class;
		Field[] field = au.getDeclaredFields();
		List<AnnotationUser> users = new ArrayList<>();
		for (Field field2 : field) {//��������ʹ�ø�ע��ı���
			AnnotationUser user = new AnnotationUser();
			AnnotationModel model = field2.getAnnotation(AnnotationModel.class);
			user.setName(model.name());
			user.setAge(model.age());
			users.add(user);
		}
		for (AnnotationUser annotationUser : users) {
			System.out.println(annotationUser.getName() + ":" + annotationUser.getAge());
		}
	}	
}
