package cn.hdu.yang;

public class Animal {
	private String name;

	public Animal(){
		this.name = "king";
	}

	public Animal(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}


	public void cry() {
		System.out.println("...");
	}

	public void enjoy() {
		this.cry();
	}
}

