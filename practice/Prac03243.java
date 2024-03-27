package practice;
abstract class Shape{
	protected int x;
	protected int y;
	
	abstract void printmethod();
	Shape(int xx, int yy){
		this.x=xx;
		this.y=yy;
	}
	int getx() {
		return this.x;
	}
	int gety() {
		return this.y;
	}
	void setx(int xx) {
		this.x=xx;
	}
	void sety(int yy) {
		this.y=yy;
	}
	void printdata() {
		System.out.println("x is "+this.x);
		System.out.println("y is "+this.y);
	}
}


public class Prac03243 {
	public static void main(String[] args) {
	Shape s = new Shape();
}
}
