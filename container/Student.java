// Comparable接口中的compareTo()方法:
// 凡是需要进行比较排序的类都应该实现Comparable接口中的compareTo()方法；
// 凡是把类对象放到以树为内部结构的容器中都应该实现Comparable接口中的compareTo()方法 test3


// 1、凡是把类对象放到容器中，相应的类都应该实现Object类中的toString()方法； 
// 2、凡是需要进行比较排序的类都应该实现Comparable接口中的compareTo()方法；
// 凡是把类对象放到以树为内部结构的容器中都应该实现Comparable接口中的compareTo()方法 
// 3、凡是把类对象放到以哈希表为内部存储结构的容器中，相应的类必须要实现equals方法和hashCode方法，
// 这样才符合哈希表真实的逻辑功能. 
// 4、逻辑上来讲，只要两个对象的内容相同，其地址(hashCode()返回值)以及这两个对象就应该相同(equals())。

public class Student implements Comparable<Student> {
	private String name;
	private double score;

	public Student(String name, double score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public double getScore() {
		return this.score;
	}

	public String toString() {
		return this.name + "\t" + this.score;
	}

	public int compareTo(Student stu) {
		if(stu.getScore() > this.score) {
			return 1;
		} else if (stu.getScore() < this.score) {
			return -1;
		} else {
			return 0;
		}
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student)obj;
			return this.getName().equals(stu.getName());
		}
		return super.equals(obj);
	}

	public int hashCode() {
		return (int)(this.getName().hashCode()*this.getScore());
	}
}