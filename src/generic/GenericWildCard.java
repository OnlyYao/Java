package generic;

import java.util.ArrayList;
import java.util.List;

/**
 * ͨ��� 
 * 
 * List<T> ��Ҫ�������巺������߷��ͷ���
 * 
 * List<?> ��Ҫ����ʹ�ö���õķ�������߷��ͷ�����
 * 
 * List<?>��List<Object>�ǲ�ͬ�ģ���ΪList<?>������δ֪�ģ���List<Object>ȷ�������;���Object����ôList�оͿ��Է�Object�������ࡣ
 * ���⣬��������δ֪�����ԾͲ���ͨ��new ArrayList<?>������һ��������Ϊ����������֪�������������ʲô��
 * 
 */

public class GenericWildCard {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<? extends Number> fruits = new ArrayList<Integer>();
//		fruits.add(1);//Ϊʲô�������Ԫ��(��null)����Ϊ�������Ჶ��һ�������String���ͣ����Ǳ�����������String����������һ����ʱ�Ĵ��š�
	}
}
