package su;

public class su02 {
public static void main(String[] args) {
	String[] coffees = {"아메리카노","모카","복숭아","밀크티"};
	
	// 포 반복문 순회
	for(int i=0; i<4; i++) {
	System.out.println(coffees[i] + "하나");
	}
	System.out.println("줘");

	
	// 배열의 길이를 이용한 순회
	for(int i=0; i<coffees.length; i++) {
		System.out.println(coffees[i] + "하나");
		}
		System.out.println("줘");

	
		//each 반복문
		for(String coffe : coffees) {
			System.out.println(coffe+ "하나");
		}
		System.out.println("주세요");
		
		for (String coffee :
			coffees) {
			System.out.println(coffee+"하나");
		}
		System.out.println("주세요");
		
		
}
}
