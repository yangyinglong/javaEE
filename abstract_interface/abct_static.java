/*
* created by yangyinglong at 20180515
* 抽象类中的static使用
*/


/*
*抽象类中有构造方法么？ 
*由于抽象类里会存在一些属性，那么抽象类中一定存在构造方法，其存在目的是为了属性的初始化。 
*并且子类对象实例化的时候，依然满足先执行父类构造，再执行子类构造的顺序。
*/
public class abct_static {
	public static void main(String[] args) {
		Man.Student stu = new BadStudent("Mike", 20);
		stu.sleep();
		stu.learn();
		//此时取得抽象类对象的时候完全不需要知道B类这个子类的存在
		Man hidden_man = Man.getInstance();
		hidden_man.sleep();
	}
}

/*
// error
// abct_static.java:20: 错误: 此处不允许使用修饰符static
// static abstract class Man {
//                 ^
// 1 个错误

static abstract class Man {
	protected String name;
	protected int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void print() {
		System.out.println(this.name + " is " + age + "years old");
	}

	public abstract void sleep();
}

class Student extends Man {
	public Student(String name, int age) {
		super(name, age);
	}

	public void sleep() {
		System.out.println("sleep...");
	}
}
*/

abstract class Man {
	protected String name;
	protected int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	abstract public void sleep();



	static class Student extends Man{
		
		public Student(String name, int age) {
			super(name, age);
		}

		public void sleep() {
		System.out.println("bad student is sleeping...");
	}

		public void learn() {
			System.out.println("bad student never learn...");
		}
	}
	//这个方法不受实例化对象的控制
	public static Man getInstance(){
        return new Student("xiaoming", 21);
    }
}

class BadStudent extends Man.Student {
	public BadStudent(String name, int age) {
		super(name, age);
	}

	public void sleep() {
		System.out.println("bad student is sleeping...");
	}

	public void learn() {
		System.out.println("bad student never learn...");
	}
}