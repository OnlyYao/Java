package string;

/**
 * ������ʽ 
 * \\d��ʾһλ����
 * ��ʾһ������֮ǰ�ı��ʽ��ʹ��+������ǲ��� ������һ�����ţ��������һλ���λ���� -?\\d+
 * Pattern��Matcher�Ƚϳ�����������ʽ�������
 */
public class StringRex {

	public static void main(String[] args) {
		System.out.println("-13465".matches("-?\\d+"));
		System.out.println("5689".matches("-?\\d+"));
		System.out.println("+911".matches("-?\\d+"));
	}
	
}
