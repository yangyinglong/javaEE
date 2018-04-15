public class Dog {
	private int color;
	private int height;

	public Dog(int color, int height) {
		this.color = color;
		this.height = height;
	}

	public void setColor(int color) {
		this.color = color;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getColor() {
		return this.color;
	} 

	public int getHeight() {
		return this.height;
	}

	public void displayColor(){
		System.out.println(this.color);
	}

	public void displayHeight() {
		System.out.println(this.height);
	}

	public static void main(String[] args) {
		Dog dog = new Dog(111, 222);
		dog.displayColor();
		Cat cat = new Cat();
		cat.setHeight(10);
		cat.printHeight();
		
	}
}

class Cat{
	int color;
	int height;

	public void	setHeight(int height) {
		this.height = height;
	}
	public void printHeight() {
		System.out.println(height);
	}
}