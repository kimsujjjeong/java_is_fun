package practice;
class Person{
	protected String Name;
	protected String Id;
	
	Person(String n, String i){
		this.Name=n;
		this.Id=i;
	}
	
	String getna() {
		return this.Name;
	}
	String geti() {
		return this.Id;
	}
	
	void setna(String nn) {
		this.Name = nn;
	}
	void setid(String ii) {
		this.Id =ii;
	}
	void printmessage() {
		System.out.println("Iamperson");
	}
}


public class prac03241 {
	public static void main(String[] args) {
		Person abc = new Person("수정","1996");
		
		System.out.println(abc.getna());
	}
	
}
