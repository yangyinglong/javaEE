/*
*created by yangyinglong at 20180515
*学习hashmap
*/

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;


public class HashMapTest {
	public static void main(String[] args) {
		// test1
		// HashMap<String, Double> hashMap = new HashMap<String, Double>();
		// hashMap.put("zhangsan", 96.0);
		// hashMap.put("lisi", 88.6);
		// hashMap.put("wangwu", 98.6);
		// hashMap.put("wangting",  87.5);
		// hashMap.put("zhangsan", 96.0);
		// hashMap.put("lisi", 88.6);
		// hashMap.put("wangwu", 98.6);
		// hashMap.put("wangting",  87.5);
		// System.out.println(hashMap);

		// Set<String> keySet = hashMap.keySet();
		// System.out.println("hashMap key: " + keySet);
		// Iterator<String> iterator = keySet.iterator();
		// while (iterator.hasNext()) {
		// 	String key = iterator.next();
		// 	System.out.println(key + "\t" + hashMap.get(key));
			
		// }

		// test2
		// HashMap<Student, String> hashMap_1 = new HashMap<Student, String>();
		// hashMap_1.put(new Student("zhangsan",88.8), "beijing");
		// hashMap_1.put(new Student("lisi",88.8), "beijing");
		// hashMap_1.put(new Student("wangwu",66.9), "beijing");
		// hashMap_1.put(new Student("zhangsan",88.8), "beijing");
		// hashMap_1.put(new Student("lisi",88.8), "beijing");
		// hashMap_1.put(new Student("wangwu",66.9), "beijing");
		// Set<Student> keySet_1 = hashMap_1.keySet();
		// System.out.println(keySet_1);
		// Iterator<Student> iterator_1 = keySet_1.iterator();
		// while (iterator_1.hasNext()) {
		// 	Student key = iterator_1.next();
		// 	System.out.println(key + "\t" + hashMap_1.get(key));
		// }
		// System.out.println("没有重写equels和hashCode()这两个方法，相同的对象不会覆盖");
		// System.out.println(hashMap_1);
		// print {lisi	88.8=beijing, lisi	88.8=beijing, wangwu	66.9=beijing, zhangsan	88.8=beijing, zhangsan	88.8=beijing, wangwu	66.9=beijing}



		// test3
		// 在Student.java中增加equals()和hashCode()方法
		// public boolean equals(Object obj) {
		// 	if (obj instanceof Student) {
		// 		Student stu = (Student)obj;
		// 		return this.getName().equals(stu.getName());
		// 	}
		// 	return super.equals(obj);
		// }
		// public int hashCode() {
		// 	return (int)(this.getName().hashCode()*this.getScore());
		// }
		
		HashMap<Student, String> hashMap_2 = new HashMap<Student, String>();
		hashMap_2.put(new Student("zhangsan",88.8), "beijing");
		hashMap_2.put(new Student("lisi",88.8), "beijing");
		hashMap_2.put(new Student("wangwu",66.9), "beijing");
		hashMap_2.put(new Student("zhangsan",88.8), "beijing");
		hashMap_2.put(new Student("lisi",88.8), "beijing");
		hashMap_2.put(new Student("wangwu",66.9), "beijing");
		Set<Student> keySet_1 = hashMap_2.keySet();
		System.out.println(keySet_1);
		Iterator<Student> iterator_1 = keySet_1.iterator();
		while (iterator_1.hasNext()) {
			Student key = iterator_1.next();
			System.out.println(key + "\t" + hashMap_2.get(key));
		}
		System.out.println("重写equels和hashCode()这两个方法，相同的对象会覆盖");
		System.out.println(hashMap_2);
		print {zhangsan	88.8=beijing, wangwu	66.9=beijing, lisi	88.8=beijing}



	}
}

// 凡是把类对象放到以哈希表为内部存储结构的容器中，
// 相应的类必须要实现equals方法和hashCode方法，这样才符合哈希表真实的逻辑功能. 