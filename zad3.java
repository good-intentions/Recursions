package Recursions;

public class zad3 {
	
	public static void main(String[] args) {
	   	 System.out.println(stepen(5) + " = " + stepen2(5));
	}
	
	public static int stepen(int n) {
		if(n==1) {
			return 2;
		}
		else return 2*stepen(n-1);
	}
	
	public static int stepen2(int n) {
		int sum = 1;
		for(int i =0; i<n ; i++) {
			sum*=2;
		} return sum;
	}

}
