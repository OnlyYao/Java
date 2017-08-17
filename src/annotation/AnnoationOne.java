package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 当你创建描述性质的类或者接口时，一旦其中包含重复性的工作，那么就可以考虑使用注解来简化与自动化该过程。
 * 
 * 没有元素的注解称为标记注解
 * 
 * 以下四个元注解是用来创建注解的：
 * 1、@Target 用来定义你的注解将应用到什么地方(字段、方法、类还是接口)
 * 2、@Retention 用来定义注解在哪个级别可用，在源代码中(SOURCE)、类文件中(CLASS)、运行时(RUNTIME)
 * 3、@Document 将此注解包含在Javadoc中
 * 4、@Inherited 允许子类继承父类中的注解
 * 
 * 如果只有一种属性，且名为value，则赋值时可以不指定属性名。
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AnnoationOne {

	public int id();
	
	public String name();
	
}
