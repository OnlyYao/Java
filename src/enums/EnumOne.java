package enums;

/**
 * ö�����еĹ��췽���ǲ�����public��protected���Σ�ֻ����private����friendly���Ρ� 
 * 
 * ordinal()��������һ��intֵ������ÿһ��enumʵ��������ʱ�Ĵ��򣬴�0��ʼ��
 * valueOf()�������ݸ��������Ʒ�����Ӧ��enumʵ�������������׳��쳣��enum���в������ڸ÷����������ɱ�������ӵľ�̬������
 * 
 * ö�ٳ��˲��ܼ̳��⣬���ǻ����Ͽ��Խ�������һ����ͨ�ĳ�����࣬������������main����.
 * Ϊʲô���ܼ̳����أ�
 * ��Ϊö����Ĭ�ϼ̳���Enum�࣬����Java��֧�ֶ�̳У����ԾͲ��ܼ̳�ֻ��ʵ������
 */
public enum EnumOne {

//	ONE,//����һ��enum��ʵ����ʹ��values()�������Ա���enum��ʵ����
//	TWO,
//	THREE,
	
	/**
	 * һ����˵����ϣ��ÿ��ö��ʵ���ܹ����ض��������������������ֻ��Ĭ�ϵ�toString()ʵ�֣���ֻ�ܷ���ö��ʵ�������ƣ�
	 * Ϊ�ˣ�������ṩһ����������ר�Ÿ���������������Ϣ��Ȼ�����һ���������������������Ϣ��
	 * 
	 * ö�����ʵ��Ĭ����static���͡�
	 * 
	 * java Ҫ������ȶ���enumʵ�����ٶ��巽�������ԡ�
	 */
	Spring(1,"this is spring,beautiful!"),
	SUMMER(2,"this is summer,hot!"),
	FALL(3,"this is fall,beautiful!"),
	WINTER(4,"this is winter,cold!");
	
	private int nums;
	
	private String description;
	
	private EnumOne(int nums,String description) {
		this.nums = nums;
		this.description = description;
	}
	
	public int getNums() {
		return nums;
	}

	public void setNums(int nums) {
		this.nums = nums;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public static void main(String[] args) {
		for (EnumOne enumOne : EnumOne.values()) {
			System.out.print(enumOne.getDescription());
			System.out.println(enumOne.getNums());
		}
	}
}
