package cn.hdu.yang;

public class Cat extends Animal{
	private int furColor;

	public Cat() {
		super();
		this.furColor = 0;
	}

	public Cat(int furColor) {
		super("catKing");
		this.furColor = furColor;
	}

	public Cat(String name) {
		super(name);
		this.furColor = 0;
	}

	public Cat(String name, int furColor) {
		super(name);
		this.furColor = furColor;
	}

	public void	setFurColor(int furColor) {
		this.furColor = furColor;
	}

	public int getFurColor() {
		return this.furColor;
	}

	public void cry() {
		System.out.println("miao...miao...miao...");
	}
	
}