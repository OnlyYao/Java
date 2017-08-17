package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * ���㴴���������ʵ�����߽ӿ�ʱ��һ�����а����ظ��ԵĹ�������ô�Ϳ��Կ���ʹ��ע���������Զ����ù��̡�
 * 
 * û��Ԫ�ص�ע���Ϊ���ע��
 * 
 * �����ĸ�Ԫע������������ע��ģ�
 * 1��@Target �����������ע�⽫Ӧ�õ�ʲô�ط�(�ֶΡ��������໹�ǽӿ�)
 * 2��@Retention ��������ע�����ĸ�������ã���Դ������(SOURCE)�����ļ���(CLASS)������ʱ(RUNTIME)
 * 3��@Document ����ע�������Javadoc��
 * 4��@Inherited ��������̳и����е�ע��
 * 
 * ���ֻ��һ�����ԣ�����Ϊvalue����ֵʱ���Բ�ָ����������
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface AnnoationOne {

	public int id();
	
	public String name();
	
}
