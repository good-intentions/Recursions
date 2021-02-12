package Recursions;

public class zad2 {
	public static void main(String[] args) {
	   	 xMethod(1234567);
	}

	public static void xMethod(int n) {
//	   	 if (n > 0) {
//	   		 System.out.print(n % 10);
//	   		 xMethod(n / 10);
//	   	 }
		
		for(int i=n; i>0; i/=10) {
			System.out.print(i % 10);
		}
	 }


}
