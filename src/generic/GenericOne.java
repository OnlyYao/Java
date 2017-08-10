package generic;

/**
 * ���ͣ����������͡����������Ͳ�����. 
 * ʹ�÷��͵�Ŀ�ģ�1������ָ������Ҫ����ʲô���͵Ķ��� 2����д��ͨ�õĴ���
 * 
 * ���͵ľ����ԣ�1�����������޷���Ϊ������ֻ��ʹ�����װ���͡�
 * 
 * 
 * static�����޷�����һ������������Ͳ����������������static����ʹ�÷��ͣ��Ǿͱ��뽫���ɷ��ͷ�����
 * 
 * ��ʹ�÷����ഴ������ʱ��������Ҫ�ڴ�������ʱ��ָ���������͵ľ���ֵ����ʹ�÷��ͷ�������Ҫָ���������ͣ���Ϊ��������������ƶϳ���������͡������ƶ�ֻ�Ը�ֵ������Ч��
 */


// ������
public class GenericOne<T> {
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	public GenericOne(T t) {
		this.t = t;
	}

	public static void main(String[] args) {
		GenericOne<String> g = new GenericOne<String>(new String());
		g.getT();
	}

	/*
	 * δʹ�÷���ʱ ���洢��ͬ���͵Ķ���Object�ͳ䵱�� "������������T"����Ϊÿ���඼��Object������
	  private Object o;
	  
	  public GenericOne(Object o) { this.o = o; }
	  
	  public Object getO() { return o; }
	  
	  public void setO(Object o) { this.o = o; }
	  
	  public static void main(String[] args) { 
	      GenericOne one = new GenericOne(new String()); 
	      String s = (String) one.getO(); 
	      one.setO("oooo"); 
	      Integer i = (Integer) one.getO(); 
	      
	   }   
	 */
}
