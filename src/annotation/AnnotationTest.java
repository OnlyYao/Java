package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class AnnotationTest {

	/**
	 * 1、声明一个注解。
	 * 2、在指定的字段、方法、或者类上使用该注解（假设使用在字段上）。
	 * 3、通过反射的方式获取到注解属性的值 。
	 * 4、将获取到的属性值设置到实体类对象中。
	 * 5、如果将对象和数据库中的表一一对应的话，那么对象的属性值就可以设置到数据库的表中啦。
	 */
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<?> au = AnnotationUser.class;
		Field[] field = au.getDeclaredFields();
		List<AnnotationUser> users = new ArrayList<>();
		for (Field field2 : field) {//遍历所有使用该注解的变量
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
