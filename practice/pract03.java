package practice;


public class pract03 {
public static void main(String[] args) {
	//int a = 3;
	
	//
	
	//int[] arr = {3,6,9,12,15,18,21,24,27,30};
	
	// array length
	//System.out.println("array length"+arr.length);
	
//	int[] even = {2,4,6,8,10,12,14,16,18,20};
//		for(int i =0; i< even.length/3; i++) {
//			System.out.println(even[i]);
//		}
//	

	
	//for(int i =
//		0; i < arr.length; i++ ) {
//	
	double[] arr = {2.5, 1.2, 3.5, 6.8, 2.1, 4.3, 5.5, 3.5, 8.2,3.15};
	 //for(int i=0; i< arr.length; i++) {
		// System.out.println(arr[i]);
	
	 
	 for(int i=arr.length-1; i>=0; i--) {
		 //System.out.println(arr[arr.length-i-1]);
		 if(arr[i] > 4) {
		
		 System.out.println(arr[i]);
	 }	else {
		 
		 System.out.println("값이 적다 꺼져");
	 }
	 }	 
	 

}
}










