package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Breeze
 * 
 * �������洢����ĺ��ӡ�
 * wiki��
 *  1������ָ����ĳ��������Ϊ���Ͳ���ʱ���㲢��������ֻ�ܽ��������͵Ķ�����õ������У������Խ���������õ������С�
 *	2��ʹ�ýӿڵ�Ŀ��������������޸����ʵ�֣���ֻ��Ҫ�ڴ������ĵط��޸ļ��ɣ���Ҳ��ΪʲôҪ�����ӿڵ�ԭ��֮һ���������Ӧ�ô���һ��������Ķ��󣬽�������ת��Ϊ��Ӧ�Ľӿ�
 *	Ȼ��������Ĵ����ж�ʹ������ӿڡ�(ʵ������ʵ�����������)
 *
 * List:ArrayList��LinkedList��ArrayList�������Ԫ�ص��ٶȽϿ죬�����ɾ�����ٶȽ�����LinkedList�෴����List�ǿ��޸ĵ����У�
 * ������Queue�Լ�ջ����Ϊ����LinkedList�ṩ֧�֣�
 * 
 * Set:HashSet��TreeSet��LinkedHashSet��HashSet��ȡԪ�ص��ٶ����������ʹ����ɢ�У���TreeSet���ձȽϽ�������򱣴����Ԫ�ش洢�ں�������ݽṹ�У���LinkedHashSet�������˳�򱣴����ʹ�õ�ɢ�У�
 * Map:HashMap��TreeMap��LinkedHashMap�����淽ʽ�����߲�ѯ�ٶȣ�ͬSet.
 * 
 * ��������Iterator,������ѡ�������еĶ���ListIterator��Iterator�����࣬ר�����ڸ���List��ķ��ʡ�
 * 
 * ջ��Stack������ȳ���������
 * 
 * ���У�Queue���Ƚ��ȳ���������
 */
//��ϰ1
public class Gerbil {

	private int gerbilNumber;
	 
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	} 
	
	public void hop() {
		System.out.println(gerbilNumber);
	}
	
	public static void main(String[] args) {
		List<Gerbil> gerbils = new ArrayList<>();
		gerbils.add(new Gerbil(1));
		gerbils.add(new Gerbil(2));
		gerbils.add(new Gerbil(3));
		for (Gerbil gerbil : gerbils) {
			gerbil.hop();
		}
	}
}
