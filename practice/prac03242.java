package practice;
class Triangle extends Shape {
	int hyp;
	
	Triangle(int hyp,int x, int y){
		super(x,y);
		this.hyp=hyp;
	}
	int gethyp() {
		return this.hyp;
	}
	void sethyp(int hp) {
		this.hyp=hp;
	}
	void printdata() {
		super.printdata();
		System.out.println("hyp is "+ this.hyp);
	}
	//
	void printmethod() {
		 
	}
	
}
public class prac03242 {
public static void main(String[] args) {
	Shape a = new Triangle(2,3,4); // 묵시적
	
//	System.out.println(a.gethyp()); 이거 안됨 
	
	Triangle t = (Triangle) a; //명시적
	System.out.println(t.gethyp());
}
}
