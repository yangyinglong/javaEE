package cn.hdu.yang;

public class Person extends Animal {
	private int id;
	private int age;
	private Animal pet;

	public Person() {
		super("PersonKing");
		this.id = 0;
		this.age = 0;
		this.pet = null;
	}


	public Person(String name, int id, int age) {
		super(name);
		this.id = id;
		this.age = age;
		this.pet = null;
	}

	public Person(String name, int id, int age, Animal pet) {
		super(name);
		this.id = id;
		this.age = age;
		this.pet = pet;
	}

	public void	setId(int id) {
		this.id = id;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPet(Animal pet) {
		this.pet = pet;
	}

	public int getId() {
		return this.id;
	}

	public int getAge() {
		return this.age;
	}

	public Animal getPet() {
		return this.pet;
	}



	public void petEnjoy() {
		pet.enjoy();
	}



	public void cry() {
		System.out.println("hello,world");
	}
}