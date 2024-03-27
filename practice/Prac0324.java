package practice;
class Student extends Person{

	
	private String Major;
	static int studentCount; 
	
	Student(String n, String id, String m){
		super(n, id);
		this.Major=m;
	}
	String getma() {
		return this.Major;
	}
	void setma(String m) {
		this.Major=m;
	}
	
	void printmessage() {
		super.printmessage();
		System.out.println("I am student");
	}
	
}

public class Prac0324 {
public static void main(String[] args) {
	Person s=new Student("su","960823","music");
	
	Student s1 = (Student) s;
	
	System.out.println(s1.getma());
	
	
	//System.out.println(Student.studentCount);
	
	

}
}
