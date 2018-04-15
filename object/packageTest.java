//package cn.hdu.yang;

import cn.hdu.yang.*;


public class packageTest {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat("smartWhite", 1);
		Person tom = new Person("tom", 101, 20, cat);


		cat.enjoy();
		dog.enjoy();

		tom.getPet().enjoy();
		System.out.println(((Cat)(tom.getPet())).getFurColor());
	}
}