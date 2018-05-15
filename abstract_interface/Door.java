/*
* 定义抽象类门
*/

/*
*抽象类中有构造方法么？ 
*由于抽象类里会存在一些属性，那么抽象类中一定存在构造方法，其存在目的是为了属性的初始化。 
*并且子类对象实例化的时候，依然满足先执行父类构造，再执行子类构造的顺序。
*抽象类可以用final声明么？ 
*不能，因为抽象类必须有子类，而final定义的类不能有子类；
*/


abstract class Door {
	public String order;

	public Door(String order) {
		this.order = order;
	}

	String getOrder() {
		return this.order;
	}

	abstract void close();

	void open() {}
}