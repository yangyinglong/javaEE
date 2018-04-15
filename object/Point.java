public class Point {
	private double x;
	private double y;
	private double z;

	public Point(){
		this.x = this.y = this.z = 0;
	}

	public Point(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public Point(Point p) {
		this.x = p.getX();
		this.y = p.getY();
		this.z = p.getZ();
	}

	public void setX(double x) {
		this.x = x;
	}

	public void	setY(double y) {
		this.y = y;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	public double getZ() {
		return this.z;
	}

	public void	displayPoint() {
		System.out.println("("+getX()+", "+getY()+", "+getZ()+")");
	}

	public double getRange() {
		double range;
		range = this.x * this.x + this.y * this.y + this.z * this.z;
		return range;
	}

	public double getRange(Point p) {
		double xRange = p.getX() - this.x;
		double yRange = p.getY() - this.y;
		double zRange = p.getZ() - this.z;
		double range = xRange*xRange + yRange*yRange + zRange*zRange;
		return range;
	}

	public double getRange(double x, double y, double z) {
		double range;
		double xRange = this.x - x;
		double yRange = this.y - y;
		double zRange = this.z - z;
		range = xRange*xRange + yRange*yRange + zRange*zRange;
		return range;

	}

	public static void print() {
		System.out.println("hello, world");
	}


	public static void main(String[] args) {
		final double PI = 3.14;
		Point.print();
		Sphere.print();
		Point p1 = new Point(3.0, 4.0, 5.0);
		p1.displayPoint();
		Point p2 = new Point(p1);
		p2.displayPoint();
		p2.setX(4.0);
		p2.displayPoint();
		double range1 = p1.getRange();
		System.out.println(range1);
		double range2 = p1.getRange(p2);
		System.out.println(range2);
		double range3 = p1.getRange(1, 1, 1);
		System.out.println(range3);

		Sphere s1 = new Sphere();
		Sphere s2 = new Sphere(p2, 4);
		s1.displaySphere();
		s1.addRadius();
		s1.displaySphere();
		System.out.println(s1.getVolume());
		System.out.println(s1.isInVolume(p1));
		System.out.println(s1.isInVolume(0,0,0));
		Sphere.print();



		
	}
}

class Sphere {
	public static int sid = 0;
	private Point o;
	private double radius;

	public Sphere() {
		this.o = new Point(0, 0, 0);
		this.radius = 1;
		this.sid = this.sid + 1;
	}

	public Sphere(Point o) {
		this.o = o;
		this.radius = 1;
		this.sid = this.sid + 1;
	}

	public Sphere(double radius) {
		this.o = new Point(0, 0, 0);
		this.radius = radius;
		this.sid = this.sid + 1;
	}

	public Sphere(Point o, double radius) {
		this.o = o;
		this.radius = radius;
		this.sid = this.sid + 1;
	}

	public Sphere(Sphere sphere) {
		this.o = sphere.getO();
		this.radius = sphere.getRadius();
		this.sid = this.sid + 1;
	}

	public Point getO() {
		return this.o;
	}

	public double getRadius() {
		return this.radius;
	}

	public void setO(Point o) {
		this.o = o;
	}

	public void setO() {
		this.o = new Point();
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getVolume() {
		return 3 * 3.14 * this.getRadius() / 4;
	}

	public Sphere addRadius() {
		this.radius = this.radius + 1;
		return this;
	}

	public void displaySphere() {
		System.out.println("(" + this.o.getX() + ", " + this.o.getY() + ", " + this.o.getZ() + ")" + "radius = " + this.radius);
		this.sid = 10;
	}

	public boolean isInVolume(Point p) {
		double range = this.o.getRange(p);
		return range < this.radius*this.radius ? true : false;
	}

	public boolean isInVolume(double x, double y, double z) {
		double range = this.o.getRange(x, y, z);
		return range < this.radius*this.radius ? true : false;
	}

	public static void print() {
		System.out.println("hello,world");
		System.out.println(sid);

	}

}