package string;

/**
 * String �����ǲ��ɱ�ģ��鿴Դ����Կ���̤ʵ������Ϊfinal����
 * ��String�ķ������Կ��������ı��ַ���������ʱ��String���᷵��һ���µĶ������û�иı䣬String����ֻ��ָ��ԭ��������ö���
 * java����һ��ר�Ŵ����ʽ�����ࣺFormatter
 * String��Ҳ��ר�Ŵ����ʽ�����࣬format().�����÷������ڲ�ʵ��ʹ�õ�Ҳ��Formatter��
 */
public class Immutable {

	public static String upCase(String s) {
		return s.toUpperCase();
	}
	
	public static void main(String[] args) {
		String q = "abc";
		System.out.println(q);
		String qq = upCase(q);
		System.out.println(qq);
		System.out.println(q);
		
		StringBuilder sBuilder = new StringBuilder();
		sBuilder.append("dfgh");
		System.out.println(sBuilder.reverse());
		
		//��ʽ�����
		int x = 5;
		double y = 23.3;
		System.out.println("Row 1: [" + x +" " + y + "]");
		System.out.format("Row 1: [%d %f]\n",x, y);
		System.out.printf("Row 1: [%d %f]\n",x, y);
		
		//String��format����
		int sx = 23;
		int sy = 54;
		String name = "tom";
		String s = String.format("%s spend $%d,and now he has $%d", name,sx,sy);
		System.out.println(s);
	}
}
