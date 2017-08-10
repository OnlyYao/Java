package generic;

/**
 * �߽�
 * 
 * �߽�ʹ������������ڷ��͵Ĳ�����������������������������ʹ�������ǿ�ƹ涨���Ϳ���Ӧ�õ����ͣ�������Ǳ�ڵ�һ������Ҫ��Ч��������԰����Լ��ı߽�����
 * �����÷�������Ϊ�����Ƴ���������Ϣ������ʹ���ޱ߽�ķ��Ͳ���ֻ�ܵ���Object�ķ��������н�ķ��Ͳ��������Ե�����"����"�ķ�����
 * 
 * List<? extends Number>˵��List�а��������Ϳ�������Number��������
 * List<? super Number>˵��List�а��������Ϳ�������Number����
 */
public class GenericBorder<T> {

	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public static void main(String[] args) {

		GenericBorder<String> border = new GenericBorder<>();
		border.setObj("a");//����set()���͵ļ�鲻�Ǳ���ģ���Ϊ��������������
		border.getObj();
	}
	
}
