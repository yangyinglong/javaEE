/*
*created by yangyinglong at 20180516 
*Map接口的学习
*/

import java.util.*;

public class MapTest {
	public static void main(String[] argv) {
		Map m1 = new HashMap();
		Map m2 = new TreeMap();

		// V put(K key, V value) 将指定的值与此映射中的指定键关联（可选操作）
		m1.put("one", new Integer(1));
		m1.put("two", new Integer(2));
		m1.put("three", new Integer(3));
		// m1.put("four", new Integer(3));

		m2.put("A", new Integer(1));
		m2.put("B", new Integer(2));
		m2.put("C", new Integer(3));

		//int size() 返回映射关系数
		System.out.print("HashMap m1 的长度: ");
		System.out.println(m1.size());

		Map m3 = new HashMap(m1);
		Map m4 = new TreeMap();
		m4.put("one", new Integer(1));
		m4.put("two", new Integer(2));
		m4.put("three", new Integer(3));

		// void	putAll(Map<? extends K,? extends V> m) 
		// 从指定映射中将所有映射关系复制到此映射中（可选操作）。
		m4.putAll(m2);
		System.out.println("m4 putAll(m2)之后, m4: " + m4);
		System.out.print("复制m1的映射到m3，m3为: ");
		System.out.println(m3);

		// int hashCode() 返回此映射的哈希码值。
		int m1_hashCode = m1.hashCode();
		int m2_hashCode = m2.hashCode();
		int m3_hashCode = m3.hashCode();
		int m4_hashCode = m4.hashCode();
		System.out.println("hashCode: m1="+m1_hashCode+" m2="+m2_hashCode+" m3="+m3_hashCode
			+" m4="+m4_hashCode);
		// hashCode: m1=110564946 m2=192 m3=110564946 m4=110565138
		// 可以看出m1 + m2 = m4，因为m4中的映射包含m1和m2的映射

		//boolean equals(Object o) 判断两个映射Map是否相同
		boolean is_equals_m1_m3 = m1.equals(m3);
		System.out.println(is_equals_m1_m3);
		boolean is_equals_m1_m4 = m1.equals(m4);
		System.out.println(is_equals_m1_m4);

		// Collection<V> values() 返回此映射中包含的值的 Collection 视图
		Collection collection = m2.values();
		System.out.println(collection);

		// Set<K> keySet() 返回此映射中包含的键的 Set 视图。
		Set set_key = m1.keySet();
		System.out.println(set_key);
		//Set的iterator()方法
		Iterator iter = set_key.iterator();
		while (iter.hasNext()) {
			Object key = iter.next();
			 // V get(Object key) 返回指定键所映射的值；如果此映射不包含该键的映射关系，则返回 null。
			System.out.println(key + ": " + m1.get(key));
		}

		// boolean containsKey(Object key) 如果此映射包含指定键的映射关系，则返回 true。
		boolean is_containsKey_one = m1.containsKey("one");
		System.out.println("m1 是否包含 one 这个键的映射: " + is_containsKey_one);

		// boolean	containsValue(Object value) 如果此映射将一个或多个键映射到指定值，则返回 true。
		boolean is_containsValue_1 = m1.containsValue(new Integer(1));
		System.out.println("m1 是否包含 1 这个值的映射: " + is_containsValue_1);

		// Set<Map.Entry<K,V>> entrySet()  返回此映射中包含的映射关系的 Set 视图，修改Set会改变Map。
		Set map_to_set = m1.entrySet();
		System.out.println("Map.entrySet()之后的map_to_set:" + map_to_set);
		// map_to_set.clear(); 
		System.out.println("执行map_to_set.clear()之后的map_to_set: " + map_to_set);
		System.out.println("执行map_to_set.clear()之后的m1        : " + m1);

		// V remove(Object key) 如果存在一个键的映射关系，则将其从此映射中移除（可选操作）。
		Object return_value = (Integer)m2.remove("A");
		System.out.println("key为A的映射被remove,返回值value为: " + return_value);

	}
}