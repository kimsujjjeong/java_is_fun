package su;

public class su01 {
public static void main(String[] args) {
	//배열 :같은 자료형의 값 여러 개 저장하는 연속된 공간
		String coffeeRoss="아메리카노";
		String coffeeRachel="모카";
		String coffeesujeong="복숭아";
		String coffeemin="밀크티";
		
		System.out.println(coffeeRoss + "하나");
		System.out.println(coffeeRachel + "하나");
		System.out.println(coffeesujeong + "하나");
		System.out.println(coffeemin + "하나");
		System.out.println("주세여");
		
		// 배열 선언 첫 번째 방법
		String[] coffees = new String[4];
		
		// 두 번째 방법
		//String coffees[] = new String[4];
//		coffees[0]="아메리카노"; // 인덱스는 0부터 시작
//		coffees[1]="모카"; // 인덱스는 0부터 시작
//		coffees[2]="복숭아"; // 인덱스는 0부터 시작
//		coffees[3]="밀크티"; // 인덱스는 0부터 시작
		
		// 세 번쨰 방법
		//String[] coffees = new String[] {"아메리카노","모카","복숭아","밀크티"};
		
		//네번째
		String[] coffees = {"아메리카노","모카","복숭아","밀크티"};
		
		//커피주문
		System.out.println(coffees[0] +"하나");//아메리카노 하나
		System.out.println(coffees[1] +"하나");//라떼 하나
		coffees[2]="에스프레소"; // 값 변경
		System.out.println(coffees[2] +"하나");//복숭아 하나
		System.out.println(coffees[3] +"하나");//밀크티 하나
		System.out.println("주세요");
		

		
		
		
		
}
}
