package su;

public class sj04 {
public static void main(String[] args) {
	//다차원 배열 순회
	String[][] seats = new String[][] {
	{"A1","A2","A3","A4","A5"},
	{"B1","B2","B3","B4","B5"},
	{"C1","C2","C3","C4","C5"}
};

System.out.println("--------------------");

String[][] seats2 = {	
		{"A1" ,"A2", "A3" }
		{"B1","B2", "B3", "B4"}
		{"C1", "C2", "C3", "C4", "C5"}
};

for(int i=0; i<seats2.length; i++) {// 세로
	for (int j=0; j< seats2[i].length; j++) {//가로
		System.out.println(seats[i][j] + " ");
	}
	System.out.println();

}
}
