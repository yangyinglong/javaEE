/*
 *created by yangyinglong at 20180512
 *容器的使用
*/

import java.util.*;
// import Name.*;

public class collection {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		Name one_name = new Name("Yang", "Yinglong");
		System.out.println(one_name.getFristName()+" "+one_name.getLastName()
			+" hashCocd is "+one_name.hashCode());
		// String s = "Yang";
		// System.out.println(s.equals(one_name.getFristName()));
		// System.out.println(s.hashCode());
		// System.out.println(one_name);
		Name other_name = new Name("Yang", "Yinglong");
		System.out.println(other_name.getFristName()+" "+other_name.getLastName()
			+" hashCocd is "+other_name.hashCode());
		System.out.println("other_name equals one_name ? " + other_name.equals(one_name));
		c.add("hello");
		c.add(one_name);
		c.add(new Integer(100));
		// c.remove(one_name);
		System.out.println(c.size());
		System.out.println(c);
	}

}
