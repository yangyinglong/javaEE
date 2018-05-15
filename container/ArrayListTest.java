/*
* created by yangyinglong at 20180515
* 学习集合
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeSet;


public class ArrayListTest {
	public static void main(String[] args) {
		// test1
		// ArrayList<Integer> arrayList = new ArrayList<Integer>();
		// arrayList.add(12);
		// arrayList.add(30);
		// arrayList.add(40);
		// arrayList.add(14);
		// arrayList.add(35);
		// arrayList.add(43);
		// System.out.println("通过iterator接口获取容器的迭代器");
		// Iterator<Integer> iterator = arrayList.iterator();
		// while (iterator.hasNext()) {
		// 	Integer value = iterator.next();
		// 	System.out.print(value + " ");
		// }
		// // Integer one = arrayList.get(2);
		// // System.out.print(one);
		// boolean is_add = arrayList.add(10);
		// System.out.println();
		// System.out.println("通过toArray()方法获取容器的数组");
		// Object[] ob = arrayList.toArray();
		// for (int i = 0; i < ob.length; i ++) {
		// 	System.out.print(ob[i] + " ");
		// }
		// System.out.println();

		// test2
		// ArrayList<Student> arrayList = new ArrayList<Student>();
		// arrayList.add(new Student("zhangsan",89.8));
		// arrayList.add(new Student("lisi",90));
		// arrayList.add(new Student("wangwu",60.6));
		// arrayList.add(new Student("wangting",85.6));

		// Iterator<Student> iterator_stu = arrayList.iterator();
		// while (iterator_stu.hasNext()) {
		// 	Student stu_one = iterator_stu.next();
		// 	System.out.println(stu_one);
		// }

		// // System.out.println(arrayList);
		
		// ×××××××××排序×××××××××××
		// Collections.sort(arrayList);
		// for (Student stu: arrayList) {
		// 	System.out.println(stu);
		// }

		// test3
		TreeSet<Student> treeSet = new TreeSet<Student>();
		treeSet.add(new Student("zhangsan",89.8));
		treeSet.add(new Student("lisi",90));
		treeSet.add(new Student("wangwu",60.6));
		treeSet.add(new Student("wangting",85.6));

		System.out.println(treeSet);


		
	}

}

// Comparable接口中的compareTo()方法:
// 凡是需要进行比较排序的类都应该实现Comparable接口中的compareTo()方法；
// 凡是把类对象放到以树为内部结构的容器中都应该实现Comparable接口中的compareTo()方法 test3
// class Student implements Comparable<Student> {
// 	private String name;
// 	private double score;

// 	public Student(String name, double score) {
// 		this.name = name;
// 		this.score = score;
// 	}

// 	public double getScore() {
// 		return this.score;
// 	}

// 	public String toString() {
// 		return this.name + "\t" + this.score;
// 	}

// 	public int compareTo(Student stu) {
// 		if(stu.getScore() > this.score) {
// 			return 1;
// 		} else if (stu.getScore() < this.score) {
// 			return -1;
// 		} else {
// 			return 0;
// 		}
// 	}
// }