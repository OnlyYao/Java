package collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Breeze
 * 
 * 容器：存储对象的盒子。
 * wiki：
 *  1、当你指定了某种类型作为泛型参数时，你并不局限于只能将该种类型的对象放置到容器中，还可以将其子类放置到容器中。
 *	2、使用接口的目的在于如果你想修改你的实现，你只需要在创建它的地方修改即可（这也是为什么要创建接口的原因之一），因此你应该创建一个具体类的对象，将其向上转型为对应的接口
 *	然后在其余的代码中都使用这个接口。(实际上是实例对象的引用)
 *
 * List:ArrayList、LinkedList。ArrayList随机访问元素的速度较快，插入和删除的速度较慢，LinkedList相反。（List是可修改的序列）
 * （各种Queue以及栈的行为，由LinkedList提供支持）
 * 
 * Set:HashSet、TreeSet、LinkedHashSet。HashSet获取元素的速度最快且无序（使用了散列），TreeSet按照比较结果的升序保存对象（元素存储在红黑树数据结构中），LinkedHashSet按照添加顺序保存对象（使用的散列）
 * Map:HashMap、TreeMap、LinkedHashMap。保存方式（或者查询速度）同Set.
 * 
 * 迭代器：Iterator,遍历并选择容器中的对象。ListIterator是Iterator的子类，专门用于各种List类的访问。
 * 
 * 栈：Stack，后进先出的容器。
 * 
 * 队列：Queue，先进先出的容器。
 */
//练习1
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
