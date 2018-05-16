/*
*created by yangyinglong at 20180516
*List接口的学习
*/

import java.util.*;

public class ListTest {
	public static void main(String[] args) {
		List l1 = new LinkedList();
		List l2 = new LinkedList();

		for (int i = 0; i <= 9; i ++ ) {
			l1.add("a"+i);			
		}
		System.out.println(l1);

		//复制 void copy(List dest, List src)  将src拷贝到dest
		//复制的时候，l2的长度size不会改变，所以会抛出越界异常，在复制的时候，要改变l2的长度
		// 它的capacity（容纳能力大小）可以指定（最好指定）。
		// 而初始化时size的大小永远默认为0，只有在进行add和remove等相关操作 时，size的大小才变化。
		// 然而进行copy()时候，首先做的是将desc的size和src的size大小进行比较，
		// 只有当desc的 size 大于或者等于src的size时才进行拷贝，
		// 否则抛出IndexOutOfBoundsException异常
		Collections.addAll(l2, new Object[l1.size()]);
		Collections.copy(l2, l1);
		System.out.println(l2);


		// 随机排列顺序
		Collections.shuffle(l1);
		System.out.println(l1);


		//逆序 void reversee(List)  倒序
		Collections.reverse(l2);
		System.out.println(l2);

		//排序 sort(List)
		Collections.sort(l1);
		System.out.println(l1);

		//求交集
		l1.add("a10");
		l1.add("a11");
		l1.add("a12");
		System.out.println(l1);
		l1.retainAll(l2);
		System.out.println(l1);


		//折半查找 int binarySearch(List, Object) 折半查找
		int index = Collections.binarySearch(l1, "a5");
		System.out.println(index);


		


	}
}